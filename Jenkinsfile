#!groovy
pipeline {
    agent none
    stages {
        stage('Build') {
           agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps {
                echo 'Building'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }

        stage('Push'){
            agent any
            steps{
                echo 'Push images...'
                sh 'bash buildImg.sh gateway 1.1'
            }
        }
    }
}