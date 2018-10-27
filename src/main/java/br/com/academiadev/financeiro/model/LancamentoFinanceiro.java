package br.com.academiadev.financeiro.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class LancamentoFinanceiro {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@ManyToOne(optional = false)
	private Usuario usuario;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoDeLancamento tipoDeLancamento;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Status status;

	@NotNull
	private LocalDate dataEmissao;

	@NotNull
	private LocalDate dataVencimento;

	@NotNull
	private LocalDate dataCriacao;

	@NotNull
	private String recebedorPagador;

	@NotNull
	private BigDecimal valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoDeLancamento getTipoDeLancamento() {
		return tipoDeLancamento;
	}

	public void setTipoDeLancamento(TipoDeLancamento tipoDeLancamento) {
		this.tipoDeLancamento = tipoDeLancamento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getRecebedorPagador() {
		return recebedorPagador;
	}

	public void setRecebedorPagador(String recebedorPagador) {
		this.recebedorPagador = recebedorPagador;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
