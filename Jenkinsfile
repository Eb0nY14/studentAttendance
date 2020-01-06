pipeline {
    agent any
    
    tools {
    	maven 'Maven3.6.3'
    	jdk 'JAVA_HOME'
    } 
    stages {
		
        stage('Build') { 
            steps {
                bat 'mvn clean compile'
            }
        }
		
		stage('Test') {
	      	steps {
	      	   bat 'mvn test'
	      	}
	   	}  
    }
 }       

