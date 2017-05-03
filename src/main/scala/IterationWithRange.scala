import java.time.LocalDate

/**
  * Created by hoor.s on 03-05-2017.
  */
class IterationWithRange(val startDate: LocalDate, val endDate: LocalDate, val iteration: Iteration) {

  def isInRange(date: String): Boolean = {
    val testDate = LocalDate.parse(date)
    testDate.isEqual(startDate) || (testDate.isAfter(startDate) && testDate.isBefore(endDate)) || testDate.isEqual(endDate)
  }

}
