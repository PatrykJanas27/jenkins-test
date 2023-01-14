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
                sh "COMPOSE_HTTP_TIMEOUT=300"
                echo "$COMPOSE_HTTP_TIMEOUT"
                sh "docker-compose up --detach --build"
            }
        }
    }
}