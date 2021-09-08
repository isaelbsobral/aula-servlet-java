/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author isael
 */
public class Estudante implements Comparable<Estudante>{
    private int id;
    private String nome;
   // private double media;
   
    /*public double getMedia() {
        return media;
    }*/

    
    /*public void setMedia(double media) {
        this.media = media;
    }*/

   
    
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
