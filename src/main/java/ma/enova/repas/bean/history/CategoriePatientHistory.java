package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "categorie_patient")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_patient_seq",sequenceName="categorie_patient_seq",allocationSize=1, initialValue = 1)
public class CategoriePatientHistory extends HistBusinessObject  {


    public CategoriePatientHistory() {
    super();
    }

    public CategoriePatientHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_patient_seq")
    public Long getId() {
    return id;
    }
}

