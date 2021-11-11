def call(String buildResult) {
  emailext (
  subject: "${buildResult}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
  body: """${buildResult}: Job '${JOB_NAME} [${BUILD_NUMBER}]':
  Check console output at ${BUILD_URL}""",
  to: 'dylan.mehmedovic@concanon.com'
  )
}
