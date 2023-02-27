package ma.enova.repas.workflow.admin.process.planningexecution.save;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;

import ma.enova.repas.ws.dto.PlanningRepasDto;
import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.process.AbstractProcessOutput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlanningExecutionSaveAdminOutput  extends AbstractProcessOutput {

     private String datePlanningExecution ;
     private Long quantiteExecution  ;
     private String commentaire  ;

    private PlanningRepasDto planningRepas ;



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePlanningExecution(){
         return this.datePlanningExecution;
    }
    public void setDatePlanningExecution(String datePlanningExecution){
        this.datePlanningExecution = datePlanningExecution;
    }

    @Log
    public Long getQuantiteExecution(){
        return this.quantiteExecution;
    }
    public void setQuantiteExecution(Long quantiteExecution){
        this.quantiteExecution = quantiteExecution;
    }

    @Log
    public String getCommentaire(){
        return this.commentaire;
    }
    public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
    }


    public PlanningRepasDto getPlanningRepas(){
        return this.planningRepas;
    }

    public void setPlanningRepas(PlanningRepasDto planningRepas){
        this.planningRepas = planningRepas;
    }

}
