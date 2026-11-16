/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacaquirink_comandocolores;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sacaquirink_comandocolores.VistaColores;
/**
 *
 * @author Estudiante
 */
public class Controlador {
    
    private VistaColores vista;
    private HistorialColores historialColores ;
    private configuracionMuestreoColores colores;

    public Controlador() {
        vista = new VistaColores();
        historialColores = new HistorialColores();
        colores = new configuracionMuestreoColores();
        
        configurarEventos();

    }
    
    public void iniciar(){
        this.vista.setVisible(true);
    }
    
    public void configurarEventos(){
        
        eventoBotones();
    }
    
    private void agregarComando(String color){
        
        if (color == "Red") {
            historialColores.ejecutar(new CambiarColor(colores, "Red"));
            vista.getPtnColor().setBackground(Color.RED);
        }
        else if (color == "Amarillo") {
            historialColores.ejecutar(new CambiarColor(colores, "Amarillo"));
            vista.getPtnColor().setBackground(Color.YELLOW);
        }else 
        {
            historialColores.ejecutar(new CambiarColor(colores, "Verde"));
            vista.getPtnColor().setBackground(Color.GREEN);
        }
        
        
    }
    private void desacherComando(){
        String color1 = colores.getColor();
             if (color1 == "Red") {
            historialColores.ejecutar(new CambiarColor(colores, "Red"));
            vista.getPtnColor().setBackground(Color.RED);
        }
        else if (color1 == "Amarillo") {
            historialColores.ejecutar(new CambiarColor(colores, "Amarillo"));
            vista.getPtnColor().setBackground(Color.YELLOW);
        }else 
        {
            historialColores.ejecutar(new CambiarColor(colores, "Verde"));
            vista.getPtnColor().setBackground(Color.GREEN);
        }
    }
    
    
    public void eventoBotones(){
       vista.getBtnAmarillo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                agregarComando("Amarillo");
                
            }
        });
       vista.getBtnRojo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarComando("Red");
            }
        });
       vista.getBtnVerde().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarComando("Verde");
            }
        });
       vista.getBtnDesacher().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desacherComando();
            }
        });
    }
    
}
