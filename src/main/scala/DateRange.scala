import java.time.LocalDate

/**
  * Created by hoor.s on 03-05-2017.
  */
class DateRange[T](val startDate: LocalDate, val endDate: LocalDate, val value: T) {

  def inRange(date: LocalDate): Boolean = {
    date.isEqual(startDate) || (date.isAfter(startDate) && date.isBefore(endDate)) || date.isEqual(endDate)
  }

}
