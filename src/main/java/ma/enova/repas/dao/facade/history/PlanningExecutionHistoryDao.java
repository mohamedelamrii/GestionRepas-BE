package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.PlanningExecutionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanningExecutionHistoryDao extends AbstractHistoryRepository<PlanningExecutionHistory,Long> {

}
