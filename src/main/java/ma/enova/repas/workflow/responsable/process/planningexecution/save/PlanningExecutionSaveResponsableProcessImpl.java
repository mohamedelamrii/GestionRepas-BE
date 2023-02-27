package ma.enova.repas.workflow.responsable.process.planningexecution.save;
import ma.enova.repas.service.facade.responsable.PlanningExecutionResponsableService;

import ma.enova.repas.zynerator.process.AbstractProcessImpl;
import ma.enova.repas.zynerator.process.Result;
import ma.enova.repas.bean.core.PlanningExecution;

public class PlanningExecutionSaveResponsableProcessImpl extends AbstractProcessImpl<PlanningExecutionSaveResponsableInput, PlanningExecutionSaveResponsableOutput,  PlanningExecution,  PlanningExecutionSaveResponsableConverter> implements PlanningExecutionSaveResponsableProcess {

    @Override
    public void init(PlanningExecutionSaveResponsableInput input, PlanningExecution item) {

    }

    @Override
    public void validate(PlanningExecutionSaveResponsableInput input, PlanningExecution item, Result<PlanningExecutionSaveResponsableInput, PlanningExecutionSaveResponsableOutput, PlanningExecution> result) {
        
    }

    @Override
    public void run(PlanningExecutionSaveResponsableInput input, PlanningExecution t, Result<PlanningExecutionSaveResponsableInput, PlanningExecutionSaveResponsableOutput, PlanningExecution> result) {
        
    }
    


    private PlanningExecutionResponsableService service;
    public PlanningExecutionSaveResponsableProcessImpl(PlanningExecutionResponsableService service, PlanningExecutionSaveResponsableConverter converter) {
        super(converter);
        this.service = service;
    }

}
