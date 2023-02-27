package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "planning_execution")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="planning_execution_seq",sequenceName="planning_execution_seq",allocationSize=1, initialValue = 1)
public class PlanningExecutionHistory extends HistBusinessObject  {


    public PlanningExecutionHistory() {
    super();
    }

    public PlanningExecutionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="planning_execution_seq")
    public Long getId() {
    return id;
    }
}

