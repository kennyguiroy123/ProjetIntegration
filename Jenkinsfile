pipeline {
  agent any
  stages {
    stage('Maven') {
      steps {
        mavenSnapshotCheck()
      }
    }

    stage('Jacoco') {
      steps {
        jacoco(maximumBranchCoverage: '100', maximumClassCoverage: '100', maximumLineCoverage: '100', maximumMethodCoverage: '100', minimumBranchCoverage: '20', minimumClassCoverage: '20', minimumLineCoverage: '20', minimumMethodCoverage: '20')
      }
    }

    stage('Junit') {
      steps {
        junit(allowEmptyResults: true, testResults: 'tests')
      }
    }

    stage('Message') {
      steps {
        echo 'Maven,jacoco et Junit fonctionnel'
      }
    }

  }
}