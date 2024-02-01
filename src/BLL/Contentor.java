/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;

/**
 *
 * @author PW
 */
public class Contentor implements Serializable {
    
    private int idContentor;
    private EstadoContentores estado;

    /**
     * @return the idContentor
     */
    public int getIdContentor() {
        return idContentor;
    }

    /**
     * @param idContentor the idContentor to set
     */
    public void setIdContentor(int idContentor) {
        this.idContentor = idContentor;
    }

    /**
     * @return the estado
     */
    public EstadoContentores getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoContentores estado) {
        this.estado = estado;
    }
    
    
    
}
