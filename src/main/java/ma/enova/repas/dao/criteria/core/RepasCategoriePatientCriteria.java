package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;



public class RepasCategoriePatientCriteria extends BaseCriteria {


    private RepasCriteria repas ;
    private List<RepasCriteria> repass ;
    private CategoriePatientCriteria categoriePatient ;
    private List<CategoriePatientCriteria> categoriePatients ;


    public RepasCategoriePatientCriteria(){}


    public RepasCriteria getRepas(){
        return this.repas;
    }

    public void setRepas(RepasCriteria repas){
        this.repas = repas;
    }
    public List<RepasCriteria> getRepass(){
        return this.repass;
    }

    public void setRepass(List<RepasCriteria> repass){
        this.repass = repass;
    }
    public CategoriePatientCriteria getCategoriePatient(){
        return this.categoriePatient;
    }

    public void setCategoriePatient(CategoriePatientCriteria categoriePatient){
        this.categoriePatient = categoriePatient;
    }
    public List<CategoriePatientCriteria> getCategoriePatients(){
        return this.categoriePatients;
    }

    public void setCategoriePatients(List<CategoriePatientCriteria> categoriePatients){
        this.categoriePatients = categoriePatients;
    }
}
