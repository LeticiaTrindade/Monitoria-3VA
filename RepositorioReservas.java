/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.va;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Iterator;

/**
 *
 * @author letic
 */
public class RepositorioReservas implements IRepositorioReservas {

    private ArrayList<ReservaHorario> reservas;

    public RepositorioReservas() {
        this.reservas = new ArrayList<ReservaHorario>();
    }

    @Override
    public void adicionarReserva(ReservaHorario reservaHorario) {

        boolean achouReserva = false;
        for (ReservaHorario r : reservas) {
            if (r.getId() == reservaHorario.getId()) {
                System.out.println("Essa reserva já existe");
                achouReserva = true;
            }

        }
            if (!achouReserva) {
                reservas.add(reservaHorario);
            }
    }

    @Override
    public void removerReserva(long idReserva) {
        boolean achouReserva = false;
        for (ReservaHorario r : reservas) {
            if (r.getId() == idReserva) {
                reservas.remove(r);
                achouReserva = true;
                
            }
            
        }
        if(achouReserva = false){
            System.out.println("Não existe");
        }
    }
    
    
     public int qtdDeReservasPorAtracao(long idAtracao){
            int quantidade = 0;
            for (int i = 0; i < reservas.size(); i++){
            ReservaHorario reserva = reservas.get(i);
            if(equals(reserva)){
                quantidade = quantidade + 1;
            }
        }
            return quantidade;
    }

    public List<ReservaHorario> listarReservasPorHorario(){
        List<ReservaHorario> lista = new ArrayList();
        for(ReservaHorario item: reservas){
            lista.add(item);
        }
        Collections.sort(lista, new SortByHorarioInicial());
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }
      return lista;
    }
    
}
