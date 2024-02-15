package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "email")
	private String clienteEmail;
	
	@Column(name = "telefone")
	private String clienteTelefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return clienteEmail;
	}

	public void setEmail(String email) {
		this.clienteEmail = email;
	}

	public String getTelefone() {
		return clienteTelefone;
	}

	public void setTelefone(String telefone) {
		this.clienteTelefone = telefone;
	}

	
	
}
