/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Polaznik {
    @Id
     @Column(columnDefinition = "decimal(18,2)")
    private BigDecimal brojUgovora;
    

    public BigDecimal getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(BigDecimal brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    

   
    
    
}
