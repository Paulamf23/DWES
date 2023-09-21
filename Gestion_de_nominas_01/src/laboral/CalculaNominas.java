package laboral;
/**
 * Esta clase tiene el main ademas
 * y se calcula el sueldo segun cada categoria de empleado restandole 1 para que la operacion salga correcta pues el array empieza en 0
 */
public class CalculaNominas {
    Empleado emp;

    /**
     * Escribe un mensaje en el que se dice el nombre del empleado y el sueldo calculado de dicho empleado
     * @param emp
     */
    private void escribe(Empleado emp){
        emp.imprime();
        Nomina nomina = new Nomina();
        System.out.println("El empleado "+emp.nombre+ "tiene un sueldo de "+nomina.sueldo(emp));
    }
    /**
     *En el main se crean varios empleados y se calculan sus nominas correspondientes
     * @throws DatosNoCorrectosException
     */
    public static void main(String[] args) throws DatosNoCorrectosException{
           try{
               Empleado emp1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
               Empleado emp2 = new Empleado("Ada Lovelace", "32000031r", 'F');

               CalculaNominas calcula = new CalculaNominas();

               calcula.escribe(emp1);
               calcula.escribe(emp2);

               System.out.println();
               System.out.println();

               emp2.incrAnyo();
               emp2.incrAnyo();
               emp1.setCategoria(9);

               calcula.escribe(emp1);
               calcula.escribe(emp2);
           }catch (DatosNoCorrectosException e){
               System.out.println("Los datos no son correctos");
           }
    }

}
