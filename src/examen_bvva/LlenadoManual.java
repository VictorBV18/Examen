
package examen_bvva;

public class LlenadoManual extends Datos{ //-----------------------AQUI HAY HERENCIA-----------------------
    
    
    public LlenadoManual(){
    }
    
    
    @Override //----------------Aqui Esta El Polimorfismo
    public void Visualizacion(){//---------------LIGADURA DINAMICA
    
        System.out.println("La Cancion es: "+nombre);
        System.out.println("El Artista es: "+artista);
        System.out.println("El Album es: "+album);
        System.out.println("El Año es:"+año);
        System.out.println("El Genero de la cancion es:"+genero);
        System.out.println("El Compositor es: "+compositor);
        System.out.println("La Disquera es: "+disquera);
    }
    
    
}
