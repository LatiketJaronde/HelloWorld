import org.apache.spark.sql.SparkSession

object MainClass {
  def main(args: Array[String]): Unit = {

    println("demo for jenkins")

//    for(i <- 0 to 5) {
//       println(i)
//    }
  
    val ss = SparkSession.builder().master("local[*]").appName("name").getOrCreate()
    val sc = ss.sparkContext

    sc.makeRDD(List(1,2,3,4,5)).map(x => (x*2)).collect().foreach(println) 
  }
}
