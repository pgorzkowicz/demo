pipeline {
  agent any
  stages {
    stage('Hello') {
      steps {
        echo 'hej'
      }
    }

    stage('clone') {
      steps {
        git(url: 'https://github.com/pgorzkowicz/demo/', branch: 'main')
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

  }
}