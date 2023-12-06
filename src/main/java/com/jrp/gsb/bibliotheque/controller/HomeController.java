package com.jrp.gsb.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.gsb.bibliotheque.entities.Editor;
import com.jrp.gsb.bibliotheque.repository.EditorRepository;


@Controller
@RequestMapping
public class HomeController {
    @Autowired
    EditorRepository editorRepo;
    @GetMapping("/")
    public String displayEditor(Model model){
        List<Editor> editor = editorRepo.findAll();
        model.addAttribute("editorList", editor);
        return "home";
    }
}
