import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter


object MyFonctions {
    @RequiresApi(Build.VERSION_CODES.O)
    fun calculateAge(birthDateString: String): String {
        // Define the date format
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

        // Parse the input string to a LocalDate object
        val birthDate = LocalDate.parse(birthDateString, formatter)

        // Get the current date
        val currentDate = LocalDate.now()

        // Calculate the period between the birth date and the current date
        val period = Period.between(birthDate, currentDate)

        // Extract years, months, and days from the period
        val years = period.years
        val months = period.months
        val days = period.days

        return "$years Ans $months Mois $days Jours"
    }

}