package ma.enova.repas.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "planning_repas")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="planning_repas_seq",sequenceName="planning_repas_seq",allocationSize=1, initialValue = 1)
public class PlanningRepas   extends AuditBusinessObject  {

    private Long id;

    private Integer quantite = 0;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;

    private Planning planning ;
    
    private Repas repas ;
    
    private TypeRepas typeRepas ;
    


    public PlanningRepas(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="planning_repas_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Planning getPlanning(){
        return this.planning;
    }
    public void setPlanning(Planning planning){
        this.planning = planning;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Repas getRepas(){
        return this.repas;
    }
    public void setRepas(Repas repas){
        this.repas = repas;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeRepas getTypeRepas(){
        return this.typeRepas;
    }
    public void setTypeRepas(TypeRepas typeRepas){
        this.typeRepas = typeRepas;
    }
    public Integer getQuantite(){
        return this.quantite;
    }
    public void setQuantite(Integer quantite){
        this.quantite = quantite;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanningRepas planningRepas = (PlanningRepas) o;
        return id != null && id.equals(planningRepas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

