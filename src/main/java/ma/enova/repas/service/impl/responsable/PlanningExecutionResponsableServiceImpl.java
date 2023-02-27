package ma.enova.repas.service.impl.responsable;

import ma.enova.repas.bean.core.PlanningExecution;
import ma.enova.repas.bean.history.PlanningExecutionHistory;
import ma.enova.repas.dao.criteria.core.PlanningExecutionCriteria;
import ma.enova.repas.dao.criteria.history.PlanningExecutionHistoryCriteria;
import ma.enova.repas.dao.facade.core.PlanningExecutionDao;
import ma.enova.repas.dao.facade.history.PlanningExecutionHistoryDao;
import ma.enova.repas.dao.specification.core.PlanningExecutionSpecification;
import ma.enova.repas.service.facade.responsable.PlanningExecutionResponsableService;
import ma.enova.repas.ws.converter.PlanningExecutionConverter;
import ma.enova.repas.ws.dto.PlanningExecutionDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.repas.service.facade.responsable.PlanningRepasResponsableService ;


import java.util.List;

@Service
public class PlanningExecutionResponsableServiceImpl extends AbstractServiceImpl<PlanningExecution, PlanningExecutionDto,PlanningExecutionHistory, PlanningExecutionCriteria, PlanningExecutionHistoryCriteria, PlanningExecutionDao,
PlanningExecutionHistoryDao, PlanningExecutionConverter> implements PlanningExecutionResponsableService {


    public void findOrSaveAssociatedObject(PlanningExecution t){
        if( t != null) {
            t.setPlanningRepas(planningRepasService.findOrSave(t.getPlanningRepas()));
        }
    }

    public List<PlanningExecution> findByPlanningRepasId(Long id){
        return dao.findByPlanningRepasId(id);
    }
    public int deleteByPlanningRepasId(Long id){
        return dao.deleteByPlanningRepasId(id);
    }

    public void configure() {
        super.configure(PlanningExecution.class, PlanningExecutionDto.class, PlanningExecutionHistory.class, PlanningExecutionHistoryCriteria.class, PlanningExecutionSpecification.class);
    }

    @Autowired
    private PlanningRepasResponsableService planningRepasService ;
    public PlanningExecutionResponsableServiceImpl(PlanningExecutionDao dao, PlanningExecutionHistoryDao historyDao, PlanningExecutionConverter converter) {
        super(dao, historyDao, converter);
    }

}