/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

public class Machine implements Serializable{
    private static final long serialVersionUID = - 9104124658106926988L;
   
    private int id;

    private String ref;
    private String marque;
    private double prix;
    private Salle salle;
    
  

    public Machine() {
    }

    public Machine(int id,String ref, String marque, double prix) {
        this.id=id;
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        
        
    }

    public Machine(String ref, String marque, double prix) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

   

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + '}';
    }

}
