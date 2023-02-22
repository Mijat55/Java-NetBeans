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
public class Smjer {
    @Id
    private Integer sifra;
    @Column(
            name = "nazivsmjera",
            nullable = false, 
            length = 50)
    private String naziv;
    private Integer trajanje;
    @Column(columnDefinition = "decimal(18,2)")
    private BigDecimal cijena;
    @Column(columnDefinition = "decimal(18,2)")
    private BigDecimal upisnina;
    private Boolean certificiran; 

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public Boolean getCertificiran() {
        return certificiran;
    }

    public void setCertificiran(Boolean certificiran) {
        this.certificiran = certificiran;
    }
    
}
