package laboral;

public class Empleado extends Persona {
    private int categoria;
    public double anyosTrabajados;

    //CONSTRUCTORES
    public Empleado(String nombre, String dni, char sexo, int categoria, double anyosTrabajados) throws DatosNoCorrectosException{
        super(nombre, dni, sexo);
        this.categoria = categoria;
        if (anyosTrabajados >= 0) {
            this.anyosTrabajados = anyosTrabajados;
        } else {
            throw new DatosNoCorrectosException("Los años trabajados deben ser mayores que 0");
        }
    }

    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
        categoria = 1;
        anyosTrabajados = 0;
    }

    //METODOS
    public void setCategoria(int categoria) throws DatosNoCorrectosException {
        if (categoria >= 1 && categoria <= 10) {
            this.categoria = categoria;
        } else {
            throw new DatosNoCorrectosException("La categoria tiene que estar entre 1 y 10 incluyendolos");
        }
    }

    public int getCategoria() {
        return categoria;
    }

    public void incrAnyo() {
        anyosTrabajados++;
    }

    public void imprime() {
        System.out.println("Nombre: " + nombre + ", DNI: " + dni + ", sexo: " + sexo + ", Categoria: " + categoria + ", Anyos Trabajados: " + anyosTrabajados);
    }
}
