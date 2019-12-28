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
		stage('Test') { 
            steps {
                bat '''javac -cp junit-4.13-beta-1.jar;studentTest.java 
                java -cp junit-4.13-beta-1.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore studentTest
                '''
            }
        }
        
    }
}