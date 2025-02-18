/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Turno;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rb940
 */
public class ControladorTurno {
    private List<Turno> turnos;

    public ControladorTurno() {
        turnos = new ArrayList<>();
    }

    public boolean asignarTurno(Turno turno) {
        // Verificar si el paciente ya tiene un turno para la misma fecha
        for (Turno t : turnos) {
            if (t.getPaciente().equals(turno.getPaciente()) && t.getFecha().equals(turno.getFecha())) {
                return false; // Ya tiene un turno para ese día
            }
        }
        turnos.add(turno);
        return true;
    }

    public List<Turno> obtenerTurnos() {
        return turnos;
    }
}
