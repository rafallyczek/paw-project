package paw.project.calendarapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Note {

    //Pola
    @Id
    private Long id;
    private String title;
    private String content;
    private Integer userId;
    private Date date;

}
