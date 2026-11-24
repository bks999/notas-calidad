package notas;

import org.apache.commons.text.WordUtils;

public class CalculadoraNotas {

    private static final double NOTA_PROMOCION = 7;
    private static final double NOTA_APROBACION = 4;

    public String condicion(String nombre, double parcial1, double parcial2, double tp) {
        return WordUtils.capitalizeFully(nombre) + ": " + calcularCondicion(parcial1, parcial2, tp);
    }

    private String calcularCondicion(double parcial1, double parcial2, double tp) {
        if (todasAlMenos(NOTA_PROMOCION, parcial1, parcial2, tp)) {
            return "PROMOCIONADO";
        }
        if (todasAlMenos(NOTA_APROBACION, parcial1, parcial2, tp)) {
            return "REGULAR";
        }
        return "LIBRE";
    }

    private boolean todasAlMenos(double minimo, double... notas) {
        for (double nota : notas) {
            if (nota < minimo) {
                return false;
            }
        }
        return true;
    }
}
