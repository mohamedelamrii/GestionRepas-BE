package ma.enova.repas.service.impl.admin;

import ma.enova.repas.bean.core.Planning;
import ma.enova.repas.bean.history.PlanningHistory;
import ma.enova.repas.dao.criteria.core.PlanningCriteria;
import ma.enova.repas.dao.criteria.history.PlanningHistoryCriteria;
import ma.enova.repas.dao.facade.core.PlanningDao;
import ma.enova.repas.dao.facade.history.PlanningHistoryDao;
import ma.enova.repas.dao.specification.core.PlanningSpecification;
import ma.enova.repas.service.facade.admin.PlanningAdminService;
import ma.enova.repas.ws.converter.PlanningConverter;
import ma.enova.repas.ws.dto.PlanningDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.enova.repas.service.facade.admin.CategoriePatientAdminService ;
import ma.enova.repas.service.facade.admin.JourAdminService ;
import ma.enova.repas.service.facade.admin.PlanningRepasAdminService ;


import java.util.List;

@Service
public class PlanningAdminServiceImpl extends AbstractServiceImpl<Planning, PlanningDto,PlanningHistory, PlanningCriteria, PlanningHistoryCriteria, PlanningDao,
PlanningHistoryDao, PlanningConverter> implements PlanningAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Planning create(Planning t) {
        super.create(t);
        if (t.getPlanningRepass() != null) {
                t.getPlanningRepass().forEach(element-> {
                    element.setPlanning(t);
                    planningRepasService.create(element);
            });
        }
        return t;
    }

    public Planning findWithAssociatedLists(Long id){
        Planning result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setPlanningRepass(planningRepasService.findByPlanningId(id));
        }
        return result;
    }

    @Transactional
    public void delete(List<Planning> list){
        if(list != null ) {
            for (Planning element : list) {
                //constructAndSaveHistory(dto, ACTION_TYPE.DELETE); TODO
                planningRepasService.deleteByPlanningId(element.getId());
                dao.deleteById(element.getId());
            }
        }
    }

    public void updateWithAssociatedLists(Planning planning){
    if(planning !=null && planning.getId() != null){
            //List<List<PlanningRepas>> resultPlanningRepass= planningRepasService.getToBeSavedAndToBeDeleted(planningRepasService.findByPlanningId(planning.getId()),planning.getPlanningRepass());
            //planningRepasService.delete(resultPlanningRepass.get(1));
            //associatePlanningRepas(planning,resultPlanningRepass.get(0));
            //planningRepasService.update(resultPlanningRepass.get(0));
    }
    }

    public void findOrSaveAssociatedObject(Planning t){
        if( t != null) {
            t.setCategoriePatient(categoriePatientService.findOrSave(t.getCategoriePatient()));
            t.setJour(jourService.findOrSave(t.getJour()));
        }
    }

    public List<Planning> findByCategoriePatientId(Long id){
        return dao.findByCategoriePatientId(id);
    }
    public int deleteByCategoriePatientId(Long id){
        return dao.deleteByCategoriePatientId(id);
    }
    public List<Planning> findByJourId(Long id){
        return dao.findByJourId(id);
    }
    public int deleteByJourId(Long id){
        return dao.deleteByJourId(id);
    }

    public void configure() {
        super.configure(Planning.class, PlanningDto.class, PlanningHistory.class, PlanningHistoryCriteria.class, PlanningSpecification.class);
    }

    @Autowired
    private CategoriePatientAdminService categoriePatientService ;
    @Autowired
    private JourAdminService jourService ;
    @Autowired
    private PlanningRepasAdminService planningRepasService ;
    public PlanningAdminServiceImpl(PlanningDao dao, PlanningHistoryDao historyDao, PlanningConverter converter) {
        super(dao, historyDao, converter);
    }

}