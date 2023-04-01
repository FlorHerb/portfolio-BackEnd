/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.portfolio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombre;
    private String anio;
    private String descripcion;
    @NotNull
    @Size(min = 1, max = 300, message = "no cumple con la longitud")
    private String img;

    public Proyecto(String nombre, String año, String descripcion, String img) {
        this.id = id;
        this.nombre = nombre;
        this.anio = año;
        this.descripcion = descripcion;
        this.img = img;
    }
    
    public Proyecto(){}

    
}
