package logging

import mu.KotlinLogging

private val coreLogger = KotlinLogging.logger("SHURAK")

object LoggerCore : Log {
    override fun trace(throwable: Throwable?, message: () -> Any?) = coreLogger.trace(throwable) { message.invoke() }
    override fun debug(throwable: Throwable?, message: () -> Any?) = coreLogger.debug(throwable) { message.invoke() }
    override fun info(throwable: Throwable?, message: () -> Any?) = coreLogger.info(throwable) { message.invoke() }
    override fun warn(throwable: Throwable?, message: () -> Any?) = coreLogger.warn(throwable) { message.invoke() }
    override fun error(throwable: Throwable?, message: () -> Any?) = coreLogger.error(throwable) { message.invoke() }
}
