package logging

import mu.KotlinLogging

private val clientLogger = KotlinLogging.logger("APP")

object LoggerClient : Log {
    override fun trace(throwable: Throwable?, message: () -> Any?) = clientLogger.trace(throwable) { message.invoke() }
    override fun debug(throwable: Throwable?, message: () -> Any?) = clientLogger.debug(throwable) { message.invoke() }
    override fun info(throwable: Throwable?, message: () -> Any?) = clientLogger.info(throwable) { message.invoke() }
    override fun warn(throwable: Throwable?, message: () -> Any?) = clientLogger.warn(throwable) { message.invoke() }
    override fun error(throwable: Throwable?, message: () -> Any?) = clientLogger.error(throwable) { message.invoke() }
}
