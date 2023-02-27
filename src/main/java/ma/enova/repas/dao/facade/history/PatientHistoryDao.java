package ma.enova.repas.dao.facade.history;

import ma.enova.repas.zynerator.repository.AbstractHistoryRepository;
import ma.enova.repas.bean.history.PatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryDao extends AbstractHistoryRepository<PatientHistory,Long> {

}
