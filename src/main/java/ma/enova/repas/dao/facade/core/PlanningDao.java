package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.Planning;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PlanningDao extends AbstractRepository<Planning,Long> {

    List<Planning> findByCategoriePatientId(Long id);
    int deleteByCategoriePatientId(Long id);
    List<Planning> findByJourId(Long id);
    int deleteByJourId(Long id);

}
