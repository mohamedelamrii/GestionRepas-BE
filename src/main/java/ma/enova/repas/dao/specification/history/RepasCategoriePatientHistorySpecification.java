package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.RepasCategoriePatientHistoryCriteria;
import ma.enova.repas.bean.history.RepasCategoriePatientHistory;


public class RepasCategoriePatientHistorySpecification extends AbstractHistorySpecification<RepasCategoriePatientHistoryCriteria, RepasCategoriePatientHistory> {

    public RepasCategoriePatientHistorySpecification(RepasCategoriePatientHistoryCriteria criteria) {
        super(criteria);
    }

    public RepasCategoriePatientHistorySpecification(RepasCategoriePatientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
