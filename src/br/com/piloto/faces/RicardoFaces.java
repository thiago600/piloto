package br.com.piloto.faces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.piloto.model.Ricardo;

@ViewScoped
@ManagedBean(name = "ricardoFaces")
public class RicardoFaces extends CrudFaces<Ricardo> {

	@PostConstruct
	protected void init() {
		this.clearFields();		
		setFieldOrdem("descricao");
	}

}
