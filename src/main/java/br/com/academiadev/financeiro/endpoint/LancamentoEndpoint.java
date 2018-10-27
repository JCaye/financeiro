package br.com.academiadev.financeiro.endpoint;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academiadev.financeiro.model.LancamentoFinanceiro;
import br.com.academiadev.financeiro.repository.LancamentoFinanceiroRepository;

@RestController
@RequestMapping("/lancamento")
public class LancamentoEndpoint {
	@Autowired
	private LancamentoFinanceiroRepository lancamentoRepository;
	
	@PostMapping("/")
	public void save(@RequestBody LancamentoFinanceiro lancamento) {
		lancamentoRepository.save(lancamento);
	}
	
	@GetMapping("/")
	public List<LancamentoFinanceiro> buscarLancamentos(){
		return StreamSupport.stream(lancamentoRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
