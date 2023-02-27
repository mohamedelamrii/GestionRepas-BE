package ma.enova.repas.workflow.admin.process.planning.save;
import ma.enova.repas.service.facade.admin.PlanningAdminService;

import ma.enova.repas.zynerator.process.AbstractProcessImpl;
import ma.enova.repas.zynerator.process.Result;
import ma.enova.repas.bean.core.Planning;

public class PlanningSaveAdminProcessImpl extends AbstractProcessImpl<PlanningSaveAdminInput, PlanningSaveAdminOutput,  Planning,  PlanningSaveAdminConverter> implements PlanningSaveAdminProcess {

    @Override
    public void init(PlanningSaveAdminInput input, Planning item) {

    }

    @Override
    public void validate(PlanningSaveAdminInput input, Planning item, Result<PlanningSaveAdminInput, PlanningSaveAdminOutput, Planning> result) {
        
    }

    @Override
    public void run(PlanningSaveAdminInput input, Planning t, Result<PlanningSaveAdminInput, PlanningSaveAdminOutput, Planning> result) {
        
    }
    


    private PlanningAdminService service;
    public PlanningSaveAdminProcessImpl(PlanningAdminService service, PlanningSaveAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
