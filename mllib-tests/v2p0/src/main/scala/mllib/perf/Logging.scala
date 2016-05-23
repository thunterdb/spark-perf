package mllib.perf

import com.typesafe.scalalogging.slf4j._

trait Logging extends StrictLogging {

  def logDebug(s: => String): Unit = logger.debug(s)

  def logInfo(s: => String): Unit = logger.info(s)
}