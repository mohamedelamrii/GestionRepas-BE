package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.RepasCategoriePatientCriteria;
import ma.enova.repas.bean.core.RepasCategoriePatient;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class RepasCategoriePatientSpecification extends AbstractSpecification<RepasCategoriePatientCriteria, RepasCategoriePatient> {

    @Override
    public Predicate toPredicate(Root<RepasCategoriePatient> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("repas.id", criteria.getRepas());
                addPredicate("repas.id", criteria.getRepass());
                addPredicate("categoriePatient.id", criteria.getCategoriePatient());
                addPredicate("categoriePatient.id", criteria.getCategoriePatients());
                addPredicate("categoriePatient.code", criteria.getCategoriePatient());
                addPredicate("categoriePatient.code", criteria.getCategoriePatients());
                addOrderAndFilter();
          }
        return getResult();
    }


    public RepasCategoriePatientSpecification(RepasCategoriePatientCriteria criteria) {
        super(criteria);
    }

    public RepasCategoriePatientSpecification(RepasCategoriePatientCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
