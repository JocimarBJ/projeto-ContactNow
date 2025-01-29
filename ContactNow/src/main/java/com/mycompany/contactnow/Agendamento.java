/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactnow;
import java.time.LocalDateTime;

/**
 *
 * @author jocim
 */
public class Agendamento {
    private LocalDateTime dateTime;
    private Contato contato;
    private String description;

    public Agendamento(LocalDateTime dataHora, Contato contato, String descricao) {
        this.dateTime = dataHora;
        this.contato = contato;
        this.description = descricao;
    }

    // Getters e Setters
    public LocalDateTime getDataHora() { return dateTime; }
    public void setDataHora(LocalDateTime dataHora) { this.dateTime = dateTime; }
    public Contato getContato() { return contato; }
    public void setContato(Contato contato) { this.contato = contato; }
    public String getDescricao() { return description; }
    public void setDescricao(String descricao) { this.description = description; }
}
