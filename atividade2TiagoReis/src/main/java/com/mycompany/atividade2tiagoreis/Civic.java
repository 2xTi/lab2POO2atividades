/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2tiagoreis;

/**
 *
 * @author palit
 */
public class Civic implements IVehicle{

    @Override
    public void start() {
        System.out.println("Honda Civic ligado");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda Civic");
    }

    @Override
    public void stop() {
        System.out.println("Honda Civic parado");    
    }
    
}