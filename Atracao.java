/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.va; /**
         *
         * @author letic
         */

public class Atracao {
    
private long id;
private String descricao;
private int capacidadeMax;
private int idadeMinima;

public Atracao(long id, String descricao, int capacidade, int idadeMinima) {
this.id = id;
this.descricao = descricao;
this.capacidadeMax = capacidade;
this.idadeMinima = idadeMinima;
}


public long getId(){
    return this.id;
}

public String getDescricao(){
    return this.descricao;
}

public int getCapacidadeMax(){
    return this.capacidadeMax;
}

public int getIdadeMinima(){
    return this.idadeMinima;
}

@Override
public boolean equals(Object o){
        return o instanceof Atracao && getId()==this.id;
    }
}

