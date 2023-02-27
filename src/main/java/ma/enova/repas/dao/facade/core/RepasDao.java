package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.Repas;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface RepasDao extends AbstractRepository<Repas,Long> {

    List<Repas> findByTypeRepasId(Long id);
    int deleteByTypeRepasId(Long id);

}
