package paw.project.calendarapp.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Calendar {

    //Pola
    LocalDate currentDate = LocalDate.now().withDayOfMonth(1); // Aktualna data (ustawiona na 1 dzień miesiąca)
    int month = currentDate.getMonthValue(); // Aktualny miesiąc
    String monthName = monthName(month); // Nazwa aktualnego miesiąca
    int daysInMonth = currentDate.lengthOfMonth(); // Ilość dni aktualnego miesiąca
    int year = currentDate.getYear(); // Aktualny rok
    int dayOfWeek = currentDate.getDayOfWeek().getValue(); // Dzień tygodnia pierwszego dnia miesiąca

    //Konstruktor
    public Calendar() {}

    //Metody
    //Następny miesiąc
    public void incrementMonth(){
        currentDate = currentDate.plusMonths(1);
        daysInMonth = currentDate.lengthOfMonth();
        year = currentDate.getYear();
        month = currentDate.getMonthValue();
        monthName = monthName(month);
        dayOfWeek = currentDate.getDayOfWeek().getValue();
    }

    //Poprzedni miesiąc
    public void decrementMonth(){
        currentDate = currentDate.minusMonths(1);
        daysInMonth = currentDate.lengthOfMonth();
        year = currentDate.getYear();
        month = currentDate.getMonthValue();
        monthName = monthName(month);
        dayOfWeek = currentDate.getDayOfWeek().getValue();
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

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

}
