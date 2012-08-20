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
@Table(name = "ricardo")
public class Ricardo extends TSActiveRecordAb<Ricardo>  {

	@Id
	@SequenceGenerator(name = "RICARDO_ID_SEQ", sequenceName = "ricardo_id_seq", allocationSize = 1)
	@GeneratedValue(generator="RICARDO_ID_SEQ", strategy=GenerationType.SEQUENCE)
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
