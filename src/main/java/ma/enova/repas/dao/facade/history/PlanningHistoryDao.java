package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.PlanningHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanningHistoryDao extends AbstractHistoryRepository<PlanningHistory,Long> {

}
