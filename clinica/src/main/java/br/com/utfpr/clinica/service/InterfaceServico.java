package br.com.utfpr.clinica.service;

import java.io.Serializable;

public interface InterfaceServico<T> extends Serializable {
	
	T salvar(final T t) throws Exception;
	
	T alterar(final T t) throws Exception;
}
