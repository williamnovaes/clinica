package br.com.utfpr.clinica.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.utfpr.clinica.dao.CidadeDAO;
import br.com.utfpr.clinica.entity.Cidade;
import br.com.utfpr.clinica.entity.Estado;

@Stateless
public class CidadeServico extends BaseServico<Cidade> {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CidadeDAO cidadeDao;
	
	@Override
	protected void inicializar() {
		setDao(cidadeDao);
	}
	
	public List<Cidade> obterTodos() throws Exception {
		try {
			return cidadeDao.consultarTodos();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public List<Cidade> obterPorEstado(Estado estado) throws Exception {
		try {
			return cidadeDao.consutarPorEstado(estado);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}