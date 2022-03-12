package com.cit_562.final_project.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String name;
  private String ccBrand;
  private String ccNum;
  private String ccExpiration;
  private String ccSecCode;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCCBrand() {
    return ccBrand;
  }

  public void setCCBrand(String ccBrand) {
    this.ccBrand = ccBrand;
  }

  public String getCCNum() {
    return ccNum;
  }

  public void setCCNum(String ccNum) {
    this.ccNum = ccNum;
  }

  public String getCCExpiration() {
    return ccExpiration;
  }

  public void setCCExpiration(String ccExpiration) {
    this.ccExpiration = ccExpiration;
  }

  public String getCCSecCode() {
    return ccSecCode;
  }

  public void setCCSecCode(String ccSecCode) {
    this.ccSecCode = ccSecCode;
  }

}