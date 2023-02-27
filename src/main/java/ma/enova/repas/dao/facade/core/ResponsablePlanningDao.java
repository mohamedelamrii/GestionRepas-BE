package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.ResponsablePlanning;
import org.springframework.stereotype.Repository;
import ma.enova.repas.bean.core.ResponsablePlanning;
import java.util.List;


@Repository
public interface ResponsablePlanningDao extends AbstractRepository<ResponsablePlanning,Long> {
    ResponsablePlanning findByCode(String code);
    int deleteByCode(String code);


}
