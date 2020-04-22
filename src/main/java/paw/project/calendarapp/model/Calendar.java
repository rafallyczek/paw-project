package paw.project.calendarapp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Data
public class Calendar {

    //Pola
    private LocalDate currentDate = LocalDate.now().withDayOfMonth(1); // Aktualna data (ustawiona na 1 dzień miesiąca)
    private int month = currentDate.getMonthValue(); // Aktualny miesiąc
    private String monthName = monthName(month); // Nazwa aktualnego miesiąca
    private int daysInMonth = currentDate.lengthOfMonth(); // Ilość dni aktualnego miesiąca
    private int year = currentDate.getYear(); // Aktualny rok
    private int dayOfWeek = currentDate.getDayOfWeek().getValue(); // Dzień tygodnia pierwszego dnia miesiąca
    private List<Note> notes;

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

}
