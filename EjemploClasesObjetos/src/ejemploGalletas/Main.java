package ejemploGalletas;

public class Main {

    public static void main(String[] args) {

        Galletas galletaAvena;
        galletaAvena = new Galletas();

        // Aquí le puedo poner los atributos que decidi para cocinarla
        galletaAvena.color = "Crema";
        galletaAvena.ingrediente1 = "Avena";
        galletaAvena.ingrediente2 = "Chips Chocolate";
        galletaAvena.ingrediente3 = "Manteca";
        //Uso el metodo que cree para saber el estado de mi cocción
        galletaAvena.coccion(15);

    }
}
