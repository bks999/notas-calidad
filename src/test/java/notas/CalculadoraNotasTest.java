package notas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraNotasTest {

    private final CalculadoraNotas calculadora = new CalculadoraNotas();

    @Test
    void todasLasNotasSieteOMasPromociona() {
        // Arrange
        String nombre = "ana";

        // Act
        String resultado = calculadora.condicion(nombre, 8, 7, 9);

        // Assert
        assertEquals("Ana: PROMOCIONADO", resultado);
    }

    @Test
    void parcialesDeSieteYTrabajoPracticoDeCincoRegulariza() {
        // Arrange
        String nombre = "ana";

        // Act
        String resultado = calculadora.condicion(nombre, 8, 7, 5);

        // Assert
        assertEquals("Ana: REGULAR", resultado);
    }

    @Test
    void todasLasNotasCuatroOMasRegulariza() {
        // Arrange
        String nombre = "ana";

        // Act
        String resultado = calculadora.condicion(nombre, 5, 4, 6);

        // Assert
        assertEquals("Ana: REGULAR", resultado);
    }

    @Test
    void unParcialMenorACuatroQuedaLibre() {
        // Arrange
        String nombre = "ana";

        // Act
        String resultado = calculadora.condicion(nombre, 3, 9, 9);

        // Assert
        assertEquals("Ana: LIBRE", resultado);
    }

    @Test
    void trabajoPracticoMenorACuatroQuedaLibre() {
        // Arrange
        String nombre = "ana";

        // Act
        String resultado = calculadora.condicion(nombre, 8, 8, 2);

        // Assert
        assertEquals("Ana: LIBRE", resultado);
    }

    @Test
    void elNombreSeMuestraConMayusculaInicial() {
        // Arrange
        String nombre = "juan perez";

        // Act
        String resultado = calculadora.condicion(nombre, 8, 8, 8);

        // Assert
        assertEquals("Juan Perez: PROMOCIONADO", resultado);
    }
}
