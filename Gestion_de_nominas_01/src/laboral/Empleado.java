package laboral;

/**
 * Esta clase crea dos constructores, uno en el que se comprueba que los anyos trabajados son correctos y otro en el que se establecen
 * la categoria y los anyostrabajados por defecto como 1 y 0. Tiene varios metodos que añaden anyos y establecen otros valores por teclado de la categoria
 */
public class Empleado extends Persona {
    private int categoria;
    public double anyosTrabajados;

    /**
     * Constructor
     * @param nombre
     * @param dni
     * @param sexo
     * @param categoria
     * @param anyosTrabajados
     * @throws DatosNoCorrectosException
     */
    public Empleado(String nombre, String dni, char sexo, int categoria, double anyosTrabajados) throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
        this.categoria = categoria;
        if (anyosTrabajados >= 0) {
            this.anyosTrabajados = anyosTrabajados;
        } else {
            throw new DatosNoCorrectosException("Los años trabajados deben ser mayores que 0");
        }
    }

    /**
     * Constructor
     * @param nombre
     * @param dni
     * @param sexo
     */
    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
        categoria = 1;
        anyosTrabajados = 0;
    }

    /**
     * Setter de categoria
     * @param categoria
     * @throws DatosNoCorrectosException
     */
        public void setCategoria(int categoria) throws DatosNoCorrectosException {
        if (categoria >= 1 && categoria <= 10) {
            this.categoria = categoria;
        } else {
            throw new DatosNoCorrectosException("La categoria tiene que estar entre 1 y 10 incluyendolos");
        }
    }

    /**
     * Getter de categoría
     *
     * @return categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Incrementa los anyostrabajados en 1
     */
    public void incrAnyo() {
        anyosTrabajados++;
    }

    /**
     * Imprime los valores establecidos
     */
    public void imprime() {
        System.out.println("Nombre: " + nombre + ", DNI: " + dni + ", sexo: " + sexo + ", Categoria: " + categoria + ", Anyos Trabajados: " + anyosTrabajados);
    }
}
