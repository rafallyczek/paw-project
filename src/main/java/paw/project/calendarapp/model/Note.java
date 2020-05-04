package paw.project.calendarapp.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Notes")
public class Note {

    //Pola
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Integer userId;
    private LocalDate date;

}
