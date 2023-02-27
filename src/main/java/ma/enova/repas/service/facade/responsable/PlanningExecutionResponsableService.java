package ma.enova.repas.service.facade.responsable;

import java.util.List;
import ma.enova.repas.bean.core.PlanningExecution;
import ma.enova.repas.ws.dto.PlanningExecutionDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.PlanningExecutionCriteria;
import ma.enova.repas.dao.criteria.history.PlanningExecutionHistoryCriteria;


public interface PlanningExecutionResponsableService extends IService<PlanningExecution, PlanningExecutionDto,PlanningExecutionCriteria, PlanningExecutionHistoryCriteria> {

    List<PlanningExecution> findByPlanningRepasId(Long id);
    int deleteByPlanningRepasId(Long id);



}
