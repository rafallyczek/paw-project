package paw.project.calendarapp.calendar;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class Calendar {

    //Pola
    LocalDate currentDate = LocalDate.now().withDayOfMonth(1); // Aktualna data (ustawiona na 1 dzień miesiąca)
    int month = currentDate.getMonthValue(); // Aktualny miesiąc
    String monthName = monthName(month); // Nazwa aktualnego miesiąca
    int daysInMonth = currentDate.lengthOfMonth(); // Ilość dni aktualnego miesiąca
    int year = currentDate.getYear(); // Aktualny rok
    List<Integer> days = createDaysList(); // Lista dni

    //Konstruktor
    public Calendar() {}

    //Metody
    //Następny miesiąc
    public void incrementMonth(){
        currentDate = currentDate.plusMonths(1);
        daysInMonth = currentDate.lengthOfMonth();
        year = currentDate.getYear();
        month = currentDate.getMonthValue();
        days = createDaysList();
        monthName = monthName(month);
    }

    //Poprzedni miesiąc
    public void decrementMonth(){
        currentDate = currentDate.minusMonths(1);
        daysInMonth = currentDate.lengthOfMonth();
        year = currentDate.getYear();
        month = currentDate.getMonthValue();
        days = createDaysList();
        monthName = monthName(month);
    }

    //Utworzenie tablicy dni
    public List<Integer> createDaysList(){
        List<Integer> days = new ArrayList<>();
        for(int i=0; i<this.daysInMonth; i++){
            days.add(i+1);
        }
        return days;
    }

    //Ustal nazwę miesiąca
    public String monthName(int month){
        String monthName = null;
        switch (month) {
            case 1:
                monthName = "Styczeń";
                break;
            case 2:
                monthName = "Luty";
                break;
            case 3:
                monthName = "Marzec";
                break;
            case 4:
                monthName = "Kwiecień";
                break;
            case 5:
                monthName = "Maj";
                break;
            case 6:
                monthName = "Czerwiec";
                break;
            case 7:
                monthName = "Lipiec";
                break;
            case 8:
                monthName = "Sierpień";
                break;
            case 9:
                monthName = "Wrzesień";
                break;
            case 10:
                monthName = "Październik";
                break;
            case 11:
                monthName = "Listopad";
                break;
            case 12:
                monthName = "Grudzień";
                break;
        }
        return monthName;
    }

    //Gettery i Settery
    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
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

    public List<Integer> getDays() {
        return days;
    }

    public void setDays(List<Integer> days) {
        this.days = days;
    }

}
