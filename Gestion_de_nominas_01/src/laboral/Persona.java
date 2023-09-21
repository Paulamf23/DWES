package laboral;

/**
 * Esta clase crea dos constructores. Tiene varios metodos que sirven para darle valores a los paramteros por teclado
 */
public class Persona {
    public String nombre, dni;
    public char sexo;

    /**
     * Constructor
     *
     * @param nombre
     * @param dni
     * @param sexo
     */
    public Persona(String nombre, String dni, char sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
    }

    /**
     * Constructor
     *
     * @param nombre
     * @param sexo
     */
    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    //METODOS
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Getter de nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de dni
     *
     * @return dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Imprime una cadena con los valores
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre:" + nombre + ", DNI='" + dni;
    }
}
