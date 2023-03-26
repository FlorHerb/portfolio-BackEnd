
package portfolio.portfolio.Service;

import portfolio.portfolio.Entity.Persona;
import portfolio.portfolio.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.portfolio.Entity.Proyecto;

@Service
public class SPersona{
    @Autowired IPersonaRepository ipersonaRepository;
    
    
        public List<Persona> list() {
        return ipersonaRepository.findAll();
    }

    public Optional<Persona> getOne(Long id) {
        return ipersonaRepository.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return ipersonaRepository.findByNombre(nombre);
    }

    public void save(Persona pers) {
        ipersonaRepository.save(pers);
    }

    public void delete(Long id) {
        ipersonaRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return ipersonaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return ipersonaRepository.existsByNombre(nombre);
    }
    
}
