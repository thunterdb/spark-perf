package mllib.perf.linalg

import org.apache.spark.ml.{linalg => linalg2}
import org.apache.spark.mllib.{linalg => linalg1}

/**
 * Implicit conversions between the old vectors and the new vectors.
 */
object VectorImplicitConversions {

  implicit class RichOldVector(v2: linalg2.Vector) {
    def old: linalg1.Vector = linalg1.Vectors.fromML(v2)
  }
}
