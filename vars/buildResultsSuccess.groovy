def call() {
  emailext (
  subject: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
  body: """SUCCESS: Job '${JOB_NAME} [${BUILD_NUMBER}]':
  Check console output at ${BUILD_URL}""",
  to: 'dylan.mehmedovic@concanon.com'
  )
}
