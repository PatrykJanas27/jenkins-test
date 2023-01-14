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
                echo "COMPOSE_HTTP_TIMEOUT=300 docker-compose up --detach --build"
            }
        }
    }
}