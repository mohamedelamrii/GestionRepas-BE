package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.JourHistoryCriteria;
import ma.enova.repas.bean.history.JourHistory;


public class JourHistorySpecification extends AbstractHistorySpecification<JourHistoryCriteria, JourHistory> {

    public JourHistorySpecification(JourHistoryCriteria criteria) {
        super(criteria);
    }

    public JourHistorySpecification(JourHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
