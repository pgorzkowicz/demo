pipeline {
  agent any
  stages {
    stage('hej') {
      steps {
        echo 'hej'
      }
    }

    stage('clone') {
      steps {
        git(url: 'https://github.com/pgorzkowicz/demo/', branch: 'main')
      }
    }

  }
}