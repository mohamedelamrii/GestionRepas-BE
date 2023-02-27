package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.PlanningRepasHistoryCriteria;
import ma.enova.repas.bean.history.PlanningRepasHistory;


public class PlanningRepasHistorySpecification extends AbstractHistorySpecification<PlanningRepasHistoryCriteria, PlanningRepasHistory> {

    public PlanningRepasHistorySpecification(PlanningRepasHistoryCriteria criteria) {
        super(criteria);
    }

    public PlanningRepasHistorySpecification(PlanningRepasHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
