/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.campitos.unidad1;

/**
 *
 * @author campitos
 */
public class EvaluarAlumno {
    
    public static void main(String args[]){
        Alumno a=new Alumno();
        //Manera que funciona pero incorrecta!!! de asignarle valore s los atributos
        a.examenFinal=12;
        System.out.println("Lo siguiente esta mal, no es correcta una calificacion de 12!!");
        System.out.println(a.examenFinal);
        System.out.println("¿Cómo hacer para que no salga una calificación de"
                + " mas de 10 o negativa sin que se ponga lógica en esta clase?");
    }
    
}
