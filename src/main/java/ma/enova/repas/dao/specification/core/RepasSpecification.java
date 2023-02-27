package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.RepasCriteria;
import ma.enova.repas.bean.core.Repas;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class RepasSpecification extends AbstractSpecification<RepasCriteria, Repas> {

    @Override
    public Predicate toPredicate(Root<Repas> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("image", criteria.getImage(),criteria.getImageLike());
                addPredicate("typeRepas.id", criteria.getTypeRepas());
                addPredicate("typeRepas.id", criteria.getTypeRepass());
                addPredicate("typeRepas.code", criteria.getTypeRepas());
                addPredicate("typeRepas.code", criteria.getTypeRepass());
                addOrderAndFilter();
          }
        return getResult();
    }


    public RepasSpecification(RepasCriteria criteria) {
        super(criteria);
    }

    public RepasSpecification(RepasCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
