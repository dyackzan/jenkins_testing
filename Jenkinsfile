pipeline {
    agent {
        label "hookpipeline_node"
    }
    stages {
        stage ('build') {
            steps {
                sh script: '''
                echo "hello" > helloworld.txt
            '''
            }
        }
    }
    post {
            always {
                archiveArtifacts artifacts: 'helloworld.txt'
            }
        }
}
