/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.aniss.ws;

import ca.aniss.dao.CarsDAO;
import ca.aniss.model.Cars;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Anis
 */
@WebService(serviceName = "CarsWS")
public class CarsWS {

    /**
     * Web service operation
     * @param annee
     */
    @WebMethod(operationName = "getMarque")
    public ArrayList<String> getMarque(@WebParam(name = "annee") String annee) {
        ArrayList<String> listeMarque = new ArrayList();
        listeMarque=CarsDAO.getListeDistinctMarque(annee);
        return listeMarque;
    }
    
        @WebMethod(operationName = "getAnnee")
    public ArrayList<String> getAnnee() {
        ArrayList<String> listeAnnee = new ArrayList();
        listeAnnee=CarsDAO.getListeDistinctAnnee();
        return listeAnnee;
    }

    /**
     * Web service operation
     * @param annee
     * @param marque
     * @return 
     */
    @WebMethod(operationName = "getModele")
    public ArrayList<String> getModele(@WebParam(name = "annee") String annee, @WebParam(name = "marque") String marque) {
          ArrayList<String> listeModele = new ArrayList();
        listeModele=CarsDAO.getListeDistinctModele(annee, marque);
        
        return listeModele;
    }

    /**
     * Web service operation
     * @param annee
     * @param marque
     * @param modele
     */
    @WebMethod(operationName = "getCars")
    public ArrayList<Cars> getCars(@WebParam(name = "annee") String annee, @WebParam(name = "marque") String marque, @WebParam(name = "modele") String modele) {
           ArrayList<Cars> listeCars = new ArrayList();
        listeCars=CarsDAO.getListeDistinctCars(annee, marque, modele);
        return listeCars;
    }
    
}
