package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.JourCriteria;
import ma.enova.repas.bean.core.Jour;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class JourSpecification extends AbstractSpecification<JourCriteria, Jour> {

    @Override
    public Predicate toPredicate(Root<Jour> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public JourSpecification(JourCriteria criteria) {
        super(criteria);
    }

    public JourSpecification(JourCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
