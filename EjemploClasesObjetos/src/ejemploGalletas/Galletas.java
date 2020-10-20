package ejemploGalletas;

public class Galletas {
    //Constructor
    String ingrediente1;
    String ingrediente2;
    String ingrediente3;
    double tiempoCoccion;
    String color;

    public void coccion(double tiempoCoccion){

        if (tiempoCoccion >= 15 && tiempoCoccion <=20  ){
            System.out.println("La galleta esta lista");
        }
        else{
            if(tiempoCoccion >20){
                System.out.println("Su Galleta se quemo");
            }
            else{
                System.out.println("Su Galleta esta cruda, cocine un rato más");
            }
        }

    }
}
