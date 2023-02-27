package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.CategoriePatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriePatientHistoryDao extends AbstractHistoryRepository<CategoriePatientHistory,Long> {

}
