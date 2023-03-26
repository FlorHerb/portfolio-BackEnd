package portfolio.portfolio.Controller;

import portfolio.portfolio.Dto.DtoSkill;
import portfolio.portfolio.Entity.Skill;
import portfolio.portfolio.Security.Controller.Mensaje;
import portfolio.portfolio.Service.SSkill;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","https://florencia-herber-portfolio.web.app/"})
@RequestMapping("/skill")
public class CSkill {

    @Autowired
    SSkill sskill;

    @GetMapping("/lista")
    public ResponseEntity<List<Skill>> list() {
        List<Skill> list = sskill.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Skill> getById(@PathVariable("id") int id) {
        if (!sskill.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe la habilidad"), HttpStatus.NOT_FOUND);
        }
        Skill hYs = sskill.getOne(id).get();
        return new ResponseEntity(hYs, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sskill.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe la habilidad"), HttpStatus.NOT_FOUND);
        }
        sskill.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoSkill dtoSkill) {
        if (StringUtils.isBlank(dtoSkill.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sskill.existsByNombre(dtoSkill.getNombre())) {
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        }

        Skill hYs = new Skill(dtoSkill.getNombre(), dtoSkill.getPorcentaje());
        sskill.save(hYs);

        return new ResponseEntity(new Mensaje("Habilidad agregada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoSkill dtoSkill) {
        //Validamos si existe el ID
        if (!sskill.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de skills
        if (sskill.existsByNombre(dtoSkill.getNombre()) && sskill.getByNombre(dtoSkill.getNombre()).get()
                .getId() != id) {
            return new ResponseEntity(new Mensaje("Esa habilidad ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtoSkill.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Skill sk = sskill.getOne(id).get();
        sk.setNombre(dtoSkill.getNombre());
        sk.setPorcentaje(dtoSkill.getPorcentaje());

        sskill.save(sk);
        return new ResponseEntity(new Mensaje("Habilidad actualizada"), HttpStatus.OK);

    }
}
