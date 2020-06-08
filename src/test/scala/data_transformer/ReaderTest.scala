package data_transformer

import com.github.mrpowers.spark.fast.tests.DatasetComparer
import data_transformer.Reader


class ReaderTest extends org.scalatest.FunSuite with SparkTestSession with DatasetComparer {
  import spark.implicits._
  test("should read data from csv") {
    val filePath = getClass.getResource("/test.csv").getPath.toString
    val reader = new Reader(spark)
    val df = reader.read(filePath)
    val expected = spark.read
      .format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(filePath)
    assertSmallDatasetEquality(df, expected, ignoreNullable = true)
  }
};
