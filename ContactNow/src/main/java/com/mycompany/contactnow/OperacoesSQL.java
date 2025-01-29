/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactnow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacoesSQL {
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/ContactNow";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "rancho50";

 public static void main(String[] args){
    Connection con = null;
    Statement s = null;
    ResultSet rs = null;
    
    String criar = "CREATE TABLE aluno("
            + "id int primary key not null,"
            + "nome text,"
            + "email text)";
    
    try{
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, senha);
        System.out.println("\nCriando a tabela...");
        s = con.createStatement();
        s.executeUpdate(criar);
        s.close();
        con.close();
    } catch(Exception ex){
        System.out.println("ex");
    }
    String inserir = "INSERT INTO aluno VALUES(1, 'Jocimar', 'jocimarjunior@aluno.utfpr.edu.br')";
    
    try{
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, senha);
        System.out.println("\nInserindo dados...");
        s = con.createStatement();
        s.executeUpdate(inserir);
        s.close();
        con.close();
    } catch(Exception ex){
        System.out.println("ex");
    }
    
    String consultar = "SELECT * from aluno";
    try{
        Class.forName(driver); //Carrega o driver para fazer a interface/integração entre a aplicação java e o banco
        con = DriverManager.getConnection(url, user, senha); //Abre o canal pro banco de dados
        System.out.println("\nConsultando dados...");
        s = con.createStatement(); //intermédio/interpretador entre o SQL e o Java
        rs= s.executeQuery(consultar);
        while(rs.next())
        {
            System.out.println("ID="+rs.getInt(1));
            System.out.println("NOME="+rs.getString(2));
            System.out.println("EMAIL="+rs.getString(3));
        }
        s.close();
        con.close();
    } catch(Exception ex){
        System.out.println("ex");
    }
  }
}