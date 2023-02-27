package  ma.enova.repas.dao.specification.history;

import ma.enova.repas.zynerator.specification.AbstractHistorySpecification;
import ma.enova.repas.dao.criteria.history.TypeRepasHistoryCriteria;
import ma.enova.repas.bean.history.TypeRepasHistory;


public class TypeRepasHistorySpecification extends AbstractHistorySpecification<TypeRepasHistoryCriteria, TypeRepasHistory> {

    public TypeRepasHistorySpecification(TypeRepasHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeRepasHistorySpecification(TypeRepasHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
