package com.jrp.gsb.bibliotheque.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.gsb.bibliotheque.entities.Editor;
import com.jrp.gsb.bibliotheque.repository.EditorRepository;

import org.springframework.ui.Model;


@Controller
@RequestMapping
public class EditorCotroller {
    @Autowired
    EditorRepository editorRepo;
    @GetMapping("/")
    public String displayEditor(Model model){
        List<Editor> editor = editorRepo.findAll();
        model.addAttribute("editorList", editor);
        return "home";
    }

    public String saveEditor(){
        return "home.html";
    }
    
}
