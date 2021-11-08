package br.com.drduarte.genuinePatch.controller;

import br.com.drduarte.genuinePatch.dto.*;
import br.com.drduarte.genuinePatch.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("pessoa")
public class PatchsEspecialistasController {

    @Autowired private PessoaService pessoaService;

    @PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarEmailPessoaDto> atualizaPessoa(
            @Valid @RequestBody AlterarEmailPessoaDto dto, @PathVariable Integer idPessoa) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarIdadePessoaDto> atualizaPessoa(
            @Valid @RequestBody AlterarIdadePessoaDto dto, @PathVariable Integer idPessoa) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarNomePessoaDto> atualizaPessoa(
            @Valid @RequestBody AlterarNomePessoaDto dto, @PathVariable Integer idPessoa) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }

    //@PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarNomeIdadeDto> atualizaPessoa(
            @Valid @RequestBody AlterarNomeIdadeDto dto, @PathVariable Integer idPessoa) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }

    //@PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarNomeEmailDto> atualizaPessoa(
            @Valid @RequestBody AlterarNomeEmailDto dto, @PathVariable Integer idPessoa) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }

    //@PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarIdadeEmailDto> atualizaPessoa(
            @Valid @RequestBody AlterarIdadeEmailDto dto, @PathVariable Integer id) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }

    //@PatchMapping(name = "idPessoa")
    public ResponseEntity<AlterarPessoaDto> atualizaPessoa(
            @Valid @RequestBody AlterarPessoaDto dto, @PathVariable Integer idPessoa) {
        var pessoa = this.pessoaService.atualizaPessoa(dto);
        return ResponseEntity.ok(dto);
    }
}
