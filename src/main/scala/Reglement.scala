/**
  * Created by Sander on 4/30/2017.
  */
import Conversion._
trait Reglement {

  def main(args: Array[String]): Unit = {

    val test = ("01:01:2017", new R_2017())

    val b = Basisgegeven[Double](
      ("01:01:2017", "31:01:2017", 1.0),
      ("01:02:2017", "28:02:2017", 2.0),
      ("01:03:2017", "31:03:2017", 3.0),
      ("01:04:2017", "30:04:2017", 4.0)
    )

    println(b())


    //    val a = new R_2016()
    //    val b = new R_2017()
    //
    //    a.getClass
    //      .getDeclaredMethods
    //      .foreach(println)
    //      //.foreach(_.invoke(1))
    //
    //    println("\n2017\n")
    //
    //    b.getClass
    //      .getMethods
    //      .filterNot(_.getName.contains("java.lang"))
    //      .foreach(method => println(method.getName))
    //.foreach(_.invoke(b))

    //    DW.waarde1 = 4
    //    println(DW.waarde1)
    //    println(DW.waarde2)

  }
}
