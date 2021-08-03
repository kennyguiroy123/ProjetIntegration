pipeline {
  agent any
  stages {
    stage('Snapshot') {
      steps {
        mavenSnapshotCheck()
      }
    }

    stage('Jacoco') {
      steps {
        jacoco(maximumBranchCoverage: '100', maximumClassCoverage: '100', maximumLineCoverage: '100', maximumMethodCoverage: '100', minimumBranchCoverage: '20', minimumClassCoverage: '20', minimumLineCoverage: '20', minimumMethodCoverage: '20')
      }
    }

    stage('Tests') {
      steps {
        junit 'testResults'
      }
    }

    stage('Message') {
      steps {
        echo 'Maven,Jacoco et Junit Fonctionnel'
      }
    }

  }
}