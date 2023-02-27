package ma.enova.repas.bean.core;

import java.util.Objects;
import java.util.List;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "repas")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="repas_seq",sequenceName="repas_seq",allocationSize=1, initialValue = 1)
public class Repas   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String image;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;

    private TypeRepas typeRepas ;
    

    private List<RepasCategoriePatient> repasCategoriePatients ;

    public Repas(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="repas_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeRepas getTypeRepas(){
        return this.typeRepas;
    }
    public void setTypeRepas(TypeRepas typeRepas){
        this.typeRepas = typeRepas;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    @OneToMany(mappedBy = "repas")
    public List<RepasCategoriePatient> getRepasCategoriePatients(){
        return this.repasCategoriePatients;
    }
    public void setRepasCategoriePatients(List<RepasCategoriePatient> repasCategoriePatients){
        this.repasCategoriePatients = repasCategoriePatients;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repas repas = (Repas) o;
        return id != null && id.equals(repas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

