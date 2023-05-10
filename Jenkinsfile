pipeline {
  agent any
  stages {
    stage('Init') {
      steps {
        echo 'Hello World'
        git(url: 'https://github.com/pgorzkowicz/demo.git', branch: 'main')
      }
    }

    stage('Hello') {
      steps {
        echo 'Hello World'
      }
    }

    stage('Checkout') {
      steps {
        git(url: 'https://github.com/pgorzkowicz/demo.git', branch: 'main')
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }

  }
}