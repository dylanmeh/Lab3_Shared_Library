def call() {
  emailext (
  subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
  body: """SUCCESSFUL: Job '${JOB_NAME} [${BUILD_NUMBER}]':
  Check console output at ${BUILD_URL}""",
  to: 'dylan.mehmedovic@concanon.com'
  )
}
       
    
