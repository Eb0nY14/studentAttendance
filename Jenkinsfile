pipeline {
    agent any 
    stages {
		
        stage('Build') { 
            steps {
                bat 'javac -cp "lib/*" Student.java studentTest.java'
            }
        }
		
	stage('Test') {
	    steps {
	    	bat 'java studentTest'
	    }
	}   
    }
 }       

