pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    environment {
        IMAGE_NAME = "kiruthikadocker/finsecure-pay"
        IMAGE_TAG = "v${BUILD_NUMBER}"
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
                echo 'Security Scan Placeholder'
            }
        }

        stage('Container Build') {
            steps {
                echo 'Docker Build Placeholder'
            }
        }

        stage('Push') {
            steps {
                echo 'Docker Push Placeholder'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Kubernetes Deploy Placeholder'
            }
        }
    }
}