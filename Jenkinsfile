pipeline {
    agent any 
    stages {
        stage('Fetch') { 
            steps {
				git url:'https://github.com/Eb0nY14/studentAttendance'
           }
        }
        stage('Build') { 
            steps {
                bat 'javac Student.java'
            }
        }
		
        
    }
}