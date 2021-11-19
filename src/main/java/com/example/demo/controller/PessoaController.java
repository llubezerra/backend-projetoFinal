package com.example.demo.controller;

import com.example.demo.model.Pessoa;
import com.example.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> getPessoa(){
        return repository.findAll();
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa p){
        return repository.save(p);
    }

    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Long id){
        Optional<Pessoa> pessoaPesquisada = repository.findById(id);

        if(pessoaPesquisada.isPresent()){
            return repository.getById(id);
        }
        return null;
    }

    @PutMapping("/{id}")
    public void editarPessoa(@RequestBody Pessoa p){
        repository.save(p);
    }

}
