pipeline {
  options { disableConcurrentBuilds() }
  agent { label 'docker-slave' }
  stages {
    stage ('Pull repo code from github') {
      steps {
        checkout scm
        sh('git config --global user.email "jesus.gorronogoitia@atos.net"')
	sh('git config --global user.name "Sodalite Jenkins"')
      	sh('git reset --hard origin/${BRANCH_NAME}')
      }
    }
    stage ('Build IDE and run Sonar') {
      steps {
          sh  """ #!/bin/bash
                  cd "dsl/org.sodalite.IDE.parent/"
                  mvn clean verify -Dmaven.test.skip
                  git reset --hard
              """
      }
    }
    stage('SonarQube analysis'){
        environment {
          scannerHome = tool 'SonarQubeScanner'
        }
        steps {
            withSonarQubeEnv('SonarCloud') {
                sh  """ #!/bin/bash
                        cd "dsl/org.sodalite.IDE.parent/"
                        ${scannerHome}/bin/sonar-scanner
                    """
            }
        }
    }
   /*	  
    stage ('Publish update site') {
      steps {
        withCredentials([usernamePassword(credentialsId: 'sodalite-jenkins_github_creds', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
          sh('mkdir -p site')
    	  sh('scripts/publish_site.sh ${GIT_USERNAME} ${GIT_PASSWORD}')
	}
      }
    }*/
  }
  post {
      failure {
        slackSend (channel: '@Gad Maor', color: '#FF0000', message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
      }
      fixed {
        slackSend (channel: '@Gad Maor', color: '#6d3be3', message: "FIXED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})") 
      }
  }
}
