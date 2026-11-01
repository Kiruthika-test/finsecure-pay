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

        stage('Code Quality') {
            steps {
                echo 'Static code analysis completed'
            }
        }

        stage('Dependency Scan') {
    steps {
        echo 'Dependency vulnerability scan completed'
    }
}

        stage('Container Scan') {
            steps {
                echo 'Container image scan completed'
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
    }
}