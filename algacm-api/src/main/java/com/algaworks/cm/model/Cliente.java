package com.algaworks.cm.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // especifica que a classe representa uma entidade no banco de dados. O estado da classe anotada com essa annotation é gerenciado pelo contexto de persistência subjacente.
public class Cliente {

	@Id //especifica o identificador da entidade. Qualquer entidade precisa ter um atributo identificador, este que é usado ao carregar a entidade em um determinado contexto de persistência.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //especifica que o valor do identificador de entidade é gerado automaticamente utilizando a coluna de identidade, uma sequência de banco de dados ou um gerador de tabelas.
	private Long id;
	@Column(nullable = false)//especifica o mapeamento entre um atributo básico e a coluna da tabela de banco de dados.
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
