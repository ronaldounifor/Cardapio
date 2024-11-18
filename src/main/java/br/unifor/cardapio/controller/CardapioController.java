package br.unifor.cardapio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.cardapio.model.Cardapio;
import br.unifor.cardapio.model.MenuItem;

@RestController
@RequestMapping("/restaurante")
public class CardapioController {

    @Autowired
    private Cardapio cardapio;
    
    @GetMapping
    public ArrayList<MenuItem> getAll() {
        return cardapio.pegarTodos();
    }

    @GetMapping("/{id}")
    public MenuItem findByID(@PathVariable int id) {
        return cardapio.pegarPorID(id);
    }

    @PostMapping
    public void addItem(@RequestBody MenuItem item) {
        cardapio.adicionar(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        cardapio.remover(id);
    }
}
