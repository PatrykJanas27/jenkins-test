pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('Docker-Compose-Up') {
            steps {
                sh "docker-compose -f docker-composeDev.yaml up --detach"
            }
        }
    }
}