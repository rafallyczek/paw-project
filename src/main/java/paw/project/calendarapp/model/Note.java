package paw.project.calendarapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Notes")
public class Note {

    //Pola
    @Id
    private Long id;
    private String title;
    private String content;
    private Integer userId;
    private LocalDate date;

}
