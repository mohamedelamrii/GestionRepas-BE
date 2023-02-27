package ma.enova.repas.service.facade.responsable;

import java.util.List;
import ma.enova.repas.bean.core.CategoriePatient;
import ma.enova.repas.ws.dto.CategoriePatientDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.CategoriePatientCriteria;
import ma.enova.repas.dao.criteria.history.CategoriePatientHistoryCriteria;


public interface CategoriePatientResponsableService extends IService<CategoriePatient, CategoriePatientDto,CategoriePatientCriteria, CategoriePatientHistoryCriteria> {




}
