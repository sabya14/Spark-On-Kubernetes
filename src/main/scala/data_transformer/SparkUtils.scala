package data_transformer

import org.apache.spark.sql.SparkSession

trait SparkUtils {
  val spark = SparkSession
    .builder
    .appName("Transformer App")
    .getOrCreate()
}
