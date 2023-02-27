package ma.enova.repas.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "repas_categorie_patient")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="repas_categorie_patient_seq",sequenceName="repas_categorie_patient_seq",allocationSize=1, initialValue = 1)
public class RepasCategoriePatient   extends AuditBusinessObject  {

    private Long id;


    private Repas repas ;
    
    private CategoriePatient categoriePatient ;
    


    public RepasCategoriePatient(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="repas_categorie_patient_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Repas getRepas(){
        return this.repas;
    }
    public void setRepas(Repas repas){
        this.repas = repas;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategoriePatient getCategoriePatient(){
        return this.categoriePatient;
    }
    public void setCategoriePatient(CategoriePatient categoriePatient){
        this.categoriePatient = categoriePatient;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepasCategoriePatient repasCategoriePatient = (RepasCategoriePatient) o;
        return id != null && id.equals(repasCategoriePatient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

