pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
  environment {
    Dev = 'Dev'
  }
}