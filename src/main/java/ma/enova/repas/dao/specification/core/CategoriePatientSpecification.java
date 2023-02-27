package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.CategoriePatientCriteria;
import ma.enova.repas.bean.core.CategoriePatient;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CategoriePatientSpecification extends AbstractSpecification<CategoriePatientCriteria, CategoriePatient> {

    @Override
    public Predicate toPredicate(Root<CategoriePatient> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                 addPredicateInt("nombrePatientTotal", criteria.getNombrePatientTotal());
                 addPredicateInt("nombrePatientTotal", criteria.getNombrePatientTotalMin(), criteria.getNombrePatientTotalMax());
                addOrderAndFilter();
          }
        return getResult();
    }


    public CategoriePatientSpecification(CategoriePatientCriteria criteria) {
        super(criteria);
    }

    public CategoriePatientSpecification(CategoriePatientCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
