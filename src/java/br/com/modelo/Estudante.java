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

     private int id;
    private String nome;
    private Date dataNascimento = new Date();
    private static int tipoOrdenar = 0;
    
   
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
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
    public  int getTipoOrdenar() {
        return tipoOrdenar;
    }

   
    public void setTipoOrdenar(int aTipoOrdenar) {
        tipoOrdenar = aTipoOrdenar;
    }
    @Override
    public int compareTo(Estudante e){
        if(e.getTipoOrdenar()== 0){
          return nome.compareToIgnoreCase(e.getNome());  
        }else{
            return dataNascimento.compareTo(e.getDataNascimento());
        }
        
    }
}
