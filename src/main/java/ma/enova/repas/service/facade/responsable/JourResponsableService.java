package ma.enova.repas.service.facade.responsable;

import java.util.List;
import ma.enova.repas.bean.core.Jour;
import ma.enova.repas.ws.dto.JourDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.JourCriteria;
import ma.enova.repas.dao.criteria.history.JourHistoryCriteria;


public interface JourResponsableService extends IService<Jour, JourDto,JourCriteria, JourHistoryCriteria> {




}
