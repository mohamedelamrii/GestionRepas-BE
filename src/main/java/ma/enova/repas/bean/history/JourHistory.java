package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "jour")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="jour_seq",sequenceName="jour_seq",allocationSize=1, initialValue = 1)
public class JourHistory extends HistBusinessObject  {


    public JourHistory() {
    super();
    }

    public JourHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="jour_seq")
    public Long getId() {
    return id;
    }
}

