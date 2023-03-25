/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.portfolio.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.portfolio.Entity.Proyecto;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
     public Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
