pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'javac GreatestOfThree.java TestGreatest.java'
            }
        }
        stage('Test') {
            steps {
                bat 'java TestGreatest'
            }
        }
        stage('Create Docker Image') {
            steps {
                bat '"C:\\Users\\HP\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" build -t greatest-java-app .'
            }
        }
        stage('Start and Stop Container') {
    steps {
        bat '"C:\\Users\\HP\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" rm -f my-java-container || exit 0'
        bat '"C:\\Users\\HP\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" run --name my-java-container greatest-java-app'
        bat '"C:\\Users\\HP\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" ps -a'
        bat '"C:\\Users\\HP\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" stop my-java-container || exit 0'
        bat '"C:\\Users\\HP\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" rm -f my-java-container'
    }
}
    }
}
