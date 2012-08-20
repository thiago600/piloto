package br.com.piloto.faces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.piloto.model.Teste;

@ViewScoped
@ManagedBean(name = "testeFaces")
public class TesteFaces extends CrudFaces<Teste> {

	@PostConstruct
	protected void init() {
		this.clearFields();		
		setFieldOrdem("descricao");
	}

}
