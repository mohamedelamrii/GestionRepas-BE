package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "planning")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="planning_seq",sequenceName="planning_seq",allocationSize=1, initialValue = 1)
public class PlanningHistory extends HistBusinessObject  {


    public PlanningHistory() {
    super();
    }

    public PlanningHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="planning_seq")
    public Long getId() {
    return id;
    }
}

