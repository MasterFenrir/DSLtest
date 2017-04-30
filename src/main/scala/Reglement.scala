/**
  * Created by Sander on 4/30/2017.
  */

trait Reglement {

  def main(args: Array[String]): Unit = {
    this.getClass
      .getDeclaredMethods
      .filter(!_.getName.equals("main"))
      .foreach(_.invoke(this))

    DW.waarde1 = 4
    println(DW.waarde1)
    println(DW.waarde2)

  }


}
