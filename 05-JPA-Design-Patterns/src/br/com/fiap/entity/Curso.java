package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T_CURSO (SQ_T_CURSO)
 *   	*cd_curso (NUMBER) (PK)
 *  	*nm_curso (VARCHAR2) (15))
 *  	*dt_lancamento (DATE)
 * 		ds_categoria (VARCHAR2) (Enum: TECNICO, BACHAREL, POS)
 * 
 */

@Entity
@Table(name = "T_CURSO")
@SequenceGenerator(name = "curso", sequenceName = "SQ_T_CURSO", allocationSize =1 )
public class Curso {
	
	
	@Id
	@Column(name="cd_curso", nullable = false)
	@GeneratedValue(generator = "curso", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_curso", nullable =false, length = 15)
	private String nome;
	
	@Column(name = "dt_lancamento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar datalancamento;
	
	
	@Column(name = "ds_categoria")
	@Enumerated(EnumType.STRING)
	private Categoria categoria;


	public Curso(int codigo, String nome, Calendar datalancamento, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.datalancamento = datalancamento;
		this.categoria = categoria;
	}
	
	public Curso(String nome, Calendar datalancamento, Categoria categoria) {
		
		this.nome = nome;
		this.datalancamento = datalancamento;
		this.categoria = categoria;
	}

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDatalancamento() {
		return datalancamento;
	}

	public void setDatalancamento(Calendar datalancamento) {
		this.datalancamento = datalancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
	

}


