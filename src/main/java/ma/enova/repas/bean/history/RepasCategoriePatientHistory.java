package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "repas_categorie_patient")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="repas_categorie_patient_seq",sequenceName="repas_categorie_patient_seq",allocationSize=1, initialValue = 1)
public class RepasCategoriePatientHistory extends HistBusinessObject  {


    public RepasCategoriePatientHistory() {
    super();
    }

    public RepasCategoriePatientHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="repas_categorie_patient_seq")
    public Long getId() {
    return id;
    }
}

