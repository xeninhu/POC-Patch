package br.com.drduarte.genuinePatch.service;

import br.com.drduarte.genuinePatch.dto.AlterarEmailPessoaDto;
import br.com.drduarte.genuinePatch.model.Pessoa;
import br.com.drduarte.genuinePatch.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizaPessoa(AlterarEmailPessoaDto dto) {
        var pessoa = this.pessoaRepository.getById(dto.getId());
        if(!dto.getEmail().equals(pessoa.getEmail())) {
            pessoa.setEmail(dto.getEmail());
            this.pessoaRepository.save(pessoa);
        }
        return pessoa;
    }



}
