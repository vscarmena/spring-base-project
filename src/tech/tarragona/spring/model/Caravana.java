package tech.tarragona.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the caravana database table.
 *
 */
@Entity
@NamedQuery(name="Caravana.findAll", query="SELECT c FROM Caravana c")
public class Caravana implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String plate;

    private int adults;

    private int babys;

    private String brand;

    @Column(name="construction_year")
    private int constructionYear;

    private String description;

    private int kids;

    private String model;

    private String name;

    //bi-directional one-to-one association to Caracteristica
    @OneToOne(mappedBy="caravana")
    private Caracteristica caracteristica;

    //bi-directional one-to-one association to Norma
    @OneToOne(mappedBy="caravana")
    private Norma norma;

    //bi-directional one-to-one association to Servicio
    @OneToOne(mappedBy="caravana", targetEntity=Servicio.class)
    private Servicio servicio;

    public Caravana() {
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getAdults() {
        return this.adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getBabys() {
        return this.babys;
    }

    public void setBabys(int babys) {
        this.babys = babys;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getConstructionYear() {
        return this.constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKids() {
        return this.kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Caracteristica getCaracteristica() {
        return this.caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Norma getNorma() {
        return this.norma;
    }

    public void setNorma(Norma norma) {
        this.norma = norma;
    }

    public Servicio getServicio() {
        return this.servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

}