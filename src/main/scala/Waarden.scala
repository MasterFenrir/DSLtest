/**
  * Created by Sander on 4/30/2017.
  */

import language.dynamics
import scala.collection.mutable

abstract class Waarden extends Dynamic {

  private val map: mutable.Map[String, Doorgeefwaarde] = mutable.Map()

  def selectDynamic(name: String): Doorgeefwaarde = {
    check(name)
    map(name)
  }

  def updateDynamic(name: String)(value: Double): Unit = {
    check(name)
    map(name).saves(value)
  }

  private def check(name: String): Unit = {
    if (!doorgeefwaarden.contains(name)) throw new Exception("Onbekende doorgeefwaarde")
    if (!map.contains(name)) map.put(name, Doorgeefwaarde())
  }


  def doorgeefwaarden: List[String]

}
