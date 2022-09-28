/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectovehiculo;
import dominio.Vehiculo;
/**
 *
 * @author ingri
 */
public class ProyectoVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo coche1 = new Vehiculo("1234");
        System.out.println(coche1);
        Vehiculo coche2 = new Vehiculo("2345","opel", "astra", "azul", 20.0, true);
        System.out.println(coche2);
        
    }
    
}
