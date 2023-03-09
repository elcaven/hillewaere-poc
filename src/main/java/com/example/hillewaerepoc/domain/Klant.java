package com.example.hillewaerepoc.domain;

import java.io.Serializable;

public class Klant implements Serializable {

  private String telefoon;

  public String getTelefoon() {
    return telefoon;
  }

  public void setTelefoon(String telefoon) {
    this.telefoon = telefoon;
  }
}
