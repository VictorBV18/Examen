
package examen_bvva;

import java.util.Scanner;

public abstract class Datos { //--------->Aqui Utilizamos abstract por lo que es Polimorfismo
    Scanner s = new Scanner(System.in);
    String nombre, artista, genero, album, disquera, compositor;
    int año;
        public Datos(){
}
        
        
        
        public void LlenadoManual() {
        System.out.println("Ingrese El Nombre de la Canción:");
        nombre = s.next();
            System.out.println("Ingrese El Nombre Del Artista");
            artista=s.next();
            System.out.println("Ingrese El Tipo de Genero");
            genero=s.next();
            System.out.println("Ingrese El Album");
            album=s.next();
            System.out.println("Ingrese El Nombre de la Disquera");
            disquera=s.next();
            System.out.println("Ingrese El Nombre Del Compositor");
            compositor=s.next();
            System.out.println("Ingrese El Año en el que salio la Cancion");
            año=s.nextInt();
            

    }
        
        public abstract void Visualizacion(); //--------->Aqui Utilizamos abstract por lo que es Polimorfismo
        
        
        
        
}


