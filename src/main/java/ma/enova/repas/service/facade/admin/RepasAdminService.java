package ma.enova.repas.service.facade.admin;

import java.util.List;
import ma.enova.repas.bean.core.Repas;
import ma.enova.repas.ws.dto.RepasDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.RepasCriteria;
import ma.enova.repas.dao.criteria.history.RepasHistoryCriteria;


public interface RepasAdminService extends IService<Repas, RepasDto,RepasCriteria, RepasHistoryCriteria> {

    List<Repas> findByTypeRepasId(Long id);
    int deleteByTypeRepasId(Long id);



}
