package vn.loto.exercise06;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class bean {
    private String nom;
    private String prenom;
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String envoyer(){
        return "bonjour";
    }
    @Override
    public String toString(){
        return prenom + "" + nom;
    }
}
