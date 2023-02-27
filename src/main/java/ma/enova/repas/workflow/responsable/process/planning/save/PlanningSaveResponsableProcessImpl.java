package ma.enova.repas.workflow.responsable.process.planning.save;
import ma.enova.repas.service.facade.responsable.PlanningResponsableService;

import ma.enova.repas.zynerator.process.AbstractProcessImpl;
import ma.enova.repas.zynerator.process.Result;
import ma.enova.repas.bean.core.Planning;

public class PlanningSaveResponsableProcessImpl extends AbstractProcessImpl<PlanningSaveResponsableInput, PlanningSaveResponsableOutput,  Planning,  PlanningSaveResponsableConverter> implements PlanningSaveResponsableProcess {

    @Override
    public void init(PlanningSaveResponsableInput input, Planning item) {

    }

    @Override
    public void validate(PlanningSaveResponsableInput input, Planning item, Result<PlanningSaveResponsableInput, PlanningSaveResponsableOutput, Planning> result) {
        
    }

    @Override
    public void run(PlanningSaveResponsableInput input, Planning t, Result<PlanningSaveResponsableInput, PlanningSaveResponsableOutput, Planning> result) {
        
    }
    


    private PlanningResponsableService service;
    public PlanningSaveResponsableProcessImpl(PlanningResponsableService service, PlanningSaveResponsableConverter converter) {
        super(converter);
        this.service = service;
    }

}
