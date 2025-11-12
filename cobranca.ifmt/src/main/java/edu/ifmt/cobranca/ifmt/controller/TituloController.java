package edu.ifmt.cobranca.ifmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import edu.ifmt.cobranca.ifmt.model.Titulo;
import edu.ifmt.cobranca.ifmt.repository.TitulosRepository;

@Controller
public class TituloController {

    private final TitulosRepository repo;

    public TituloController(TitulosRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/titulos/novo")
    public String novo(Model model) {
        model.addAttribute("titulo", new Titulo());
        return "CadastroTitulo";
    }

    @PostMapping("/titulos")
    public String salvar(Titulo titulo) {
        repo.save(titulo);
        return "redirect:/titulos/novo";
    }

    @GetMapping("/titulos")
    public String listar(Model model) {
        model.addAttribute("titulos", repo.findAll());
        return "ListaTitulos";
    }
}
