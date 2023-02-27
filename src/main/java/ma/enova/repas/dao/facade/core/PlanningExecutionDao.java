package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.PlanningExecution;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PlanningExecutionDao extends AbstractRepository<PlanningExecution,Long> {

    List<PlanningExecution> findByPlanningRepasId(Long id);
    int deleteByPlanningRepasId(Long id);

}
