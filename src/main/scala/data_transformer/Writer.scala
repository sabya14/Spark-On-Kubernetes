package data_transformer

import org.apache.spark.sql.{DataFrame, SparkSession}

class Writer(spark: SparkSession) {

  def write(df: DataFrame, destinationPath: String) = {
    df.repartition(1)
      .write
      .format("csv")
      .option("header", "true")
      .save(destinationPath)
  }
}
