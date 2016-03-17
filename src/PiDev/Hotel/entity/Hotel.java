/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiDev.Hotel.entity;

/**
 *
 * @author Fadoua
 */
public class Hotel {
    private int id;
    private String nomHotel;
    private String Description;
    private int Categorie;
    private int Disponibilite;
    private double longitude;
    private double latitude;
    private int Ville_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getCategorie() {
        return Categorie;
    }

    public void setCategorie(int Categorie) {
        this.Categorie = Categorie;
    }

    public int getDisponibilite() {
        return Disponibilite;
    }

    public void setDisponibilite(int Disponibilite) {
        this.Disponibilite = Disponibilite;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getVille_id() {
        return Ville_id;
    }

    public void setVille_id(int Ville_id) {
        this.Ville_id = Ville_id;
    }

    public Hotel(int id,String nomHotel, String Description, int Categorie, int Disponibilite, double longitude, double latitude, int Ville_id) {
        this.id = id;
        this.nomHotel = nomHotel;
        this.Description = Description;
        this.Categorie = Categorie;
        this.Disponibilite = Disponibilite;
        this.longitude = longitude;
        this.latitude = latitude;
        this.Ville_id = Ville_id;
    }

    public Hotel(String nomHotel, String Description, int Categorie, int Ville_id) {
        this.nomHotel = nomHotel;
        this.Description = Description;
        this.Categorie = Categorie;
        this.Ville_id = Ville_id;
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nomHotel=" + nomHotel + ", Description=" + Description + ", Categorie=" + Categorie + ", Disponibilite=" + Disponibilite + ", longitude=" + longitude + ", latitude=" + latitude + ", Ville_id=" + Ville_id + '}';
    }

    
    
    public Hotel() {
    }

    
    
    
    
}
