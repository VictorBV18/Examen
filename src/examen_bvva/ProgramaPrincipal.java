package examen_bvva;

import java.util.Scanner;

public class ProgramaPrincipal {

    /*EL Programa que elaborare, constara en una "Encuesta" hacia una persona cualquiera,
y esta podra decidir si meter datos en general o elegir opciones rapidas,
dependiendo de la opcion que elija, sera la manera en la que se desarrollara el programa*/
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String respuesta;
        int opcion, a=0, b=0;
        

        System.out.println("-----------------------------SISTEMA INICIADO---------------------\n");
        System.out.println("¿Deseas Contestar Una Encuesta?\n");
        System.out.println("s=Si, n=No");

        respuesta = s.next();
        while (respuesta.equals("Si") || respuesta.equals("si") || respuesta.equals("s") || respuesta.equals("S")) {

            System.out.println("¿Como Deseas Contestar Esta Encuesta?");
            System.out.println("\nHay 2 Maneras de contestarla\n");
            System.out.println("Opcion 1) Tu llenas Los Datos Manualmente\n");
            System.out.println("Opcion 2) Elegir una opcion de DATOS PREESTABLECIDOS\n");

            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste LLENADO MANUAL\n");
                    LlenadoManual lm = new LlenadoManual();
                    lm.LlenadoManual();
                    lm.Visualizacion();

                    break;
                case 2:
                    System.out.println("Elegiste DATOS PREESTABLECIDOS\n");
                    System.out.println("Hay 3 Opciones Para Elegir.\n Opcion 1) Rap\n Opcion 2)Otra Cancion De Rap Opcion\n Opcion 3) Regional Mexicano\n Opcion 4) Rock\n");
                    opcion = s.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Elegiste el Rap");
                            LlenadoAutomatico la = new LlenadoAutomatico("La Bella Y La Bestia", "Porta", "Transtorno Bipolar", 2009, "Rap", "Porta", "Universal Music");

                            la.metodo();

                            break;
                        case 2:
                            System.out.println("Elegiste una Segunda Opcion de RAP");
                            LlenadoAutomatico2 la2= new LlenadoAutomatico2();
                            LlenadoManual lab2= new LlenadoManual(); 
                            la2.Visualizacion();
                            
                            break;
                            
                            
                        case 3:
                            System.out.println("Elegiste El Regional Mexicano");
                            LlenadoAutomatico lb = new LlenadoAutomatico("Te Metiste", "Ariel Camacho", "El Karma", 2014, "Regional Mexicano", "Sergio Mercado", "Del Records");
                            lb.metodo(a);
                            break;
                            
                            
                            
                        case 4:
                            System.out.println("Elegiste El Rock");
                            LlenadoAutomatico lc = new LlenadoAutomatico("Triste Cancion De Amor", "El Tri", "Simplemente", 1985, "Rock", "Alex Lora", "Comrock");
                            lc.metodo(a,b);
                    }

                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }

            System.out.println("\n\n¿Deseas Contestar Otra Vez la  encuesta?");
            System.out.println("Si/No");
            respuesta = s.next();
        }

        System.out.println("-----------------------------SISTEMA INICIADO---------------------\n");
    }

}
