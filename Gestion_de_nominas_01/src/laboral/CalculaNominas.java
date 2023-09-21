package laboral;

public class CalculaNominas {
    Empleado emp;
    private void escribe(Empleado emp){
        emp.imprime();
        Nomina nomina = new Nomina();
        System.out.println("El empleado "+emp.nombre+ "tiene un sueldo de "+nomina.sueldo(emp));
    }

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
