package ma.enova.repas.service.impl.responsable;

import ma.enova.repas.bean.core.TypeRepas;
import ma.enova.repas.bean.history.TypeRepasHistory;
import ma.enova.repas.dao.criteria.core.TypeRepasCriteria;
import ma.enova.repas.dao.criteria.history.TypeRepasHistoryCriteria;
import ma.enova.repas.dao.facade.core.TypeRepasDao;
import ma.enova.repas.dao.facade.history.TypeRepasHistoryDao;
import ma.enova.repas.dao.specification.core.TypeRepasSpecification;
import ma.enova.repas.service.facade.responsable.TypeRepasResponsableService;
import ma.enova.repas.ws.converter.TypeRepasConverter;
import ma.enova.repas.ws.dto.TypeRepasDto;
import ma.enova.repas.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class TypeRepasResponsableServiceImpl extends AbstractServiceImpl<TypeRepas, TypeRepasDto,TypeRepasHistory, TypeRepasCriteria, TypeRepasHistoryCriteria, TypeRepasDao,
TypeRepasHistoryDao, TypeRepasConverter> implements TypeRepasResponsableService {


    public TypeRepas findByReferenceEntity(TypeRepas t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(TypeRepas t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(TypeRepas.class, TypeRepasDto.class, TypeRepasHistory.class, TypeRepasHistoryCriteria.class, TypeRepasSpecification.class);
    }

    public TypeRepasResponsableServiceImpl(TypeRepasDao dao, TypeRepasHistoryDao historyDao, TypeRepasConverter converter) {
        super(dao, historyDao, converter);
    }

}