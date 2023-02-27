package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class PlanningCriteria extends BaseCriteria {

    private LocalDateTime dateDebut;
    private LocalDateTime dateDebutFrom;
    private LocalDateTime dateDebutTo;
    private LocalDateTime dateFin;
    private LocalDateTime dateFinFrom;
    private LocalDateTime dateFinTo;

    private CategoriePatientCriteria categoriePatient ;
    private List<CategoriePatientCriteria> categoriePatients ;
    private JourCriteria jour ;
    private List<JourCriteria> jours ;


    public PlanningCriteria(){}

    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateDebutFrom(){
        return this.dateDebutFrom;
    }
    public void setDateDebutFrom(LocalDateTime dateDebutFrom){
        this.dateDebutFrom = dateDebutFrom;
    }
    public LocalDateTime getDateDebutTo(){
        return this.dateDebutTo;
    }
    public void setDateDebutTo(LocalDateTime dateDebutTo){
        this.dateDebutTo = dateDebutTo;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public LocalDateTime getDateFinFrom(){
        return this.dateFinFrom;
    }
    public void setDateFinFrom(LocalDateTime dateFinFrom){
        this.dateFinFrom = dateFinFrom;
    }
    public LocalDateTime getDateFinTo(){
        return this.dateFinTo;
    }
    public void setDateFinTo(LocalDateTime dateFinTo){
        this.dateFinTo = dateFinTo;
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
    public JourCriteria getJour(){
        return this.jour;
    }

    public void setJour(JourCriteria jour){
        this.jour = jour;
    }
    public List<JourCriteria> getJours(){
        return this.jours;
    }

    public void setJours(List<JourCriteria> jours){
        this.jours = jours;
    }
}
