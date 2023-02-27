package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.RepasHistoryCriteria;
import ma.enova.repas.bean.history.RepasHistory;


public class RepasHistorySpecification extends AbstractHistorySpecification<RepasHistoryCriteria, RepasHistory> {

    public RepasHistorySpecification(RepasHistoryCriteria criteria) {
        super(criteria);
    }

    public RepasHistorySpecification(RepasHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
