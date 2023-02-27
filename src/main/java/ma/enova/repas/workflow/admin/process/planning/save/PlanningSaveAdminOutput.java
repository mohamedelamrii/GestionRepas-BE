package ma.enova.repas.workflow.admin.process.planning.save;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;

import ma.enova.repas.ws.dto.CategoriePatientDto;
import ma.enova.repas.ws.dto.JourDto;
import ma.enova.repas.ws.dto.PlanningRepasDto;
import ma.enova.repas.ws.dto.TypeRepasDto;
import ma.enova.repas.ws.dto.RepasDto;
import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.process.AbstractProcessOutput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlanningSaveAdminOutput  extends AbstractProcessOutput {

     private String dateDebut ;
     private String dateFin ;

    private CategoriePatientDto categoriePatient ;
    private JourDto jour ;

    private List<PlanningRepasDto> planningRepass ;


    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebut(){
         return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
         return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }


    public CategoriePatientDto getCategoriePatient(){
        return this.categoriePatient;
    }

    public void setCategoriePatient(CategoriePatientDto categoriePatient){
        this.categoriePatient = categoriePatient;
    }
    public JourDto getJour(){
        return this.jour;
    }

    public void setJour(JourDto jour){
        this.jour = jour;
    }

    public List<PlanningRepasDto> getPlanningRepass(){
        return this.planningRepass;
    }

    public void setPlanningRepass(List<PlanningRepasDto> planningRepass){
        this.planningRepass = planningRepass;
    }
}
