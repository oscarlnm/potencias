package potencias;

public class Potencia {
    private int tabla;
    private int numero;

    public Potencia(int tabla) {
        this.tabla = tabla;
        this.numero = 1;
    }

    public boolean hasNext() {
        return numero <= 10;
    }

    public String obtenerSiguienteMultiplicacion() {
        if (numero <= 10) {
            String multiplicacion = tabla + " X " + numero + " = " + (tabla * numero);
            numero++;
            return multiplicacion;
        } else {
            return "Fin de la tabla del " + tabla;
        }
    }
}
