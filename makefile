spotbugs:
	mvn package
	java -jar ${SPOTBUGS_HOME}/lib/spotbugs.jar -textui ${P_TARGET_JAR} | tee target/spotsbugs.txt
pmd.json:
	${PMD_HOME}/bin/run.sh pmd -d ${P_SOURCE_DIR} -R rulesets/java/quickstart.xml -f json | tee target/pmd.json | jq
pmd.text:
	${PMD_HOME}/bin/run.sh pmd -d ${P_SOURCE_DIR} -R rulesets/java/quickstart.xml -f text