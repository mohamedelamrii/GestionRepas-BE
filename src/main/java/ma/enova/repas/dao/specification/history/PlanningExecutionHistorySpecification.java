package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.PlanningExecutionHistoryCriteria;
import ma.enova.repas.bean.history.PlanningExecutionHistory;


public class PlanningExecutionHistorySpecification extends AbstractHistorySpecification<PlanningExecutionHistoryCriteria, PlanningExecutionHistory> {

    public PlanningExecutionHistorySpecification(PlanningExecutionHistoryCriteria criteria) {
        super(criteria);
    }

    public PlanningExecutionHistorySpecification(PlanningExecutionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
