package data_transformer

import org.apache.spark.sql.SparkSession

trait SparkTestSession {
  val spark = SparkSession
    .builder
    .appName("Test App")
    .master("local")
    .getOrCreate()
}
