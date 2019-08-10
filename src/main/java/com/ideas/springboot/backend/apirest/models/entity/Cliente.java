package com.ideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * The Class Cliente.
 * @author Israel Bejarano
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** The nombre. */
	@Column(nullable = false)
	@NotEmpty
	@Size(min = 4, max = 20)
	private String nombre;
	
	/** The apellido. */
	@NotEmpty
	private String apellido;
	
	/** The email. */
	@Column(nullable = false, unique = true)
	@Email
	@NotEmpty
	private String email;
	
	/** The create at. */
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	/**
	 * Pre persist.
	 */
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the creates the at.
	 *
	 * @return the creates the at
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * Sets the creates the at.
	 *
	 * @param createAt the new creates the at
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
}