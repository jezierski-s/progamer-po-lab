package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by michał on 2017-02-05.
 */

@Entity
public class GameOrder {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    //public List<Game> list;
    public String shipping;
    public String payment;
    public boolean facture;
    public String name;
    public String surname;
    public String street;
    public String homeNumber;
    public String flatNumber;
    public String city;
    public String postcode;
    public String factureNameComp;
    public String NIP;
    public String factureName;
    public String factureSurname;
    public String factureStreet;
    public String factureHomeNumber;
    public String factureFlatNumber;
    public String factureCity;
    public String facturePostCode;
    public double value;

    public void setId(Integer id) {
        this.id = id;
    }

    /*public void setList(List<Game> list) {
        this.list = list;
    }*/

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setFacture(boolean facture) {
        this.facture = facture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setFactureNameComp(String factureNameComp) {
        this.factureNameComp = factureNameComp;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setFactureName(String factureName) {
        this.factureName = factureName;
    }

    public void setFactureSurname(String factureSurname) {
        this.factureSurname = factureSurname;
    }

    public void setFactureStreet(String factureStreet) {
        this.factureStreet = factureStreet;
    }

    public void setFactureHomeNumber(String factureHomeNumber) {
        this.factureHomeNumber = factureHomeNumber;
    }

    public void setFactureFlatNumber(String factureFlatNumber) {
        this.factureFlatNumber = factureFlatNumber;
    }

    public void setFactureCity(String factureCity) {
        this.factureCity = factureCity;
    }

    public void setFacturePostCode(String facturePostCode) {
        this.facturePostCode = facturePostCode;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    /*public List<Game> getList() {
        return list;
    }*/

    public String getShipping() {
        return shipping;
    }

    public String getPayment() {
        return payment;
    }

    public boolean isFacture() {
        return facture;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getFactureNameComp() {
        return factureNameComp;
    }

    public String getNIP() {
        return NIP;
    }

    public String getFactureName() {
        return factureName;
    }

    public String getFactureSurname() {
        return factureSurname;
    }

    public String getFactureStreet() {
        return factureStreet;
    }

    public String getFactureHomeNumber() {
        return factureHomeNumber;
    }

    public String getFactureFlatNumber() {
        return factureFlatNumber;
    }

    public String getFactureCity() {
        return factureCity;
    }

    public String getFacturePostCode() {
        return facturePostCode;
    }

    public double getValue() {
        return value;
    }
}
