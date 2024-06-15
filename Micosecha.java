public class Micosecha{
    public class Fruta{ //Clase fruta
      private String nombre;
      private int calorias;
  
      // Constructor
      public Fruta(String nombre, int calorias){ 
        
        this.nombre = nombre;
        this.calorias = calorias;
      }
      //Getters
      public String getNombre(){
        return nombre;
      }
  
      public int getCalorias(){
        return calorias;
      }
      
      //Metodo mostrarInformacion
      public void mostrarInformacion(){
        System.out.println();
        System.out.println("Calorias: " + calorias);
      }  
    }
    // Clase Personaje
    public class Personaje{
      private String nombre; 
      private int puntosGanados; 
      private boolean esPrincipal; 
      //Constructor 1
      public Personaje(String nombre, boolean esPrincipal){
        this.nombre = nombre; 
        this.esPrincipal = esPrincipal;
      }
      //Constructor 2
      public Personaje(String nombre){
        this.nombre = nombre;
      }
      // Metodo recolectarFruta
      public void recolectarFruta(Fruta fruta){
        // Este método aumenta la variable puntosGanados del personaje.  Si es el personaje principal gana dos veces las calorías de la fruta, si no lo es, gana solo el valor de las calorías.
        if(esPrincipal){
          puntosGanados = puntosGanados + (2*fruta.getCalorias());
        }
        else{
          puntosGanados = puntosGanados + fruta.getCalorias();
        }
      }
    }
  
    
  }