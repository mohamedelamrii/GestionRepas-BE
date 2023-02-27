package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_repas")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_repas_seq",sequenceName="type_repas_seq",allocationSize=1, initialValue = 1)
public class TypeRepasHistory extends HistBusinessObject  {


    public TypeRepasHistory() {
    super();
    }

    public TypeRepasHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_repas_seq")
    public Long getId() {
    return id;
    }
}

