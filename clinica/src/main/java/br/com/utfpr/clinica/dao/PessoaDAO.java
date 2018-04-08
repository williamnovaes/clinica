package br.com.utfpr.clinica.dao;

import br.com.utfpr.clinica.entity.Pessoa;

public class PessoaDAO extends BaseDAO<Pessoa> {

	private static final long serialVersionUID = 1L;

	public PessoaDAO() {
		super(Pessoa.class);
	}
}
