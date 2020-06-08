package data_transformer

import org.apache.spark.sql.{DataFrame, SparkSession}

class Reader(spark: SparkSession) {

  def read(filePath: String): DataFrame = {
    spark.read
      .format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(filePath)
  }
}
