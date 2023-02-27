package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.JourHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface JourHistoryDao extends AbstractHistoryRepository<JourHistory,Long> {

}
