package ma.enova.repas.service.facade.responsable;

import java.util.List;
import ma.enova.repas.bean.core.ResponsablePlanning;
import ma.enova.repas.ws.dto.ResponsablePlanningDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.ResponsablePlanningCriteria;
import ma.enova.repas.dao.criteria.history.ResponsablePlanningHistoryCriteria;


public interface ResponsablePlanningResponsableService extends IService<ResponsablePlanning, ResponsablePlanningDto,ResponsablePlanningCriteria, ResponsablePlanningHistoryCriteria> {




}
