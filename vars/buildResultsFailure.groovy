def call() {
        emailext (
        subject: "FAILURE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
        body: """FAULURE: Job '${JOB_NAME} [${BUILD_NUMBER}]':
        Check console output at ${BUILD_URL}""",
        to: 'bilal.hussain@concanon.com'
        )
}
