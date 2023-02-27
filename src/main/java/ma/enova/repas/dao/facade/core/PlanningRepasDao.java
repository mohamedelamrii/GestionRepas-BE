package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.PlanningRepas;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PlanningRepasDao extends AbstractRepository<PlanningRepas,Long> {

    List<PlanningRepas> findByPlanningId(Long id);
    int deleteByPlanningId(Long id);
    List<PlanningRepas> findByRepasId(Long id);
    int deleteByRepasId(Long id);
    List<PlanningRepas> findByTypeRepasId(Long id);
    int deleteByTypeRepasId(Long id);

}
