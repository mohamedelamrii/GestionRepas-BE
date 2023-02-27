package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.ResponsablePlanningHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsablePlanningHistoryDao extends AbstractHistoryRepository<ResponsablePlanningHistory,Long> {

}
