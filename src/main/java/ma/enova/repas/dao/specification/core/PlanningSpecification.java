package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.PlanningCriteria;
import ma.enova.repas.bean.core.Planning;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PlanningSpecification extends AbstractSpecification<PlanningCriteria, Planning> {

    @Override
    public Predicate toPredicate(Root<Planning> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
                addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
                addPredicate("categoriePatient.id", criteria.getCategoriePatient());
                addPredicate("categoriePatient.id", criteria.getCategoriePatients());
                addPredicate("categoriePatient.code", criteria.getCategoriePatient());
                addPredicate("categoriePatient.code", criteria.getCategoriePatients());
                addPredicate("jour.id", criteria.getJour());
                addPredicate("jour.id", criteria.getJours());
                addPredicate("jour.code", criteria.getJour());
                addPredicate("jour.code", criteria.getJours());
                addOrderAndFilter();
          }
        return getResult();
    }


    public PlanningSpecification(PlanningCriteria criteria) {
        super(criteria);
    }

    public PlanningSpecification(PlanningCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
