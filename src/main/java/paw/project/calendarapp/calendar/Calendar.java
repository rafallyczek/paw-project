package paw.project.calendarapp.calendar;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class Calendar {

    //Pola
    LocalDate currentDate = LocalDate.now(); // Aktualna data
    LocalDate date = LocalDate.of(currentDate.getYear(),currentDate.getMonth(),1); // Aktualna data (ustawiona na 1 dzień)
    int daysInMonth = currentDate.lengthOfMonth(); // Ilość dni aktualnego miesiąca
    int year = currentDate.getYear(); // Aktualny rok
    String month = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()); // Nazwa aktualnego miesiąca

    //Konstruktor
    public Calendar() {}

    //Metody
    //Dodaj miesiąc
    public void incrementMonth(int months){
        this.date = this.date.plusMonths(months);
    }

    //Odejmij miesiąc
    public void decrementMonth(int months){
        this.date = this.date.minusMonths(months);
    }

    //Gettery i Settery
    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public void setDaysInMonth(int daysInMonth) {
        this.daysInMonth = daysInMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}
