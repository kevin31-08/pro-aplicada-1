/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sacaquirink_comandocolores;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 *
 * @author Estudiante
 */
public class HistorialColores {
    private final Deque<Comando> historialColor= new ArrayDeque();
    public void ejecutar(Comando comando){
        Objects.requireNonNull(comando).ejecutar();
        if (comando == null) {
            throw new NullPointerException("no hay color registrado");
        }
        comando.ejecutar();
    }
    public boolean desacherUltimo(){
        if (historialColor.isEmpty()) {
            System.err.println("hola");
            return false;
        }
        historialColor.peek().desacher();
        historialColor.pop();
        return true;
    }
    
}
