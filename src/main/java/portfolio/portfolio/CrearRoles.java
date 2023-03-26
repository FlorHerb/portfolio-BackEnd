/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.portfolio;

import portfolio.portfolio.Security.Entity.Rol;
import portfolio.portfolio.Security.Enums.RolNombre;
import portfolio.portfolio.Security.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario
 */
@Component
public class CrearRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;   

    @Override
    public void run(String... args) throws Exception {
    /*
        Esto sólo se ejecuta 1 vez para crear roles, para que existan cuando se creen los usuarios.
         */ 
     //  Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
     //  Rol rolUser = new Rol(RolNombre.ROLE_USER);
     //  rolService.save(rolAdmin);
     //   rolService.save(rolUser);
       
    }
}
