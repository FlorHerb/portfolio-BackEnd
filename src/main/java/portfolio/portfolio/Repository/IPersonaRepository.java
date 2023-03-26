package portfolio.portfolio.Repository;

import java.util.Optional;
import portfolio.portfolio.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.portfolio.Entity.Educacion;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
