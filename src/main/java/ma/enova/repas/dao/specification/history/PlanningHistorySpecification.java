package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.PlanningHistoryCriteria;
import ma.enova.repas.bean.history.PlanningHistory;


public class PlanningHistorySpecification extends AbstractHistorySpecification<PlanningHistoryCriteria, PlanningHistory> {

    public PlanningHistorySpecification(PlanningHistoryCriteria criteria) {
        super(criteria);
    }

    public PlanningHistorySpecification(PlanningHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
