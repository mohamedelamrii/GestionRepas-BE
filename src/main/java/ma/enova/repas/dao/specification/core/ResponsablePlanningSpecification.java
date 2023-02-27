package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.ResponsablePlanningCriteria;
import ma.enova.repas.bean.core.ResponsablePlanning;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ResponsablePlanningSpecification extends AbstractSpecification<ResponsablePlanningCriteria, ResponsablePlanning> {

    @Override
    public Predicate toPredicate(Root<ResponsablePlanning> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("nom", criteria.getNom(),criteria.getNomLike());
                addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
                addPredicate("cin", criteria.getCin(),criteria.getCinLike());
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
                addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public ResponsablePlanningSpecification(ResponsablePlanningCriteria criteria) {
        super(criteria);
    }

    public ResponsablePlanningSpecification(ResponsablePlanningCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
