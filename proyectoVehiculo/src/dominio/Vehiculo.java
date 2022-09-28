/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author ingri
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifas;
    private boolean disponibilidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifas, boolean disponibilidad) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifas = tarifas;
        this.disponibilidad = disponibilidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifas() {
        return tarifas;
    }

    public void setTarifas(double tarifas) {
        this.tarifas = tarifas;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.matricula);
        hash = 47 * hash + Objects.hashCode(this.marca);
        hash = 47 * hash + Objects.hashCode(this.modelo);
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.tarifas) ^ (Double.doubleToLongBits(this.tarifas) >>> 32));
        hash = 47 * hash + (this.disponibilidad ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(this.tarifas) != Double.doubleToLongBits(other.tarifas)) {
            return false;
        }
        if (this.disponibilidad != other.disponibilidad) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Vehiculo{");
//        sb.append("matricula=").append(matricula);
//        sb.append(", marca=").append(marca);
//        sb.append(", modelo=").append(modelo);
//        sb.append(", color=").append(color);
//        sb.append(", tarifas=").append(tarifas);
//        sb.append(", disponibilidad=").append(disponibilidad);
//        sb.append('}');
//        return sb.toString();
//    }


    
    
    
    
    
    
    
}
