package br.com.drduarte.genuinePatch.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class AlterarEmailPessoaDto {

    private Integer id;
    @Email
    private String email;
}
