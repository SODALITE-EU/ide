pipeline {
  options { disableConcurrentBuilds() }
  agent { label 'docker-slave' }
  stages {
    stage ('Pull repo code from github') {
      steps {
        checkout scm
      }
    }
    stage ('Build IDE') {
      steps {
        sh  """ #!/bin/bash
                cd "dsl/org.sodalite.IDE.parent/"
                mvn clean verify
            """
      }
    }
    stage ('Publish update site') {
      steps {
        withCredentials([usernamePassword(credentialsId: 'sodalite-jenkins_github_creds', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
	  sh('git config --global user.email "jesus.gorronogoitia@atos.net"')
	  sh('git config --global user.name "Sodalite Jenkins"')
	  sh('git checkout master')
    	  sh('git add dsl/org.sodalite.IDE.parent/org.sodalite.IDE.repository/target/repository/')
	  sh('git commit -a -m "Sodalite IDE update site updated"')
    	  sh('git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/SODALITE-EU/ide.git')
	}
      }
    }
  }
  post {
    failure {
        slackSend (color: '#FF0000', message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
    }
    fixed {
        slackSend (color: '#6d3be3', message: "FIXED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})") 
    }
  }
}
