/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiDev.Hotel.Test;

import static javafx.application.Application.launch;
import PiDev.Hotel.entity.Hotel;
import PiDev.Hotel.IDAO.HotelIDAO;
import PiDev.Hotel.entity.Hotel;
import PiDev.Hotel.Util.MyConnection;
import PiDev.Hotel.DAO.HotelDAO;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author Fadoua
 */
public class Mytest {
     public static void main(String[] args) {
       
         
         Hotel h = new Hotel(1,"mouradi","hotel chic",3,0,23.5,22.5,1);
         HotelDAO ih = new HotelDAO();
         Hotel h1 = new Hotel();
         h1.setDescription("firas");
         h1.setNomHotel("firas");
//         List<Hotel> list = new ArrayList<>();
//         list = ih.AfficherHotel();
//         System.out.println(list);
         ih.SupprimerHotel(17);
         
        
       
         
         
        
    }
}
