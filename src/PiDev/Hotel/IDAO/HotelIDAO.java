/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiDev.Hotel.IDAO;
import PiDev.Hotel.entity.Hotel;
import java.util.List;

/**
 *
 * @author Fadoua
 */
public interface HotelIDAO {
    
    void AjouterHotel (Hotel h);
    
    boolean ModifierHotel (Hotel h);
    
    void SupprimerHotel (int id);
    
    Hotel ChercherHotel (int id);
    
   List<Hotel> ChercherHotel2 (String nom);
    
     List<Hotel> AfficherHotel();
    
}
