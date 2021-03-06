package br.com.utfpr.clinica.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.utfpr.clinica.dao.PessoaDAO;
import br.com.utfpr.clinica.entity.Pessoa;

@Stateless
public class PessoaServico extends BaseServico<Pessoa> {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaDAO pessoaDao;
	
	@Override
	@PostConstruct
	public void inicializar() {
		setDao(pessoaDao);
	}
	
	public List<Pessoa> obterTodos() throws Exception {
		try {
			return pessoaDao.consultarTodos();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}