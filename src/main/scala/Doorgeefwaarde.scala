import scala.collection.mutable

/**
  * Created by Sander on 4/30/2017.
  */
class Doorgeefwaarde {

  val values: mutable.MutableList[Double] = mutable.MutableList[Double]()

  def saves(value: Double): Unit = {
    values += value
  }

  def get(): Double = values.headOption.getOrElse(0)

  override def toString: String = values.toString

}

object Doorgeefwaarde {
  def apply(): Doorgeefwaarde = {
    new Doorgeefwaarde
  }
}