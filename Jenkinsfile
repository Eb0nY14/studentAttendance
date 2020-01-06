pipeline {
    agent any
    
    tools {
    	maven 'Maven3.6.3'
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

