package ma.enova.repas.service.facade.responsable;

import java.util.List;
import ma.enova.repas.bean.core.Planning;
import ma.enova.repas.ws.dto.PlanningDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.PlanningCriteria;
import ma.enova.repas.dao.criteria.history.PlanningHistoryCriteria;


public interface PlanningResponsableService extends IService<Planning, PlanningDto,PlanningCriteria, PlanningHistoryCriteria> {

    List<Planning> findByCategoriePatientId(Long id);
    int deleteByCategoriePatientId(Long id);
    List<Planning> findByJourId(Long id);
    int deleteByJourId(Long id);



}
