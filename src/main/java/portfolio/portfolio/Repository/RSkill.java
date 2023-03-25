/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolio.portfolio.Repository;

import portfolio.portfolio.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RSkill extends JpaRepository<Skill, Integer>{
    Optional<Skill> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
