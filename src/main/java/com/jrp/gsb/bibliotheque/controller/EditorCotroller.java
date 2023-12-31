package com.jrp.gsb.bibliotheque.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.gsb.bibliotheque.entities.Editor;
import com.jrp.gsb.bibliotheque.repository.EditorRepository;



@Controller
@RequestMapping("/editors")
public class EditorCotroller {
    @Autowired
    EditorRepository editorRepo;
    @GetMapping("/lists")
    public String displayEditor(Model model){
        List<Editor> editor = editorRepo.findAll();
        model.addAttribute("editorList", editor);
        return "home";
    }
    @GetMapping("/new")
    public String addNewEditor(Model model) {
        Editor editor = new Editor();
        model.addAttribute("editors", editor);
        return "editors/new-editors";
    }
    @PostMapping("/save")
    public String addEditor(Editor editor, Model model){
        editorRepo.save(editor);
        return "redirect:/editors/new";
    }
    
}
