package laboral;

/**
 * Esta clase crea un array con los diferentes sueldos aumentandose en 2000 cada vez
 * y se calcula el sueldo segun cada categoria de empleado restandole 1 para que la operacion salga correcta pues el array empieza en 0
 */
public class Nomina {
    private static final int SUELDO_BASE[] =
            {50000, 70000, 90000, 110000, 130000,
                    150000, 170000, 190000, 210000, 230000};

    /**
     * Calculo del sueldo
     *
     * @return sueldo
     */
    public double sueldo(Empleado empleado) {
        double sueldo = SUELDO_BASE[empleado.getCategoria() - 1] + 5000 * empleado.anyosTrabajados;
        return sueldo;
    }
}
