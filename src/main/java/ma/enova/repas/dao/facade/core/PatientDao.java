package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.Patient;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PatientDao extends AbstractRepository<Patient,Long> {


}
