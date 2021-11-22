##  Spotbugs Issues
The repository below reproduces issues identified with Spotbugs. 
* False negative on VA_FORMAT_STRING_USES_NEWLINE [#1501](https://github.com/spotbugs/spotbugs/issues/1501)
* False negatives on RV_01_TO_INT [#1518](https://github.com/spotbugs/spotbugs/issues/1518)

## PMD Output
```bash
# pmd-bin-6.40.0/bin/run.sh pmd -d src -R rulesets/java/quickstart.xml -f text
Nov 21, 2021 7:07:29 PM net.sourceforge.pmd.PMD encourageToUseIncrementalAnalysis
WARNING: This analysis could be faster, please consider using Incremental Analysis: https://pmd.github.io/pmd-6.40.0/pmd_userdocs_incremental_analysis.html
#
```

