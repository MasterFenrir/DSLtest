import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
  * Created by hoor.s on 03-05-2017.
  */
class Basisgegeven[T](data: (String, String, T)*) {

  implicit val localDateOrdering: Ordering[LocalDate] = Ordering.by(_.toEpochDay)

  val values: Seq[DateRange[T]] = data.map(t => new DateRange[T](parse(t._1), parse(t._2), t._3)).sortBy(_.startDate)

  def apply(): T = {
    values.last.value
  }

  def apply(date: String): T = {
    val testDate = parse(date)
    val candidates = values.filter(_.inRange(testDate))
    if (candidates.size == 1) candidates.head.value else throw new Exception(s"Not exactly one match: ${candidates.size}")
  }

  private def parse(date: String): LocalDate = {
    if (date != null) LocalDate.parse(date, DateTimeFormatter.ofPattern("dd:MM:yyyy")) else LocalDate.MAX
  }
}

object Basisgegeven {

  def apply[T](data: (String, String, T)*): Basisgegeven[T] = {
    new Basisgegeven[T](data: _*)
  }
}
