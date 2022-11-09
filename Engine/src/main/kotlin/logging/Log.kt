package logging


interface Log {
    fun trace(throwable: Throwable? = null, message: () -> Any?)
    fun debug(throwable: Throwable? = null, message: () -> Any?)
    fun info(throwable: Throwable? = null, message: () -> Any?)
    fun warn(throwable: Throwable? = null, message: () -> Any?)
    fun error(throwable: Throwable? = null, message: () -> Any?)
}
