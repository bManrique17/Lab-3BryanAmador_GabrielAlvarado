/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3bryanamador_gabrielalvarado;

import java.util.Date;

/**
 *
 * @author Gabriel Alvarado
 */
public class Empleado extends Persona {
    public int horario;
    public int numeroProductosVendidos;

    public Empleado() {
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getNumeroProductosVendidos() {
        return numeroProductosVendidos;
    }

    public void setNumeroProductosVendidos(int numeroProductosVendidos) {
        this.numeroProductosVendidos = numeroProductosVendidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "horario=" + horario + ", numeroProductosVendidos=" + numeroProductosVendidos + '}';
    }
    
    
}
