def call(String failure) {
        emailext (
        subject: "${failure}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
        body: """${failure}: Job '${JOB_NAME} [${BUILD_NUMBER}]':
        Check console output at ${BUILD_URL}""",
        to: 'dylan.mehmedovic@concanon.com'
        )
}
