package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.CategoriePatient;
import org.springframework.stereotype.Repository;
import ma.enova.repas.bean.core.CategoriePatient;
import java.util.List;


@Repository
public interface CategoriePatientDao extends AbstractRepository<CategoriePatient,Long> {
    CategoriePatient findByCode(String code);
    int deleteByCode(String code);


}
