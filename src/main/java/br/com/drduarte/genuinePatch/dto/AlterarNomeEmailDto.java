package br.com.drduarte.genuinePatch.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AlterarNomeEmailDto {
    private Integer id;
    private String nome;
    @Email private String email;
}
