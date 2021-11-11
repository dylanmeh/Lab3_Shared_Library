def call(String success) {
  emailext (
  subject: "${success}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
  body: """${success}: Job '${JOB_NAME} [${BUILD_NUMBER}]':
  Check console output at ${BUILD_URL}""",
  to: 'dylan.mehmedovic@concanon.com'
  )
}
