package paw.project.calendarapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import paw.project.calendarapp.model.Note;
import paw.project.calendarapp.service.NoteService;

@Controller
@RequestMapping("/notes")
public class NoteController {

    private NoteService noteService;

    //Wstrzykiwanie serwisu
    @Autowired
    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    //Dodaj do modelu obiekt Note (nowa notka)
    @ModelAttribute
    public void note(Model model){
        model.addAttribute("note",new Note());
    }

    //Dodaj notkę
    @PostMapping("/add")
    public void addNote(@ModelAttribute("note") Note note){
        noteService.addNote(note);
    }

    //Aktualizuj notkę
    @PostMapping("/update")
    public void updateNote(@ModelAttribute("retrievednote") Note note){
        noteService.updateNote(note);
    }

    //Pobierz notkę i zapisz ją w modelu (notka do edycji)
    @GetMapping("/get/{id}")
    public String getNote(@PathVariable Long id, Model model){
        model.addAttribute("retrievednote",noteService.getNote(id));
        return "redirect:/notes/update";
    }

    //Usuń notkę
    @RequestMapping("/delete/{id}")
    public void deleteNote(@PathVariable Long id){
        noteService.deleteNote(id);
    }

}
