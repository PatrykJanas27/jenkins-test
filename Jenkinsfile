pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn test"
            }
        }
        stage('Docker-Compose-Up') {
            steps {
                sh "docker-compose -f docker-composeDev.yaml up"
            }
        }
        stage('Deploy-Production') {
            steps {
                // Run Maven on a Unix agent.
                echo "production deploying"
            }
        }
    }
}
