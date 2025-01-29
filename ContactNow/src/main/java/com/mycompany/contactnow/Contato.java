/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactnow;

/**
 *
 * @author jocim
 */
public class Contato {
    private String name;
    private String telephone;
    private String email;
    private String address;

//Método construtor
    public Contato() {
        name = "";
        telephone = "";
        email = "";
        address = "";
    }

//Sobrecarregado
    public Contato(String name, String telephone, String email, String address) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }
    
//Getters e Setters
    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
