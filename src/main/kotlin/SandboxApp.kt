import logging.LoggerClient
import logging.LoggerCore

object SandboxApp : ShuraK()

fun main() {
    LoggerCore.warn { "Initialized Log!" }
    LoggerClient.error { "Sampling error log..." }

    val app = SandboxApp
    app.run()
}
