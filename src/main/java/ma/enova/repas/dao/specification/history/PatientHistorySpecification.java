package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.repas.bean.history.PatientHistory;


public class PatientHistorySpecification extends AbstractHistorySpecification<PatientHistoryCriteria, PatientHistory> {

    public PatientHistorySpecification(PatientHistoryCriteria criteria) {
        super(criteria);
    }

    public PatientHistorySpecification(PatientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
