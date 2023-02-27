package ma.enova.repas.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "categorie_patient")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_patient_seq",sequenceName="categorie_patient_seq",allocationSize=1, initialValue = 1)
public class CategoriePatient   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    private Integer nombrePatientTotal = 0;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;



    public CategoriePatient(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_patient_seq")
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
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public Integer getNombrePatientTotal(){
        return this.nombrePatientTotal;
    }
    public void setNombrePatientTotal(Integer nombrePatientTotal){
        this.nombrePatientTotal = nombrePatientTotal;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
        CategoriePatient categoriePatient = (CategoriePatient) o;
        return id != null && id.equals(categoriePatient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

