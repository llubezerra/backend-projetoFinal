package com.example.demo.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PessoaForm {

    //forca a ser not null, valida as obrigacoes minimas
    //bin validation
    @NotNull
    @NotEmpty
    @Min(value = 3)
    private String nome;

    @NotEmpty
    @NotEmpty
    private String sobrenome;
}
