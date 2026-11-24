package notas;

import org.apache.commons.text.WordUtils;

public class CalculadoraNotas {

    public String condicion(String nombre, double p1, double p2, double tp) {
        String n = WordUtils.capitalizeFully(nombre);
        if (p1 >= 7 && p2 >= 7) {
            if (tp >= 7) {
                return n + ": PROMOCIONADO";
            } else if (tp >= 4) {
                return n + ": REGULAR";
            } else {
                return n + ": LIBRE";
            }
        } else if (p1 >= 4 && p2 >= 4) {
            if (tp >= 4) {
                return n + ": REGULAR";
            } else {
                return n + ": LIBRE";
            }
        } else {
            return n + ": LIBRE";
        }
    }
}
