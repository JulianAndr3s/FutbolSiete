pipeline {

  agent {
    label 'Slave_Induccion'
  }

  options {
    buildDiscarder(logRotator(numToKeepStr: '3'))
    disableConcurrentBuilds()
  }

  tools {
    jdk 'JDK8_Centos'
    gradle 'Gradle5.6_Centos'
  }
  
  environment{
    PROJETC_PATH_JMETER= '/opt/Apache/apache-jmeter-5.0/bin'
  }

  stages {
    stage('Checkout') {
      steps {
        echo "------------>Checkout<------------"
        checkout([
          $class: 'GitSCM',
          branches: [[name: '*/master']],
          doGenerateSubmoduleConfigurations: false,
          extensions: [],
          gitTool: 'Git_Centos',
          submoduleCfg: [],
          userRemoteConfigs: [[
            credentialsId: 'GitHub_julian.botero',
            url:'https://github.com/JulianAndr3s/FutbolSiete'
          ]]
        ])
      }
    }

    stage('Compile & Unit Tests') {
        steps{
            echo "------------>Cleaning previous compilations<------------"
		    dir("Backend/FutbolSiete"){
                 sh 'gradle --b ./build.gradle clean'

                 echo "------------>Unit Tests<------------"
                 sh 'gradle --b ./build.gradle test jacocoTestReport'
		    }
        }
    }

    stage('Static Code Analysis') {
      	steps {
        	echo '------------>Análisis de código estático<------------'
        	withSonarQubeEnv('Sonar') {
          	sh "${tool name: 'SonarScanner',type:'hudson.plugins.sonar.SonarRunnerInstallation'}/bin/sonar-scanner"
          	// sh 'gradle sonarqube'
        	}
      	}
    }

    stage('Build') {
        steps {
            echo "------------>Build<------------"
            dir("Backend/FutbolSiete"){
                        //Construir sin tarea test que se ejecutó previamente
                        sh 'gradle --b ./build.gradle build -x test'
            }
        }
    }
	
  }

  post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
  }
}
