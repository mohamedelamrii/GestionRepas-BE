package ma.enova.repas.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "responsable_planning")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="responsable_planning_seq",sequenceName="responsable_planning_seq",allocationSize=1, initialValue = 1)
public class ResponsablePlanning   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String adresse;



    public ResponsablePlanning(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="responsable_planning_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsablePlanning responsablePlanning = (ResponsablePlanning) o;
        return id != null && id.equals(responsablePlanning.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

