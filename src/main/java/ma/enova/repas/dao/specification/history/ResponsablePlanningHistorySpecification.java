package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.ResponsablePlanningHistoryCriteria;
import ma.enova.repas.bean.history.ResponsablePlanningHistory;


public class ResponsablePlanningHistorySpecification extends AbstractHistorySpecification<ResponsablePlanningHistoryCriteria, ResponsablePlanningHistory> {

    public ResponsablePlanningHistorySpecification(ResponsablePlanningHistoryCriteria criteria) {
        super(criteria);
    }

    public ResponsablePlanningHistorySpecification(ResponsablePlanningHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
