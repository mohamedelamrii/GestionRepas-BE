package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class PlanningExecutionCriteria extends BaseCriteria {

    private LocalDateTime datePlanningExecution;
    private LocalDateTime datePlanningExecutionFrom;
    private LocalDateTime datePlanningExecutionTo;
    private String quantiteExecution;
    private String quantiteExecutionMin;
    private String quantiteExecutionMax;

    private PlanningRepasCriteria planningRepas ;
    private List<PlanningRepasCriteria> planningRepass ;


    public PlanningExecutionCriteria(){}

    public LocalDateTime getDatePlanningExecution(){
        return this.datePlanningExecution;
    }
    public void setDatePlanningExecution(LocalDateTime datePlanningExecution){
        this.datePlanningExecution = datePlanningExecution;
    }
    public LocalDateTime getDatePlanningExecutionFrom(){
        return this.datePlanningExecutionFrom;
    }
    public void setDatePlanningExecutionFrom(LocalDateTime datePlanningExecutionFrom){
        this.datePlanningExecutionFrom = datePlanningExecutionFrom;
    }
    public LocalDateTime getDatePlanningExecutionTo(){
        return this.datePlanningExecutionTo;
    }
    public void setDatePlanningExecutionTo(LocalDateTime datePlanningExecutionTo){
        this.datePlanningExecutionTo = datePlanningExecutionTo;
    }
    public String getQuantiteExecution(){
        return this.quantiteExecution;
    }
    public void setQuantiteExecution(String quantiteExecution){
        this.quantiteExecution = quantiteExecution;
    }   
    public String getQuantiteExecutionMin(){
        return this.quantiteExecutionMin;
    }
    public void setQuantiteExecutionMin(String quantiteExecutionMin){
        this.quantiteExecutionMin = quantiteExecutionMin;
    }
    public String getQuantiteExecutionMax(){
        return this.quantiteExecutionMax;
    }
    public void setQuantiteExecutionMax(String quantiteExecutionMax){
        this.quantiteExecutionMax = quantiteExecutionMax;
    }
      

    public PlanningRepasCriteria getPlanningRepas(){
        return this.planningRepas;
    }

    public void setPlanningRepas(PlanningRepasCriteria planningRepas){
        this.planningRepas = planningRepas;
    }
    public List<PlanningRepasCriteria> getPlanningRepass(){
        return this.planningRepass;
    }

    public void setPlanningRepass(List<PlanningRepasCriteria> planningRepass){
        this.planningRepass = planningRepass;
    }
}
