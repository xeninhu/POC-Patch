package br.com.drduarte.genuinePatch.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class AlterarIdadeEmailDto {
    private Integer id;
    private Integer idade;
    @Email
    private String email;
}
