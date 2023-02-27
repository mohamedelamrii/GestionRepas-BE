package ma.enova.repas.workflow.admin.process.planningexecution.save;
import ma.enova.repas.service.facade.admin.PlanningExecutionAdminService;

import ma.enova.repas.zynerator.process.AbstractProcessImpl;
import ma.enova.repas.zynerator.process.Result;
import ma.enova.repas.bean.core.PlanningExecution;

public class PlanningExecutionSaveAdminProcessImpl extends AbstractProcessImpl<PlanningExecutionSaveAdminInput, PlanningExecutionSaveAdminOutput,  PlanningExecution,  PlanningExecutionSaveAdminConverter> implements PlanningExecutionSaveAdminProcess {

    @Override
    public void init(PlanningExecutionSaveAdminInput input, PlanningExecution item) {

    }

    @Override
    public void validate(PlanningExecutionSaveAdminInput input, PlanningExecution item, Result<PlanningExecutionSaveAdminInput, PlanningExecutionSaveAdminOutput, PlanningExecution> result) {
        
    }

    @Override
    public void run(PlanningExecutionSaveAdminInput input, PlanningExecution t, Result<PlanningExecutionSaveAdminInput, PlanningExecutionSaveAdminOutput, PlanningExecution> result) {
        
    }
    


    private PlanningExecutionAdminService service;
    public PlanningExecutionSaveAdminProcessImpl(PlanningExecutionAdminService service, PlanningExecutionSaveAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
