/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.modelo.Estudante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isael
 */
public class Banco {
    private static List<Estudante> listaEstudante = new ArrayList<>();
    
    
    static{
        //tipo um método q tem tudo estático, um bloco de códigos
        Estudante estudante = new Estudante();
        estudante.setNome("Sobral");
        Estudante estudante2 = new Estudante();
        estudante2.setNome("Gael");
        listaEstudante.add(estudante);
        listaEstudante.add(estudante2);
        //Collections.sort(listaEmpresas);
        
    }
    public void cadastrarEstudante(Estudante estudante){
        Banco.listaEstudante.add(estudante);
    }
    
    public List<Estudante> getEstudantes(){
        return Banco.listaEstudante;
    }
 
    public Estudante getEstudantesId(int id){
        for(Estudante estudante:listaEstudante){
            if(estudante.getId()==id){
                return estudante;
            }
        }
        return null;
    }
}
