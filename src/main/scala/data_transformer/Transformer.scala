package data_transformer

object Transformer extends SparkUtils {
  def main(args: Array[String]): Unit = {
    val inputPath = args(1)
    val destinationPath = args(2)
    val reader = new Reader(spark)
    val writer = new Writer(spark)
    val df = reader.read(inputPath)
    writer.write(df, destinationPath)
  }
}
