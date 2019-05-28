/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.aniss.dao;

import ca.aniss.model.Cars;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Anis
 */
public class CarsDAO {

    public static ArrayList<String> getListeDistinctAnnee() {
        ArrayList<String> listeLangues = new ArrayList();
        Connection conn = DataManager.getInstance().getConnection();
        if (conn != null) {
            try {
                String requette = "SELECT DISTINCT(ANNEE) "
                        + "FROM CARS ORDER BY ANNEE DESC";

                System.out.println(requette);
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(requette);
                String annee;
                while (rs.next()) {
                    annee = rs.getString(1);
                    listeLangues.add(annee);
                    System.out.println("*=*=*=*=*=*=*=*=*= Liste de langues " + annee + " *=*=*=*=*=*=*=*=*=");
                }
                // return listeEditeurs;
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                DataManager.getInstance().closeConnection();
            }
        }
        return listeLangues;
    }

    public static ArrayList<String> getListeDistinctMarque(String annee) {
        ArrayList<String> listeMarque = new ArrayList();
        Connection conn = DataManager.getInstance().getConnection();
        if (conn != null) {
            try {
                String requette = "SELECT DISTINCT(MARQUE) "
                        + "FROM CARS "
                        + "WHERE "
                        + " ANNEE = '" + annee + "' ORDER BY MARQUE";

                System.out.println(requette);
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(requette);
                String marque;
                while (rs.next()) {
                    marque = rs.getString(1);
                    listeMarque.add(marque);
                    System.out.println("*=*=*=*=*=*=*=*=*= Marque " + marque + " *=*=*=*=*=*=*=*=*=");
                }
                // return listeEditeurs;
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                DataManager.getInstance().closeConnection();
            }
        }
        return listeMarque;
    }

    public static ArrayList<String> getListeDistinctModele(String annee, String marque) {
        ArrayList<String> listeModelele = new ArrayList();
        Connection conn = DataManager.getInstance().getConnection();
        if (conn != null) {
            try {
                String requette = "SELECT DISTINCT(MODELE) "
                        + "FROM CARS "
                        + "WHERE "
                        + "ANNEE = '" + annee + "' AND MARQUE = '" + marque + "' ORDER BY MODELE";

                System.out.println(requette);
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(requette);
                String modele;
                while (rs.next()) {
                    modele = rs.getString(1);
                    listeModelele.add(modele);
                    System.out.println("*=*=*=*=*=*=*=*=*= Modele: " + modele + " *=*=*=*=*=*=*=*=*=");
                }
                // return listeEditeurs;
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                DataManager.getInstance().closeConnection();
            }
        }
        return listeModelele;
    }

    public static ArrayList<Cars> getListeDistinctCars(String annee, String marque, String modele) {
        ArrayList<Cars> listeCars = new ArrayList();
        Connection conn = DataManager.getInstance().getConnection();
        if (conn != null) {
            try {
                String requette = " SELECT * "
                        + " FROM CARS "
                        + " WHERE "
                        + " ANNEE  = '" + annee + "'"
                        + " AND MARQUE  = '" + marque + "'"
                        + " AND MODELE  = '" + modele + "'";

                System.out.println(requette);
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(requette);
                Cars cars;
                while (rs.next()) {
                    cars = new Cars();
                    cars.setId(rs.getBigDecimal("ID"));
                    cars.setAnnee(rs.getString("ANNEE"));
                    cars.setMarque(rs.getString("MARQUE"));
                    cars.setModele(rs.getString("MODELE"));
                    cars.setCategorie(rs.getString("CATEGORIE"));
                    cars.setCylindree(rs.getString("CYLINDREE"));
                    cars.setCylindres(rs.getString("CYLINDREs"));
                    cars.setTransmission(rs.getString("TRANSMISSION"));
                    cars.setTypecarbur(rs.getString("Typecarbur"));
                    cars.setConsomcarville(rs.getString("CONSOMCARVILLE"));
                    cars.setConsomcarrout(rs.getString("CONSOMCARROUT"));
                    cars.setConsomcomb(rs.getString("CONSOMCARCOMB"));
                    cars.setConsomcombi(rs.getString("CONSOMCARCOMBMI"));
                    cars.setEmissionsco(rs.getString("EMISSIONSCO2"));

                    listeCars.add(cars);
                    System.out.println("*=*=*=*=*=*=*=*=*= Liste de langues " + cars + " *=*=*=*=*=*=*=*=*=");
                }
                // return listeEditeurs;
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                DataManager.getInstance().closeConnection();
            }
        }
        return listeCars;
    }

}
