package ma.enova.repas.service.facade.admin;

import java.util.List;
import ma.enova.repas.bean.core.RepasCategoriePatient;
import ma.enova.repas.ws.dto.RepasCategoriePatientDto;
import ma.enova.repas.zynerator.service.IService;
import ma.enova.repas.dao.criteria.core.RepasCategoriePatientCriteria;
import ma.enova.repas.dao.criteria.history.RepasCategoriePatientHistoryCriteria;


public interface RepasCategoriePatientAdminService extends IService<RepasCategoriePatient, RepasCategoriePatientDto,RepasCategoriePatientCriteria, RepasCategoriePatientHistoryCriteria> {

    List<RepasCategoriePatient> findByRepasId(Long id);
    int deleteByRepasId(Long id);
    List<RepasCategoriePatient> findByCategoriePatientId(Long id);
    int deleteByCategoriePatientId(Long id);



}
