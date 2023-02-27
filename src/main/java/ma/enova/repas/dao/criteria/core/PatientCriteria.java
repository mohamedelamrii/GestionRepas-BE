package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;



public class PatientCriteria extends BaseCriteria {

    private String ipp;
    private String ippLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String cin;
    private String cinLike;
    private String codeRamed;
    private String codeRamedLike;



    public PatientCriteria(){}

    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }
    public String getIppLike(){
        return this.ippLike;
    }
    public void setIppLike(String ippLike){
        this.ippLike = ippLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public String getCodeRamed(){
        return this.codeRamed;
    }
    public void setCodeRamed(String codeRamed){
        this.codeRamed = codeRamed;
    }
    public String getCodeRamedLike(){
        return this.codeRamedLike;
    }
    public void setCodeRamedLike(String codeRamedLike){
        this.codeRamedLike = codeRamedLike;
    }


}
