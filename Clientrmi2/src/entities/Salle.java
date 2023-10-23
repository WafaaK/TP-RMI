/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp
 */

public class Salle implements Serializable{
private static final long serialVersionUID = 3331042307832753479L;
    private int id;
    private String code;

    private List<Machine> machines;

    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    public Salle(int id, String code, List<Machine> machines) {
        this.id = id;
        this.code = code;
        this.machines = machines;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code+ '}';
    }
    
}

