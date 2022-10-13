/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.va;

import java.util.Iterator;
import java.util.List;

 /**
         *
         * @author letic
         */

public interface IRepositorioReservas {
    
    void adicionarReserva(ReservaHorario reserva);
    void removerReserva(long idReserva);
    public List<ReservaHorario> listarReservasPorHorario();
    int qtdDeReservasPorAtracao(long idAtracao);

    
}
