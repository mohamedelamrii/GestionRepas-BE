package ma.enova.repas.service.impl.admin;

import ma.enova.repas.bean.core.CategoriePatient;
import ma.enova.repas.bean.history.CategoriePatientHistory;
import ma.enova.repas.dao.criteria.core.CategoriePatientCriteria;
import ma.enova.repas.dao.criteria.history.CategoriePatientHistoryCriteria;
import ma.enova.repas.dao.facade.core.CategoriePatientDao;
import ma.enova.repas.dao.facade.history.CategoriePatientHistoryDao;
import ma.enova.repas.dao.specification.core.CategoriePatientSpecification;
import ma.enova.repas.service.facade.admin.CategoriePatientAdminService;
import ma.enova.repas.ws.converter.CategoriePatientConverter;
import ma.enova.repas.ws.dto.CategoriePatientDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class CategoriePatientAdminServiceImpl extends AbstractServiceImpl<CategoriePatient, CategoriePatientDto,CategoriePatientHistory, CategoriePatientCriteria, CategoriePatientHistoryCriteria, CategoriePatientDao,
CategoriePatientHistoryDao, CategoriePatientConverter> implements CategoriePatientAdminService {


    public CategoriePatient findByReferenceEntity(CategoriePatient t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(CategoriePatient t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(CategoriePatient.class, CategoriePatientDto.class, CategoriePatientHistory.class, CategoriePatientHistoryCriteria.class, CategoriePatientSpecification.class);
    }

    public CategoriePatientAdminServiceImpl(CategoriePatientDao dao, CategoriePatientHistoryDao historyDao, CategoriePatientConverter converter) {
        super(dao, historyDao, converter);
    }

}