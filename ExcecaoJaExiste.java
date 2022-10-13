/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.va; /**
         *
         * @author letic
         */

    
    public class ExcecaoJaExiste extends Exception {
    
    public ExcecaoJaExiste() {
        super("Ja existe");
    }

    public ExcecaoJaExiste(String message) {
        super(message);
    }
}

