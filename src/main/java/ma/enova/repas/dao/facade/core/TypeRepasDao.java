package ma.enova.repas.dao.facade.core;



import ma.enova.repas.zynerator.repository.AbstractRepository;
import ma.enova.repas.bean.core.TypeRepas;
import org.springframework.stereotype.Repository;
import ma.enova.repas.bean.core.TypeRepas;
import java.util.List;


@Repository
public interface TypeRepasDao extends AbstractRepository<TypeRepas,Long> {
    TypeRepas findByCode(String code);
    int deleteByCode(String code);


}
