/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiDev.Hotel.DAO;
import PiDev.Hotel.IDAO.HotelIDAO;
import PiDev.Hotel.entity.Hotel;
import PiDev.Hotel.Util.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fadoua
 */
public class HotelDAO implements HotelIDAO  {
     Connection cnx;
     
     public HotelDAO () {
    
    cnx=MyConnection.getInstance();
    
    
}

    @Override
    public void AjouterHotel(Hotel h) {
         String query ="INSERT INTO hotel (nomHotel , Description ,Categorie,Disponibilite,latitude,longitude ,Ville_id) VALUES (?,?,?,?,?,?,?)";
         try {
             PreparedStatement pSt = cnx.prepareStatement(query);
            pSt.setString(1, h.getNomHotel());
            pSt.setString(2, h.getDescription());
            pSt.setInt(3, h.getCategorie());
            pSt.setInt(4, h.getDisponibilite());
            pSt.setDouble(5, h.getLatitude());
            pSt.setDouble(6, h.getLongitude());
            pSt.setInt(7, h.getVille_id());
             pSt.executeUpdate();
            
            
         } catch (SQLException ex) {
              System.out.println("problème d'ajout");
         }
    }

    @Override
    public boolean ModifierHotel(Hotel h) {
         String query = "UPDATE hotel SET nomHotel=? , Description=? , Categorie=? , Disponibilite=? where id=?";
         try {
            PreparedStatement pSt = cnx.prepareStatement(query);
            pSt.setString(1, h.getNomHotel());
            pSt.setString(2, h.getDescription());
            pSt.setInt(3, h.getCategorie());
            pSt.setInt(4, h.getDisponibilite());
            pSt.setInt(5, h.getId());
            pSt.executeUpdate();
            
            return true;
         } catch (SQLException ex) {
            System.out.println("pas de modification ");
             return false;
         }

    }

    @Override
    public void SupprimerHotel(int id) {
         String requete = "DELETE FROM hotel WHERE id=?";
         try {
             PreparedStatement ps = cnx.prepareStatement(requete);
              ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Hotel supprimé");
         } catch (SQLException ex) {
            System.out.println("Hotel non supprimé");
         }
           
    }

    @Override
    public Hotel ChercherHotel(int id) {
        Hotel h = new Hotel();
        String requete = "select * from hotel where id=?";
         try {
             PreparedStatement ps = cnx.prepareStatement(requete);
              ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            return h;
         } catch (SQLException ex) {
             System.out.println("erreur l'hotel est introuvable " + ex.getMessage());
            return null;
         }


        
    }

    @Override
    public List<Hotel> AfficherHotel() {
        List<Hotel> list = new ArrayList<>();
         String requete = "select * from hotel";
         try {
             Statement statement = cnx.createStatement();
             ResultSet resultat = statement.executeQuery(requete);
             while (resultat.next()) {  
                 Hotel h = new Hotel();
                 h.setNomHotel(resultat.getString("nomHotel"));
                 h.setDescription(resultat.getString("Description"));
                 h.setCategorie(resultat.getInt("Categorie"));
                 h.setDisponibilite(resultat.getInt("Disponibilite"));
                 h.setId(resultat.getInt("id"));
                list.add(h);
             }} 
         catch (SQLException ex) {
             Logger.getLogger(HotelDAO.class.getName()).log(Level.SEVERE, null, ex);
         }

           return list;
    }

    @Override
    public List<Hotel> ChercherHotel2(String nom) {
        List<Hotel> list = new ArrayList<>();
         String requete = "select * from hotel where upper(nomHotel) like upper('%"+nom+"%')";
         try {
             PreparedStatement ps = cnx.prepareStatement(requete);
             //ps.setString(1, nom);
             ResultSet resultat = ps.executeQuery();
             while (resultat.next()) {  
                 Hotel h = new Hotel();
                 h.setNomHotel(resultat.getString("nomHotel"));
                 h.setDescription(resultat.getString("Description"));
                 h.setCategorie(resultat.getInt("Categorie"));
                 h.setDisponibilite(resultat.getInt("Disponibilite"));
                 h.setId(resultat.getInt("id"));
                list.add(h);
             }} 
         catch (SQLException ex) {
             Logger.getLogger(HotelDAO.class.getName()).log(Level.SEVERE, null, ex);
         }

           return list;
    }

    
    
    
    
}
