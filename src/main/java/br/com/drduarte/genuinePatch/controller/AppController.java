package br.com.drduarte.genuinePatch.controller;

import br.com.drduarte.genuinePatch.dto.AlterarEmailPessoaDto;
import br.com.drduarte.genuinePatch.model.Pessoa;
import br.com.drduarte.genuinePatch.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("pessoa")
public class AppController {

    @Autowired
    private PessoaService pessoaService;

    @PatchMapping
    public ResponseEntity<AlterarEmailPessoaDto> cadastraPessoa(
            @Valid @RequestBody AlterarEmailPessoaDto dto) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }
}
