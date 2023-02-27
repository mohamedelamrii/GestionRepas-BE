package ma.enova.repas.service.impl.admin;

import ma.enova.repas.bean.core.Patient;
import ma.enova.repas.bean.history.PatientHistory;
import ma.enova.repas.dao.criteria.core.PatientCriteria;
import ma.enova.repas.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.repas.dao.facade.core.PatientDao;
import ma.enova.repas.dao.facade.history.PatientHistoryDao;
import ma.enova.repas.dao.specification.core.PatientSpecification;
import ma.enova.repas.service.facade.admin.PatientAdminService;
import ma.enova.repas.ws.converter.PatientConverter;
import ma.enova.repas.ws.dto.PatientDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class PatientAdminServiceImpl extends AbstractServiceImpl<Patient, PatientDto,PatientHistory, PatientCriteria, PatientHistoryCriteria, PatientDao,
PatientHistoryDao, PatientConverter> implements PatientAdminService {


    public void findOrSaveAssociatedObject(Patient t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(Patient.class, PatientDto.class, PatientHistory.class, PatientHistoryCriteria.class, PatientSpecification.class);
    }

    public PatientAdminServiceImpl(PatientDao dao, PatientHistoryDao historyDao, PatientConverter converter) {
        super(dao, historyDao, converter);
    }

}