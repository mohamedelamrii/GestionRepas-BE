package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.PlanningExecutionCriteria;
import ma.enova.repas.bean.core.PlanningExecution;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PlanningExecutionSpecification extends AbstractSpecification<PlanningExecutionCriteria, PlanningExecution> {

    @Override
    public Predicate toPredicate(Root<PlanningExecution> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("datePlanningExecution", criteria.getDatePlanningExecution(), criteria.getDatePlanningExecutionFrom(), criteria.getDatePlanningExecutionTo());
                 addPredicateLong("quantiteExecution", criteria.getQuantiteExecution());
                 addPredicateLong("quantiteExecution", criteria.getQuantiteExecutionMin(), criteria.getQuantiteExecutionMax());
                addPredicate("planningRepas.id", criteria.getPlanningRepas());
                addPredicate("planningRepas.id", criteria.getPlanningRepass());
                addOrderAndFilter();
          }
        return getResult();
    }


    public PlanningExecutionSpecification(PlanningExecutionCriteria criteria) {
        super(criteria);
    }

    public PlanningExecutionSpecification(PlanningExecutionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
