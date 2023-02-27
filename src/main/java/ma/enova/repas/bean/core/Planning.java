package ma.enova.repas.bean.core;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "planning")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="planning_seq",sequenceName="planning_seq",allocationSize=1, initialValue = 1)
public class Planning   extends AuditBusinessObject  {

    private Long id;

    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;

    private CategoriePatient categoriePatient ;
    
    private Jour jour ;
    

    private List<PlanningRepas> planningRepass ;

    public Planning(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="planning_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategoriePatient getCategoriePatient(){
        return this.categoriePatient;
    }
    public void setCategoriePatient(CategoriePatient categoriePatient){
        this.categoriePatient = categoriePatient;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Jour getJour(){
        return this.jour;
    }
    public void setJour(Jour jour){
        this.jour = jour;
    }
    @OneToMany(mappedBy = "planning")
    public List<PlanningRepas> getPlanningRepass(){
        return this.planningRepass;
    }
    public void setPlanningRepass(List<PlanningRepas> planningRepass){
        this.planningRepass = planningRepass;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planning planning = (Planning) o;
        return id != null && id.equals(planning.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

