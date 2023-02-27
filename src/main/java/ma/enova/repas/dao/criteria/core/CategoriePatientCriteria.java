package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;



public class CategoriePatientCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String nombrePatientTotal;
    private String nombrePatientTotalMin;
    private String nombrePatientTotalMax;



    public CategoriePatientCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getNombrePatientTotal(){
        return this.nombrePatientTotal;
    }
    public void setNombrePatientTotal(String nombrePatientTotal){
        this.nombrePatientTotal = nombrePatientTotal;
    }   
    public String getNombrePatientTotalMin(){
        return this.nombrePatientTotalMin;
    }
    public void setNombrePatientTotalMin(String nombrePatientTotalMin){
        this.nombrePatientTotalMin = nombrePatientTotalMin;
    }
    public String getNombrePatientTotalMax(){
        return this.nombrePatientTotalMax;
    }
    public void setNombrePatientTotalMax(String nombrePatientTotalMax){
        this.nombrePatientTotalMax = nombrePatientTotalMax;
    }
      

}
