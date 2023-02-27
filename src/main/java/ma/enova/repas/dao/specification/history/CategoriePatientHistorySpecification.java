package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.CategoriePatientHistoryCriteria;
import ma.enova.repas.bean.history.CategoriePatientHistory;


public class CategoriePatientHistorySpecification extends AbstractHistorySpecification<CategoriePatientHistoryCriteria, CategoriePatientHistory> {

    public CategoriePatientHistorySpecification(CategoriePatientHistoryCriteria criteria) {
        super(criteria);
    }

    public CategoriePatientHistorySpecification(CategoriePatientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
