/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.programa05;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author btoarriola
 */
public class Programa05 {

    public static void main(String[] args) {
        DAOEmpleado dao = new DAOEmpleado();
        Empleado empleado = new Empleado();
        //emple.setClave(13);
        long id=13;
        empleado.setNombre("nuevo");
        empleado.setDireccion("calle");
        empleado.setTelefono("333");
        //dao.create(emple);
        //dao.update(empleado, id);
        
//        List<Empleado> listemple = dao.findAll();
//        for (Empleado emple : listemple) {
//            String msg=String.valueOf(emple.getClave()+" "+emple.getNombre()+" "+emple.getDireccion()+" "+emple.getTelefono());
//            Logger.getLogger(Programa05.class.getName()).log(Level.INFO, msg);
//        }

        Empleado FindById = dao.FindById(id);
        String msg=String.valueOf(FindById.getClave()+" "+FindById.getNombre()+" "+FindById.getDireccion()+" "+FindById.getTelefono());
        
        Logger.getLogger(Programa05.class.getName()).log(Level.INFO, msg);
               
        System.out.println("Hello World!");
    }
}
