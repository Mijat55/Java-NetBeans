/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;


import jakarta.persistence.Entity;

import jakarta.persistence.ManyToOne;



@Entity
public class Predavac extends Entitet{
    
	private String iban;
	@ManyToOne
	private Osoba osoba;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
        

	

	
	}

	
    
    
  
    

