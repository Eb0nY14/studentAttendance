pipeline {
    agent any 
    stages {
	
        stage('Fetch') { 
            steps {
				git branch: 'master', url:'https://github.com/Eb0nY14/studentAttendance'
           }
        }
		
        stage('Build') { 
            steps {
                bat 'javac net/codejava/Student.java'
            }
        }
		
		   
    }
 }       

