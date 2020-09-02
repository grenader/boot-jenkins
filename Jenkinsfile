pipeline {
    agent {
        docker { image 'openjdk:11.0' }
    }

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Initialize'){
            steps {
                env.PATH = "myDocker/bin:${env.PATH}"
            }
        }

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
