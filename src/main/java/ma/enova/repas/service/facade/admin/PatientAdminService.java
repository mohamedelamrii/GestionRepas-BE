package ma.enova.repas.service.facade.admin;

import java.util.List;
import ma.enova.repas.bean.core.Patient;
import ma.enova.repas.ws.dto.PatientDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.PatientCriteria;
import ma.enova.repas.dao.criteria.history.PatientHistoryCriteria;


public interface PatientAdminService extends IService<Patient, PatientDto,PatientCriteria, PatientHistoryCriteria> {




}
