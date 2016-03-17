/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiDev.Hotel.GUI;

import PiDev.Hotel.DAO.HotelDAO;
import PiDev.Hotel.entity.Hotel;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Firasss
 */
public class Ajout extends Application{
    
    public static void main(String[] args) {
	Application.launch(Ajout.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox v = new VBox(20);
        HBox h1 = new HBox(95);
        HBox h2 = new HBox(55);
        HBox h3 = new HBox(30);
        HBox h4 = new HBox(40);
        Scene sc = new Scene(v,900,600);
        
        Label l1 = new Label("Nom");
        Label l2 = new Label("Categorie");
        Label l3 = new Label("Disponibilité");
        Label l4 = new Label("Description");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        
        Button ajouter = new Button("ajouter");
        ajouter.setMinWidth(200);
        ajouter.getStyleClass().add("button-add");
        ajouter.setOnAction(e ->{ 
            Hotel h = new Hotel();
            HotelDAO hd = new HotelDAO();
            h.setDescription(t4.getText());
            h.setNomHotel(t1.getText());
            h.setCategorie(Integer.parseInt(t2.getText()));
            h.setDisponibilite(Integer.parseInt(t3.getText()));
            h.setVille_id(1);
            hd.AjouterHotel(h);
        });
        
        h1.getChildren().addAll(l1,t1);
        h2.getChildren().addAll(l2,t2);
        h3.getChildren().addAll(l3,t3);
        h4.getChildren().addAll(l4,t4);
        v.getChildren().addAll(h1,h2,h3,h4,ajouter);
        
        sc.getStylesheets().add("Ressources/JavaFX.css");
        stage.setScene(sc);
        v.setAlignment(Pos.CENTER);
        v.setFillWidth(false);
        stage.show();
    }
    
}
