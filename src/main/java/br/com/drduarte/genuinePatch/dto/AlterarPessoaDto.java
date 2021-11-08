package br.com.drduarte.genuinePatch.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class AlterarPessoaDto {
    private Integer id;
    private String nome;
    @Email
    private String email;
    private Integer idade;
}
