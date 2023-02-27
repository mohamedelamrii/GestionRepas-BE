package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.RepasCategoriePatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RepasCategoriePatientHistoryDao extends AbstractHistoryRepository<RepasCategoriePatientHistory,Long> {

}
