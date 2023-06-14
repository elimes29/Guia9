/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author usuario
 */
public class CantanteFamoso {

    private String nombre;
    private String discoMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoMasVentas) {
        this.nombre = nombre;
        this.discoMasVentas = discoMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVentas() {
        return discoMasVentas;
    }

    public void setDiscoMasVentas(String discoMasVentas) {
        this.discoMasVentas = discoMasVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoMasVentas=" + discoMasVentas + '}';
    }



}
