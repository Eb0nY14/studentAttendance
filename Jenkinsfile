pipeline {
    agent any
    
    tools {
    	maven 'Maven3.6.3'
    	jdk 'JAVA_HOME'
    } 
    stages {
	    
	  stage('Fetch') { 
              steps {
		   git url:'https://github.com/Eb0nY14/studentAttendance'
            }
        }
		
        stage('Build') { 
            steps {
                bat 'mvn clean compile'
            }
        }
		
		
    }
 }       

