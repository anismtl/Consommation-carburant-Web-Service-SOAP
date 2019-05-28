/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.aniss.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Anis
 */
@XmlRootElement
public class Cars {

    private BigDecimal id;
    private String annee;
    private String marque;
    private String modele;
    private String categorie;
    private String cylindree;
    private String cylindres;
    private String transmission;
    private String typecarbur;
    private String consomcarville;
    private String consomcarrout;
    private String consomcomb;
    private String consomcombi;
    private String emissionsco;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCylindree() {
        return cylindree;
    }

    public void setCylindree(String cylindree) {
        this.cylindree = cylindree;
    }

    public String getCylindres() {
        return cylindres;
    }

    public void setCylindres(String cylindres) {
        this.cylindres = cylindres;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTypecarbur() {
        return typecarbur;
    }

    public void setTypecarbur(String typecarbur) {
        this.typecarbur = typecarbur;
    }

    public String getConsomcarville() {
        return consomcarville;
    }

    public void setConsomcarville(String consomcarville) {
        this.consomcarville = consomcarville;
    }

    public String getConsomcarrout() {
        return consomcarrout;
    }

    public void setConsomcarrout(String consomcarrout) {
        this.consomcarrout = consomcarrout;
    }

    public String getConsomcomb() {
        return consomcomb;
    }

    public void setConsomcomb(String consomcomb) {
        this.consomcomb = consomcomb;
    }

    public String getConsomcombi() {
        return consomcombi;
    }

    public void setConsomcombi(String consomcombi) {
        this.consomcombi = consomcombi;
    }

    public String getEmissionsco() {
        return emissionsco;
    }

    public void setEmissionsco(String emissionsco) {
        this.emissionsco = emissionsco;
    }                                                                  
    
}
