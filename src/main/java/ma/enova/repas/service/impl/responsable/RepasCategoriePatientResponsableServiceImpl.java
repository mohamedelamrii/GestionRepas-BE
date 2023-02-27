package ma.enova.repas.service.impl.responsable;

import ma.enova.repas.bean.core.RepasCategoriePatient;
import ma.enova.repas.bean.history.RepasCategoriePatientHistory;
import ma.enova.repas.dao.criteria.core.RepasCategoriePatientCriteria;
import ma.enova.repas.dao.criteria.history.RepasCategoriePatientHistoryCriteria;
import ma.enova.repas.dao.facade.core.RepasCategoriePatientDao;
import ma.enova.repas.dao.facade.history.RepasCategoriePatientHistoryDao;
import ma.enova.repas.dao.specification.core.RepasCategoriePatientSpecification;
import ma.enova.repas.service.facade.responsable.RepasCategoriePatientResponsableService;
import ma.enova.repas.ws.converter.RepasCategoriePatientConverter;
import ma.enova.repas.ws.dto.RepasCategoriePatientDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.repas.service.facade.responsable.CategoriePatientResponsableService ;
import ma.enova.repas.service.facade.responsable.RepasResponsableService ;


import java.util.List;

@Service
public class RepasCategoriePatientResponsableServiceImpl extends AbstractServiceImpl<RepasCategoriePatient, RepasCategoriePatientDto,RepasCategoriePatientHistory, RepasCategoriePatientCriteria, RepasCategoriePatientHistoryCriteria, RepasCategoriePatientDao,
RepasCategoriePatientHistoryDao, RepasCategoriePatientConverter> implements RepasCategoriePatientResponsableService {


    public void findOrSaveAssociatedObject(RepasCategoriePatient t){
        if( t != null) {
            t.setRepas(repasService.findOrSave(t.getRepas()));
            t.setCategoriePatient(categoriePatientService.findOrSave(t.getCategoriePatient()));
        }
    }

    public List<RepasCategoriePatient> findByRepasId(Long id){
        return dao.findByRepasId(id);
    }
    public int deleteByRepasId(Long id){
        return dao.deleteByRepasId(id);
    }
    public List<RepasCategoriePatient> findByCategoriePatientId(Long id){
        return dao.findByCategoriePatientId(id);
    }
    public int deleteByCategoriePatientId(Long id){
        return dao.deleteByCategoriePatientId(id);
    }

    public void configure() {
        super.configure(RepasCategoriePatient.class, RepasCategoriePatientDto.class, RepasCategoriePatientHistory.class, RepasCategoriePatientHistoryCriteria.class, RepasCategoriePatientSpecification.class);
    }

    @Autowired
    private CategoriePatientResponsableService categoriePatientService ;
    @Autowired
    private RepasResponsableService repasService ;
    public RepasCategoriePatientResponsableServiceImpl(RepasCategoriePatientDao dao, RepasCategoriePatientHistoryDao historyDao, RepasCategoriePatientConverter converter) {
        super(dao, historyDao, converter);
    }

}