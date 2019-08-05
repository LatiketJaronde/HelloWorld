import org.apache.spark.sql.SparkSession

object MainClass {
  def main(args: Array[String]): Unit = {

    println("demo for jenkins")

    val sparkSession = SparkSession.builder().appName("kdsbh").config("spark.executor.memory", "1g")
        .config("spark.driver.memory", "4g").master("local[*]").getOrCreate()
   
    val sparkContext = sparkSession.sparkContext


    sparkContext.makeRDD(List(1,2,3,4,5,6,7,8,9,10)).map(x => (x*2)).collect().foreach(println)
  }
}
