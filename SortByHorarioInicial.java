/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.va;

import java.util.Comparator;

 /**
         *
         * @author letic
         */

public class SortByHorarioInicial implements Comparator<ReservaHorario>{
    
    @Override
    public int compare(ReservaHorario a, ReservaHorario b){
        return a.getHorarioInicial()-b.getHorarioInicial();
    }
    
}
