package paw.project.calendarapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import paw.project.calendarapp.model.Note;
import paw.project.calendarapp.repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {

    private NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    //Zwróć notki po id użytkownika
    public List<Note> loadNotesByUserId(int id){
        return noteRepository.findAllByUserId(id);
    }

}
