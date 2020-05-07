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

    //Dodaj notkę
    @PostMapping("/add")
    public String addNote(@ModelAttribute("note") Note note){
        System.out.println(note.getDate());
        noteService.addNote(note);
        return "redirect:/calendar";
    }

    //Aktualizuj notkę
    @PostMapping("/update")
    public String updateNote(@ModelAttribute("note") Note note){
        noteService.updateNote(note);
        return "redirect:/calendar";
    }

    //Pobierz notkę i zapisz ją w modelu (notka do edycji)
    @GetMapping("/get/{id}")
    public String getNote(@PathVariable Long id, Model model){
        model.addAttribute("retrievednote",noteService.getNote(id));
        return "redirect:/notes/update";
    }

    //Usuń notkę
    @RequestMapping("/delete/{id}")
    public String deleteNote(@PathVariable Long id){
        noteService.deleteNote(id);
        return "redirect:/calendar";
    }

}
