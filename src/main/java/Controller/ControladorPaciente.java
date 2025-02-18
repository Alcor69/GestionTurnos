/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rb940
 */
public class ControladorPaciente {
    private List<Paciente> pacientes;

    public ControladorPaciente() {
        pacientes = new ArrayList<>();
    }

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Paciente buscarPaciente(String numeroIdentificacion) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                return paciente;
            }
        }
        return null; // Si no se encuentra el paciente
    }

    public void eliminarPaciente(String numeroIdentificacion) {
        Paciente paciente = buscarPaciente(numeroIdentificacion);
        if (paciente != null) {
            pacientes.remove(paciente);
        }
    }

    public List<Paciente> obtenerPacientes() {
        return pacientes;
    }
}
