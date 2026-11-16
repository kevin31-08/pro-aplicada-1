/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacaquirink_comandocolores;

/**
 *
 * @author Estudiante
 */
public class CambiarColor implements Comando{
        private final configuracionMuestreoColores receptor;
    private final String nuevoColor ;
    private String colorAnterior;

    public CambiarColor(configuracionMuestreoColores receptor, String nuevoColor) {
        this.receptor = receptor;
        this.nuevoColor = nuevoColor;
    }

    @Override
    public void ejecutar() {
        String intervalo = receptor.getColor();
        
        receptor.CambiarConfiguracionMuestreo(nuevoColor);
        colorAnterior= intervalo;
        
                
    }
    @Override
    public void desacher() {
        receptor.CambiarConfiguracionMuestreo(colorAnterior);
    }
}
