/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.va; /**
         *
         * @author letic
         */

public class ReservaHorario {
    
private long id;
private Pessoa pessoa;
private Atracao atracao;
private int horarioInicial;
private int horarioFinal;

public ReservaHorario(long id, Pessoa pessoa, Atracao atracao,
int horarioInicial, int horarioFinal) {
this.id = id;
this.pessoa = pessoa;
this.atracao = atracao;
this.setHorarioInicial(horarioInicial);
this.setHorarioFinal(horarioFinal);

}


public long getId(){
    return this.id;
}

public int getHorarioInicial(){
    return this.horarioInicial;
}

public void setHorarioInicial(int horario){
    if( horario >=0 && horario <= 23){
        this.horarioInicial = horario;
    }
}

public void setHorarioFinal(int horario){
    if (horario >= 0 && horario <= 23 ){
        if(horario > this.horarioFinal){
            this.horarioFinal = horario;
        }
}
}


}
    

