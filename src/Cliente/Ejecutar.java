/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Datos.ByContract;
import Persistencia.BaseDatos;
import java.util.Date;

/**
 *
 * @author B106 PC-11
 */
public class Ejecutar {
    public static void main(String[] args){
        Date fecha = new Date("12/12/2016");
        ByContract contrato = new ByContract(2, 100, fecha, "A", "Fabian");
        System.out.println(contrato);
    BaseDatos bd = new BaseDatos();
    bd.almacenar(contrato);
    }
    
}
