package ma.enova.repas.service.impl.admin;

import ma.enova.repas.bean.core.Repas;
import ma.enova.repas.bean.history.RepasHistory;
import ma.enova.repas.dao.criteria.core.RepasCriteria;
import ma.enova.repas.dao.criteria.history.RepasHistoryCriteria;
import ma.enova.repas.dao.facade.core.RepasDao;
import ma.enova.repas.dao.facade.history.RepasHistoryDao;
import ma.enova.repas.dao.specification.core.RepasSpecification;
import ma.enova.repas.service.facade.admin.RepasAdminService;
import ma.enova.repas.ws.converter.RepasConverter;
import ma.enova.repas.ws.dto.RepasDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.enova.repas.service.facade.admin.RepasCategoriePatientAdminService ;
import ma.enova.repas.service.facade.admin.TypeRepasAdminService ;


import java.util.List;

@Service
public class RepasAdminServiceImpl extends AbstractServiceImpl<Repas, RepasDto,RepasHistory, RepasCriteria, RepasHistoryCriteria, RepasDao,
RepasHistoryDao, RepasConverter> implements RepasAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Repas create(Repas t) {
        super.create(t);
        if (t.getRepasCategoriePatients() != null) {
                t.getRepasCategoriePatients().forEach(element-> {
                    element.setRepas(t);
                    repasCategoriePatientService.create(element);
            });
        }
        return t;
    }

    public Repas findWithAssociatedLists(Long id){
        Repas result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setRepasCategoriePatients(repasCategoriePatientService.findByRepasId(id));
        }
        return result;
    }

    @Transactional
    public void delete(List<Repas> list){
        if(list != null ) {
            for (Repas element : list) {
                //constructAndSaveHistory(dto, ACTION_TYPE.DELETE); TODO
                repasCategoriePatientService.deleteByRepasId(element.getId());
                dao.deleteById(element.getId());
            }
        }
    }

    public void updateWithAssociatedLists(Repas repas){
    if(repas !=null && repas.getId() != null){
            //List<List<RepasCategoriePatient>> resultRepasCategoriePatients= repasCategoriePatientService.getToBeSavedAndToBeDeleted(repasCategoriePatientService.findByRepasId(repas.getId()),repas.getRepasCategoriePatients());
            //repasCategoriePatientService.delete(resultRepasCategoriePatients.get(1));
            //associateRepasCategoriePatient(repas,resultRepasCategoriePatients.get(0));
            //repasCategoriePatientService.update(resultRepasCategoriePatients.get(0));
    }
    }

    public void findOrSaveAssociatedObject(Repas t){
        if( t != null) {
            t.setTypeRepas(typeRepasService.findOrSave(t.getTypeRepas()));
        }
    }

    public List<Repas> findByTypeRepasId(Long id){
        return dao.findByTypeRepasId(id);
    }
    public int deleteByTypeRepasId(Long id){
        return dao.deleteByTypeRepasId(id);
    }

    public void configure() {
        super.configure(Repas.class, RepasDto.class, RepasHistory.class, RepasHistoryCriteria.class, RepasSpecification.class);
    }

    @Autowired
    private RepasCategoriePatientAdminService repasCategoriePatientService ;
    @Autowired
    private TypeRepasAdminService typeRepasService ;
    public RepasAdminServiceImpl(RepasDao dao, RepasHistoryDao historyDao, RepasConverter converter) {
        super(dao, historyDao, converter);
    }

}