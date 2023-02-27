package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.Jour;
import org.springframework.stereotype.Repository;
import ma.enova.repas.bean.core.Jour;
import java.util.List;


@Repository
public interface JourDao extends AbstractRepository<Jour,Long> {
    Jour findByCode(String code);
    int deleteByCode(String code);


}
