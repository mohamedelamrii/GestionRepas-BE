package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.RepasCategoriePatient;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface RepasCategoriePatientDao extends AbstractRepository<RepasCategoriePatient,Long> {

    List<RepasCategoriePatient> findByRepasId(Long id);
    int deleteByRepasId(Long id);
    List<RepasCategoriePatient> findByCategoriePatientId(Long id);
    int deleteByCategoriePatientId(Long id);

}
