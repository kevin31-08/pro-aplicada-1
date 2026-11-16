/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacaquirink_comandocolores;

/**
 *
 * @author Estudiante
 */
public class configuracionMuestreoColores {
    private String color = "AZUL";

    public void CambiarConfiguracionMuestreo(String nuevoColor) {
        color = nuevoColor;
    }

    public String getColor() {
        return color;
    }
}
