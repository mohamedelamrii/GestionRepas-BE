package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.TypeRepasHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepasHistoryDao extends AbstractHistoryRepository<TypeRepasHistory,Long> {

}
