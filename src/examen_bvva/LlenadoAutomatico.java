
package examen_bvva;

public class LlenadoAutomatico  {

    private final String artista;
    private final String nombre;
    private final String genero;
    private final String album;
    private final String disquera;
    private final int año;
    private final String compositor;
    


    public LlenadoAutomatico(String nombre, String artista, String album, int año, String genero, String compositor, String disquera) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.disquera = disquera;
        this.compositor = compositor;
        this.año = año;
    }

    
    
        
    //--------------------->TODO ESTO ES SOBRECARGA DE METODOS. 
    public void metodo(){
        System.out.println("\nLa Cancion es: "+nombre+"\nEl Artista es: "+artista+"\nEl Album es: "+album+"\nEl Año es:"+año+"\nEl Genero de la cancion es:"+genero+"\nEl Compositor es: "+compositor+"\nLa Disquera es: "+disquera);
    
    }
    
    public void metodo(int a){
    
         System.out.println("\nLa Cancion es: "+nombre+"\nEl Artista es: "+artista+"\nEl Album es: "+album+"\nEl Año es:"+año+"\nEl Genero de la cancion es:"+genero+"\nEl Compositor es: "+compositor+"\nLa Disquera es: "+disquera);
     
    }
     public void metodo(int b, int c){
    
         System.out.println("\nLa Cancion es: "+nombre+"\nEl Artista es: "+artista+"\nEl Album es: "+album+"\nEl Año es:"+año+"\nEl Genero de la cancion es:"+genero+"\nEl Compositor es: "+compositor+"\nLa Disquera es: "+disquera);
     
    }

}
