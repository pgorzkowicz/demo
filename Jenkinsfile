pipeline {
  agent any
  stages {
    stage('Hello') {
      steps {
        echo 'Hej Infoshare'
      }
    }

    stage('Clone') {
      steps {
        git(url: 'https://github.com/pgorzkowicz/demo', branch: 'main')
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }

  }
}