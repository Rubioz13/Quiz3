public class Personaje {
    String nombre;
    String frase;
    String regla;

    /**
     *
     * @param nombre,frase,regla.
     * son variables para poder poner tanto un valor o palabra, en este caso en la clase principal con la ayuda del objeto "bruno o alfred" y en este caso usando el getter
     * trayendo alguna de las variables para completar lo que se necesita.
     * @this  significa que esta variable es igual al nombre en el constructor "public Personaje" ya se esta pdiendo que se iguale la variable

     */
    public Personaje(String nombre, String frase, String regla) {
        this.nombre = nombre;
        this.frase = frase;
        this.regla = regla;
    }

    /**
     *
     * @return se trae "get" la variable nombre para el mensjae que se desea hacer y luego se necesita retornar para que asi no tome una variable
     * inexistente y vuelva por asi decirlo al inicio sin ningun movimiento.
     */
    public String getNombre() {
        return nombre;
    }

    public String getFrase() {
        return frase;
    }

    public String getRegla() {
        return regla;
    }

}