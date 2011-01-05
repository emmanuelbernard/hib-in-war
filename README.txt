Hib-in-war
==========
Project that test the deployment of a war with Hibernate jars in it.
On JBoss AS 6.0.0.Final, the project deploys fine when hibernate-validator
and hibernate-entitymanager are in <scope>provided</scope> (see pom.xml).
When the <scope> elements are commented out, it fails.

Build the project
-----------------
mvn clean package (tested with Maven 3)

Deploy the project
-------------------
Deploy in $JBOSS_HOME/server/default/deploy

Test the projet
===============
Check the console, it fails at deployment

The code is called by
curl http://localhost:8080/hib-in-war-1.0-SNAPSHOT/incoming