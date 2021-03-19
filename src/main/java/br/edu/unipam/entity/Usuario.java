/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unipam.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author JrAdilson
 */
@Entity
@NamedQuery(name = Usuario.GET_ALL_USERS, query = "select u from Usuario u order by u.nome")
public class Usuario extends AbstractEntity {
  public static final String GET_ALL_USERS = "Usuario.getAllUsers";

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;
  private String Email;
  private String email;

  @OneToMany(mappedBy = "usuario")
  private Collection<Tarefa> tarefas;
@@ -38,18 +42,10 @@ public void setNome(String nome) {
  }

  public String getEmail() {
    return Email;
    return email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  public Long getId() {
    return id;
    this.email = Email;
  }

  public void setId(Long id) {
    this.id = id;
  }      
}