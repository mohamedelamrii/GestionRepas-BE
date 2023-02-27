package ma.enova.repas.service.impl.responsable;

import ma.enova.repas.bean.core.ResponsablePlanning;
import ma.enova.repas.bean.history.ResponsablePlanningHistory;
import ma.enova.repas.dao.criteria.core.ResponsablePlanningCriteria;
import ma.enova.repas.dao.criteria.history.ResponsablePlanningHistoryCriteria;
import ma.enova.repas.dao.facade.core.ResponsablePlanningDao;
import ma.enova.repas.dao.facade.history.ResponsablePlanningHistoryDao;
import ma.enova.repas.dao.specification.core.ResponsablePlanningSpecification;
import ma.enova.repas.service.facade.responsable.ResponsablePlanningResponsableService;
import ma.enova.repas.ws.converter.ResponsablePlanningConverter;
import ma.enova.repas.ws.dto.ResponsablePlanningDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class ResponsablePlanningResponsableServiceImpl extends AbstractServiceImpl<ResponsablePlanning, ResponsablePlanningDto,ResponsablePlanningHistory, ResponsablePlanningCriteria, ResponsablePlanningHistoryCriteria, ResponsablePlanningDao,
ResponsablePlanningHistoryDao, ResponsablePlanningConverter> implements ResponsablePlanningResponsableService {


    public ResponsablePlanning findByReferenceEntity(ResponsablePlanning t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(ResponsablePlanning t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(ResponsablePlanning.class, ResponsablePlanningDto.class, ResponsablePlanningHistory.class, ResponsablePlanningHistoryCriteria.class, ResponsablePlanningSpecification.class);
    }

    public ResponsablePlanningResponsableServiceImpl(ResponsablePlanningDao dao, ResponsablePlanningHistoryDao historyDao, ResponsablePlanningConverter converter) {
        super(dao, historyDao, converter);
    }

}