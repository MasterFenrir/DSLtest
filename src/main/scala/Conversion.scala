import java.time.LocalDate
import java.time.format.DateTimeFormatter
import scala.language.implicitConversions

/**
  * Created by hoor.s on 03-05-2017.
  */
object Conversion {

  implicit def tupleToRange(t: (String, String, Iteration)): IterationWithRange = {
    val startDate = parse(t._1)
    val endDate = if (t._2 != null) LocalDate.parse(t._2) else LocalDate.MAX
    new IterationWithRange(startDate, endDate, t._3)
  }

  implicit def tupleToRange(t: (String, Iteration)): IterationWithRange = {
    val startDate = parse(t._1)
    val endDate = LocalDate.MAX
    new IterationWithRange(startDate, endDate, t._2)
  }

  private def parse(date: String): LocalDate = {
    LocalDate.parse(date, DateTimeFormatter.ofPattern("dd:MM:yyyy"))
  }

}
