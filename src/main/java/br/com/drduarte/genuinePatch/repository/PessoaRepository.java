package br.com.drduarte.genuinePatch.repository;

import br.com.drduarte.genuinePatch.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {

}
