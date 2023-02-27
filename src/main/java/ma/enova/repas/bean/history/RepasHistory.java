package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "repas")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="repas_seq",sequenceName="repas_seq",allocationSize=1, initialValue = 1)
public class RepasHistory extends HistBusinessObject  {


    public RepasHistory() {
    super();
    }

    public RepasHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="repas_seq")
    public Long getId() {
    return id;
    }
}

