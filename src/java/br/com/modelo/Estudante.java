/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import java.util.Date;

/**
 *
 * @author isael
 */
public class Estudante implements Comparable<Estudante>{

    /**
     * @return the dataNascimento
     */
    private int id;
    private String nome;
    private Date dataNascimento = new Date();
   // private double media;
   
    /*public double getMedia() {
        return media;
    }*/

    
    /*public void setMedia(double media) {
        this.media = media;
    }*/
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    

   
    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    @Override
    public int compareTo(Estudante e){
        return nome.compareTo(e.getNome());
    }
}
