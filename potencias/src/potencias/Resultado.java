package potencias;

public class Resultado {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Potencia potencia = new Potencia(i);
            System.out.println("Tabla del " + i + ":");
            while (potencia.hasNext()) {
                System.out.println(potencia.obtenerSiguienteMultiplicacion());
            }
            System.out.println(); // Separador entre tablas
        }
    }
}
