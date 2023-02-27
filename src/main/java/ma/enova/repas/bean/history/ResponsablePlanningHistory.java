package ma.enova.repas.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.repas.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "responsable_planning")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="responsable_planning_seq",sequenceName="responsable_planning_seq",allocationSize=1, initialValue = 1)
public class ResponsablePlanningHistory extends HistBusinessObject  {


    public ResponsablePlanningHistory() {
    super();
    }

    public ResponsablePlanningHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="responsable_planning_seq")
    public Long getId() {
    return id;
    }
}

