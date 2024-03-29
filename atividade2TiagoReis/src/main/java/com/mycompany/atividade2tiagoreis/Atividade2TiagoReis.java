/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2tiagoreis;

import java.util.Scanner;

/**
 *
 * @author palit
 */
public class Atividade2TiagoReis {

    public static void main(String[] args) {
        // Com o Singleto pego a instancia das fabricas tanto toyota quanto honda
        Toyota toyotaFactory = Toyota.getInstancia();
        Honda hondaFactory = Honda.getInstancia();
        
        Scanner scanner = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("Escolha uma opção");
            System.out.println("1. Escolher carro");
            System.out.println("0. Sair do programa");
            
            System.out.println("Opção: ");
            op = scanner.nextInt();
            scanner.nextLine();
            
            switch(op){
                case 1:
                    System.out.println("Escolha entre Toyota ou Honda: ");
                    String toyotaOrHonda = scanner.nextLine().toLowerCase();
                    
                    
                    switch(toyotaOrHonda){
                        case "toyota":
                            System.out.println("Você escolheu um Toyota, dentre desses qual voce quer");
                            System.out.println("1. Hilux");
                            System.out.println("2. Corolla");
                            System.out.println("3. Etios");
                            System.out.println("Opção: ");
                            String modeloDesejadoT = scanner.nextLine().toLowerCase();
                            IVehicle toyota = toyotaFactory.makeVehicle(modeloDesejadoT);
                            
                            if(toyota != null){
                                switch(modeloDesejadoT){
                                    case "hilux":
                                        System.out.println("Você tem um " + modeloDesejadoT);
                                        toyota.start();
                                        toyota.stop();
                                        toyota.drive();
                                        break;
                                    case "corolla":
                                        System.out.println("Você tem um " + modeloDesejadoT);
                                        toyota.start();
                                        toyota.stop();
                                        toyota.drive();
                                        break;
                                    case "etios":
                                        System.out.println("Você tem um " + modeloDesejadoT);
                                        toyota.start();
                                        toyota.stop();
                                        toyota.drive();
                                        break;    
                                }
                            }
                            break;
                        case "honda":
                            System.out.println("Você escolheu um Honda, dentre desses qual você quer");
                            System.out.println("1. Civic");
                            System.out.println("2. City");
                            System.out.println("3. Fit");
                            String modeloDesejadoH = scanner.nextLine().toLowerCase();
                            IVehicle honda = hondaFactory.makeVehicle(modeloDesejadoH);
                            
                            if(honda != null){
                                switch(modeloDesejadoH){
                                    case "civic":
                                        System.out.println("Você tem um " + modeloDesejadoH);
                                        honda.start();
                                        honda.stop();
                                        honda.drive();
                                        break;
                                    case "city":
                                        System.out.println("Você tem um " + modeloDesejadoH);
                                        honda.start();
                                        honda.stop();
                                        honda.drive();
                                        break;
                                    case "fit":
                                        System.out.println("Você tem um " + modeloDesejadoH);
                                        honda.start();
                                        honda.stop();
                                        honda.drive();
                                        break;    
                                }
                            }
                    break;
                    }
            break;
            }
        }while(op!=0);
    }
}

