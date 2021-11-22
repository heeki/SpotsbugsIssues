##  Spotbugs Issues
The repository below reproduces issues identified with Spotbugs. 
* False negative on VA_FORMAT_STRING_USES_NEWLINE [#1501](https://github.com/spotbugs/spotbugs/issues/1501)
* False negatives on RV_01_TO_INT [#1518](https://github.com/spotbugs/spotbugs/issues/1518)

## Execute Spotbugs Assemblies
Setup the `etc/environment.sh` configuration as follows:

```bash
BASE_DIR=[your_base_directory]
SPOTBUGS_HOME=${BASE_DIR}/spotbugs-4.5.0
SPOTBUGS_SNAPSHOT=${BASE_DIR}/spotbugs-4.5.1-SNAPSHOT
PMD_HOME=${BASE_DIR}/pmd-bin-6.40.0

P_TARGET_JAR=target/SpotbugsIssues-1.0-SNAPSHOT.jar
P_SOURCE_DIR=src
```

After setting up the environment file, you can execute `make snapshot` to package your application and run the locally compiled and assembled Spotbugs artifact for analyzing your jar file.

## Spotbugs Output
```bash
M B FS: Format string should use %n rather than \n in cloud.heeki.Issue1501.warnsOnIssue()  At Issue1501.java:[line 7]
H C RV: cloud.heeki.Issue1518.warnsOnIssue() uses generates a random value from 0 to 1 and then coerces that value to the integer 0  At Issue1518.java:[line 12]
```

## PMD Output
```bash
# pmd-bin-6.40.0/bin/run.sh pmd -d src -R rulesets/java/quickstart.xml -f text
Nov 21, 2021 7:07:29 PM net.sourceforge.pmd.PMD encourageToUseIncrementalAnalysis
WARNING: This analysis could be faster, please consider using Incremental Analysis: https://pmd.github.io/pmd-6.40.0/pmd_userdocs_incremental_analysis.html
#
```

