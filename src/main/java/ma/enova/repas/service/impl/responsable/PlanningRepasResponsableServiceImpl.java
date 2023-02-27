package ma.enova.repas.service.impl.responsable;

import ma.enova.repas.bean.core.PlanningRepas;
import ma.enova.repas.bean.history.PlanningRepasHistory;
import ma.enova.repas.dao.criteria.core.PlanningRepasCriteria;
import ma.enova.repas.dao.criteria.history.PlanningRepasHistoryCriteria;
import ma.enova.repas.dao.facade.core.PlanningRepasDao;
import ma.enova.repas.dao.facade.history.PlanningRepasHistoryDao;
import ma.enova.repas.dao.specification.core.PlanningRepasSpecification;
import ma.enova.repas.service.facade.responsable.PlanningRepasResponsableService;
import ma.enova.repas.ws.converter.PlanningRepasConverter;
import ma.enova.repas.ws.dto.PlanningRepasDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.repas.service.facade.responsable.PlanningResponsableService ;
import ma.enova.repas.service.facade.responsable.TypeRepasResponsableService ;
import ma.enova.repas.service.facade.responsable.RepasResponsableService ;


import java.util.List;

@Service
public class PlanningRepasResponsableServiceImpl extends AbstractServiceImpl<PlanningRepas, PlanningRepasDto,PlanningRepasHistory, PlanningRepasCriteria, PlanningRepasHistoryCriteria, PlanningRepasDao,
PlanningRepasHistoryDao, PlanningRepasConverter> implements PlanningRepasResponsableService {


    public void findOrSaveAssociatedObject(PlanningRepas t){
        if( t != null) {
            t.setPlanning(planningService.findOrSave(t.getPlanning()));
            t.setRepas(repasService.findOrSave(t.getRepas()));
            t.setTypeRepas(typeRepasService.findOrSave(t.getTypeRepas()));
        }
    }

    public List<PlanningRepas> findByPlanningId(Long id){
        return dao.findByPlanningId(id);
    }
    public int deleteByPlanningId(Long id){
        return dao.deleteByPlanningId(id);
    }
    public List<PlanningRepas> findByRepasId(Long id){
        return dao.findByRepasId(id);
    }
    public int deleteByRepasId(Long id){
        return dao.deleteByRepasId(id);
    }
    public List<PlanningRepas> findByTypeRepasId(Long id){
        return dao.findByTypeRepasId(id);
    }
    public int deleteByTypeRepasId(Long id){
        return dao.deleteByTypeRepasId(id);
    }

    public void configure() {
        super.configure(PlanningRepas.class, PlanningRepasDto.class, PlanningRepasHistory.class, PlanningRepasHistoryCriteria.class, PlanningRepasSpecification.class);
    }

    @Autowired
    private PlanningResponsableService planningService ;
    @Autowired
    private TypeRepasResponsableService typeRepasService ;
    @Autowired
    private RepasResponsableService repasService ;
    public PlanningRepasResponsableServiceImpl(PlanningRepasDao dao, PlanningRepasHistoryDao historyDao, PlanningRepasConverter converter) {
        super(dao, historyDao, converter);
    }

}