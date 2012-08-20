package br.com.piloto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.topsys.database.hibernate.TSActiveRecordAb;
import br.com.topsys.util.TSUtil;

@Entity
@Table(name = "anderson")
public class Anderson extends TSActiveRecordAb<Anderson>  {

	@Id
	@SequenceGenerator(name = "ANDERSON_ID_SEQ", sequenceName = "anderson_id_seq", allocationSize = 1)
	@GeneratedValue(generator="ANDERSON_ID_SEQ", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String descricao;

	public Long getId() {
		return TSUtil.tratarLong(id);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}		
	
	
	
}
