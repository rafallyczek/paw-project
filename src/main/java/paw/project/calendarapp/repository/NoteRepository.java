package paw.project.calendarapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import paw.project.calendarapp.model.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note,Integer> {
}
