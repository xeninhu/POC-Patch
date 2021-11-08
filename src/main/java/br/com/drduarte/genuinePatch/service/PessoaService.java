package br.com.drduarte.genuinePatch.service;

import br.com.drduarte.genuinePatch.dto.*;
import br.com.drduarte.genuinePatch.model.Pessoa;
import br.com.drduarte.genuinePatch.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired private PessoaRepository pessoaRepository;

    public Pessoa atualizaPessoa(AlterarEmailPessoaDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        if (dto.getEmail() == null || !dto.getEmail().equals(pessoa.getEmail())) {
            pessoa.setEmail(dto.getEmail());
            this.pessoaRepository.save(pessoa);
        }
        return pessoa;
    }

    public Pessoa atualizaPessoa(AlterarIdadePessoaDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        if (dto.getIdade() == null || !dto.getIdade().equals(pessoa.getIdade())) {
            pessoa.setIdade(dto.getIdade());
            this.pessoaRepository.save(pessoa);
        }
        return pessoa;
    }

    public Pessoa atualizaPessoa(AlterarNomePessoaDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        if (dto.getNome() == null || !dto.getNome().equals(pessoa.getNome())) {
            pessoa.setNome(dto.getNome());
            this.pessoaRepository.save(pessoa);
        }
        return pessoa;
    }

    public Pessoa atualizaPessoa(AlterarNomeIdadeDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        pessoa.setNome(dto.getNome());
        pessoa.setIdade(dto.getIdade());
        this.pessoaRepository.save(pessoa);
        return pessoa;
    }

    public Pessoa atualizaPessoa(AlterarNomeEmailDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        pessoa.setNome(dto.getNome());
        pessoa.setEmail(dto.getEmail());
        this.pessoaRepository.save(pessoa);
        return pessoa;
    }

    public Pessoa atualizaPessoa(AlterarIdadeEmailDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        pessoa.setIdade(dto.getIdade());
        pessoa.setEmail(dto.getEmail());
        this.pessoaRepository.save(pessoa);
        return pessoa;

    }

    public Pessoa atualizaPessoa(AlterarPessoaDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        pessoa.setIdade(dto.getIdade());
        pessoa.setEmail(dto.getEmail());
        pessoa.setNome(dto.getNome());
        this.pessoaRepository.save(pessoa);
        return pessoa;
    }
}
