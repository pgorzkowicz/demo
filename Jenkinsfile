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

  }
}