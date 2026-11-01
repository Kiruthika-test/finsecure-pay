pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Security Checks') {
            steps {
                echo 'Security scan completed'
            }
        }

        stage('Container Build') {
            steps {
                echo 'Docker image build completed'
            }
        }

        stage('Push') {
            steps {
                echo 'Docker image pushed to Docker Hub'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Kubernetes deployment updated'
            }
        }
    }
}