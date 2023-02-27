package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.PlanningRepasCriteria;
import ma.enova.repas.bean.core.PlanningRepas;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PlanningRepasSpecification extends AbstractSpecification<PlanningRepasCriteria, PlanningRepas> {

    @Override
    public Predicate toPredicate(Root<PlanningRepas> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                 addPredicateInt("quantite", criteria.getQuantite());
                 addPredicateInt("quantite", criteria.getQuantiteMin(), criteria.getQuantiteMax());
                addPredicate("planning.id", criteria.getPlanning());
                addPredicate("planning.id", criteria.getPlannings());
                addPredicate("repas.id", criteria.getRepas());
                addPredicate("repas.id", criteria.getRepass());
                addPredicate("typeRepas.id", criteria.getTypeRepas());
                addPredicate("typeRepas.id", criteria.getTypeRepass());
                addPredicate("typeRepas.code", criteria.getTypeRepas());
                addPredicate("typeRepas.code", criteria.getTypeRepass());
                addOrderAndFilter();
          }
        return getResult();
    }


    public PlanningRepasSpecification(PlanningRepasCriteria criteria) {
        super(criteria);
    }

    public PlanningRepasSpecification(PlanningRepasCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
