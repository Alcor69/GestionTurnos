/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author rb940
 */
public class VentanaAdministracion {
    private static VentanaAdministracion instancia;

    private VentanaAdministracion() {
        // Inicializar la ventana de administración
    }

    public static VentanaAdministracion obtenerInstancia() {
        if (instancia == null) {
            instancia = new VentanaAdministracion();
        }
        return instancia;
    }
}
