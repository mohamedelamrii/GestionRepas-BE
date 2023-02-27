package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "planning_repas")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="planning_repas_seq",sequenceName="planning_repas_seq",allocationSize=1, initialValue = 1)
public class PlanningRepasHistory extends HistBusinessObject  {


    public PlanningRepasHistory() {
    super();
    }

    public PlanningRepasHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="planning_repas_seq")
    public Long getId() {
    return id;
    }
}

