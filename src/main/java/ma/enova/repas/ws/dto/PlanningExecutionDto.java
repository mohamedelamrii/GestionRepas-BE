package  ma.enova.repas.ws.dto;

import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlanningExecutionDto  extends AuditBaseDto {

    private String datePlanningExecution ;
    private Long quantiteExecution  ;
    private String commentaire  ;

    private PlanningRepasDto planningRepas ;


    public PlanningExecutionDto(){
        super();
    }



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
