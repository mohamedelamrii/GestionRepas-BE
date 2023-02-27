package ma.enova.repas.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "planning_execution")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="planning_execution_seq",sequenceName="planning_execution_seq",allocationSize=1, initialValue = 1)
public class PlanningExecution   extends AuditBusinessObject  {

    private Long id;

    private LocalDateTime datePlanningExecution ;
    private Long quantiteExecution ;
    @Lob
    @Column(columnDefinition="TEXT")
    private String commentaire;

    private PlanningRepas planningRepas ;
    


    public PlanningExecution(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="planning_execution_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDatePlanningExecution(){
        return this.datePlanningExecution;
    }
    public void setDatePlanningExecution(LocalDateTime datePlanningExecution){
        this.datePlanningExecution = datePlanningExecution;
    }
    public Long getQuantiteExecution(){
        return this.quantiteExecution;
    }
    public void setQuantiteExecution(Long quantiteExecution){
        this.quantiteExecution = quantiteExecution;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PlanningRepas getPlanningRepas(){
        return this.planningRepas;
    }
    public void setPlanningRepas(PlanningRepas planningRepas){
        this.planningRepas = planningRepas;
    }
    public String getCommentaire(){
        return this.commentaire;
    }
    public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanningExecution planningExecution = (PlanningExecution) o;
        return id != null && id.equals(planningExecution.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

