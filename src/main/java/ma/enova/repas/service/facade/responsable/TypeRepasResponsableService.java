package ma.enova.repas.service.facade.responsable;

import java.util.List;
import ma.enova.repas.bean.core.TypeRepas;
import ma.enova.repas.ws.dto.TypeRepasDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.TypeRepasCriteria;
import ma.enova.repas.dao.criteria.history.TypeRepasHistoryCriteria;


public interface TypeRepasResponsableService extends IService<TypeRepas, TypeRepasDto,TypeRepasCriteria, TypeRepasHistoryCriteria> {




}
