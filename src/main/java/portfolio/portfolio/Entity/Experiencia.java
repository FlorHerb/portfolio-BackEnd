/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolio.portfolio.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String img;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String empleador;
    
    
    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String img, Date fecha_inicio, Date fecha_fin, String empleador) {
        this.id = id;
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.img = img;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.empleador = empleador;
    }

   
    
    
}
