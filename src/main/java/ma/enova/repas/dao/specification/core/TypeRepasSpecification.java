package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.TypeRepasCriteria;
import ma.enova.repas.bean.core.TypeRepas;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeRepasSpecification extends AbstractSpecification<TypeRepasCriteria, TypeRepas> {

    @Override
    public Predicate toPredicate(Root<TypeRepas> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
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


    public TypeRepasSpecification(TypeRepasCriteria criteria) {
        super(criteria);
    }

    public TypeRepasSpecification(TypeRepasCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
