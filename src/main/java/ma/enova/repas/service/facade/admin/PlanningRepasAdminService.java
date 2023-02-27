package ma.enova.repas.service.facade.admin;

import java.util.List;
import ma.enova.repas.bean.core.PlanningRepas;
import ma.enova.repas.ws.dto.PlanningRepasDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.PlanningRepasCriteria;
import ma.enova.repas.dao.criteria.history.PlanningRepasHistoryCriteria;


public interface PlanningRepasAdminService extends IService<PlanningRepas, PlanningRepasDto,PlanningRepasCriteria, PlanningRepasHistoryCriteria> {

    List<PlanningRepas> findByPlanningId(Long id);
    int deleteByPlanningId(Long id);
    List<PlanningRepas> findByRepasId(Long id);
    int deleteByRepasId(Long id);
    List<PlanningRepas> findByTypeRepasId(Long id);
    int deleteByTypeRepasId(Long id);



}
