package  ma.enova.repas.dao.specification.core;




import ma.enova.repas.zynerator.specification.AbstractSpecification;
import ma.enova.repas.dao.criteria.core.PatientCriteria;
import ma.enova.repas.bean.core.Patient;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PatientSpecification extends AbstractSpecification<PatientCriteria, Patient> {

    @Override
    public Predicate toPredicate(Root<Patient> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("ipp", criteria.getIpp(),criteria.getIppLike());
                addPredicate("nom", criteria.getNom(),criteria.getNomLike());
                addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
                addPredicate("cin", criteria.getCin(),criteria.getCinLike());
                addPredicate("codeRamed", criteria.getCodeRamed(),criteria.getCodeRamedLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public PatientSpecification(PatientCriteria criteria) {
        super(criteria);
    }

    public PatientSpecification(PatientCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
