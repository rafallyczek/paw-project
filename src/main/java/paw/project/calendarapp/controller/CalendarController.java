package paw.project.calendarapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import paw.project.calendarapp.calendar.Calendar;

@Controller
@RequestMapping("/calendar")
public class CalendarController {

    Calendar calendar;

    //Wstrzykiwanie obiektu Calendar
    @Autowired
    public CalendarController(Calendar calendar){
        this.calendar = calendar;
    }

    //Dodaj do modelu obiekt Calendar
    @ModelAttribute(name = "calendar")
    public Calendar calendar(){
        return new Calendar();
    }

    //Wyświetl kalendarz
    @GetMapping
    public String showCalendar(){
        return "calendar";
    }

}
