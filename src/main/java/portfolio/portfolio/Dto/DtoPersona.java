/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.portfolio.Dto;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
public class DtoPersona {
    @NotBlank
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotBlank
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    private String img;
    
    private String ocupacion;
    
    private String ubicacion;

    public DtoPersona (String nombre, String apellido, String img, String ocupacion, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.ocupacion = ocupacion;
        this.ubicacion = ubicacion;
    }
    
    public DtoPersona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
