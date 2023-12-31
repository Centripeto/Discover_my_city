package com.boomers.www.discover_my_city.persistance.model;

import com.boomers.www.discover_my_city.model.Role;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
  @Id private String id;
  private String name;
  private String surname;
  private String email;
  private Role role;

  public User() {}

  public User(String id, String name, String surname, String email, Role role) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.role = role;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
