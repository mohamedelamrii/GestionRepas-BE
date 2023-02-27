package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.RepasHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RepasHistoryDao extends AbstractHistoryRepository<RepasHistory,Long> {

}
