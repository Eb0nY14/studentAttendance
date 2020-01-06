pipeline {
    agent any 
    stages {
		
        stage('Build') { 
            steps {
                bat 'javac -cp "lib/*" Student.java studentTest.java'
            }
        }
		
	stage('Test') {
      		junit '**/target/surefire-reports/TEST-*.xml'
      		archiveArtifacts 'target/*.jar'
   	}  
    }
 }       

