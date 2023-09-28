package Personaje;

public class Principal {
    public static void main(String[] args) {
        /**
         * personaje se usa para llamar el contenido que esta en la clase personaje a la clase principal se crea un objeto
         * con cualquier nombre en este caso alfred o bruno para asi poder llamar las variables que se necesitan para cada frase
         */
        Personaje.Personaje bruno = new Personaje.Personaje("Bruno diaz","Soy Batman!!!","Jamas matare un villano");

        System.out.println("Mi nombre es " + bruno.getNombre() + " y yo " + bruno.getFrase());
        System.out.println("yo soy Batman y " + bruno.getRegla());

        Personaje.Personaje alfred = new Personaje.Personaje("Alfred Pennyworth", "un mayordomo", "limpiare");

        System.out.println("mi nombre es " + alfred.getNombre() + " y soy " + alfred.getFrase());
        System.out.println("yo en estos momentos " + alfred.getRegla() + " la Baticueva");
    }
}
