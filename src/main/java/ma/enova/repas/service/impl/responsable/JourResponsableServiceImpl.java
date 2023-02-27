package ma.enova.repas.service.impl.responsable;

import ma.enova.repas.bean.core.Jour;
import ma.enova.repas.bean.history.JourHistory;
import ma.enova.repas.dao.criteria.core.JourCriteria;
import ma.enova.repas.dao.criteria.history.JourHistoryCriteria;
import ma.enova.repas.dao.facade.core.JourDao;
import ma.enova.repas.dao.facade.history.JourHistoryDao;
import ma.enova.repas.dao.specification.core.JourSpecification;
import ma.enova.repas.service.facade.responsable.JourResponsableService;
import ma.enova.repas.ws.converter.JourConverter;
import ma.enova.repas.ws.dto.JourDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class JourResponsableServiceImpl extends AbstractServiceImpl<Jour, JourDto,JourHistory, JourCriteria, JourHistoryCriteria, JourDao,
JourHistoryDao, JourConverter> implements JourResponsableService {


    public Jour findByReferenceEntity(Jour t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Jour t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(Jour.class, JourDto.class, JourHistory.class, JourHistoryCriteria.class, JourSpecification.class);
    }

    public JourResponsableServiceImpl(JourDao dao, JourHistoryDao historyDao, JourConverter converter) {
        super(dao, historyDao, converter);
    }

}