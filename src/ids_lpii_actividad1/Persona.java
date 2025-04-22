/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ids_lpii_actividad1;

import javax.swing.JOptionPane;

/**
 *
 * @author godllyra
 */
public class Persona {
    private float peso;
    private float estatura;
    private float imc;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = getPeso() / (getEstatura() * getEstatura());
    }
    
    
    public void mostartIMC() {
        JOptionPane.showConfirmDialog(null, "Su IMC es " +  getImc());
        if (getImc() < 18.5){
            JOptionPane.showInputDialog(null, "Bajo peso");

        } else if (getImc() >= 18.5 && getImc() <= 24.9) {
            JOptionPane.showInputDialog(null, "Normal");    

        } else if (getImc() >= 25.0 && getImc() <= 29.9) {
            JOptionPane.showInputDialog(null, "Sobrepeso");
        } else if (getImc() >= 30.0 && getImc() <= 34.9) {
            JOptionPane.showInputDialog(null, "Obesidad I");
        } else if (getImc() >= 35.0 && getImc() <= 39.9) {
            JOptionPane.showInputDialog(null, "Obesidad II");
        } else {
            JOptionPane.showInputDialog(null, "Obesidad III");
        }
    }
}
