package br.com.academiadev.financeiro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academiadev.financeiro.model.LancamentoFinanceiro;

@Repository
public interface LancamentoFinanceiroRepository extends CrudRepository<LancamentoFinanceiro, Long>{

}
