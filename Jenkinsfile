pipeline {
    agent {
        docker { image 'cloudbees/java-with-docker-client' }
    }

    triggers {
        pollSCM '* * * * *'
    }
    stages {

        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
