/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.va;

/**
 *
 * @author letic
 */
public class Pessoa {

private String cpf;
private int idade;

public Pessoa(String cpf, int idade) {
this.cpf = cpf;
this.idade = idade;

    }

public String getCPF(){
    return this.cpf;
}

public int getIdade(){
    return this.idade;
}


  @Override
    public boolean equals(Object o){
        if (o instanceof Pessoa && getCPF()==this.cpf){
        return true;
    }
        else{
            return false;
                    }
    }
}

