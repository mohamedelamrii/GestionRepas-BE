package ma.enova.repas.workflow.responsable.process.planningexecution.save;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.repas.ws.converter.PlanningRepasConverter;
import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.process.AbstractProcessConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.core.PlanningExecution;

@Component
public class PlanningExecutionSaveResponsableConverter extends AbstractProcessConverter<PlanningExecutionSaveResponsableInput,PlanningExecutionSaveResponsableOutput,PlanningExecution> {

    @Autowired
    private PlanningRepasConverter planningRepasConverter ;
    private boolean planningRepas;

    public PlanningExecutionSaveResponsableConverter(){
        super(PlanningExecution.class, PlanningExecutionSaveResponsableInput.class, PlanningExecutionSaveResponsableOutput.class);
    }

    @Override
    public PlanningExecution toItem(PlanningExecutionSaveResponsableInput input) {
        if (input == null) {
            return null;
        } else {
            PlanningExecution item = new PlanningExecution();
            if(StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if(StringUtil.isNotEmpty(input.getDatePlanningExecution()))
                item.setDatePlanningExecution(DateUtil.stringEnToDate(input.getDatePlanningExecution()));
            if(StringUtil.isNotEmpty(input.getQuantiteExecution()))
                item.setQuantiteExecution(input.getQuantiteExecution());
            if(StringUtil.isNotEmpty(input.getCommentaire()))
                item.setCommentaire(input.getCommentaire());
            if(this.planningRepas && input.getPlanningRepas()!=null)
                item.setPlanningRepas(planningRepasConverter.toItem(input.getPlanningRepas())) ;



        return item;
        }
    }

    @Override
    public PlanningExecutionSaveResponsableOutput toOutput(PlanningExecution item) {
        if (item == null) {
            return null;
        } else {
            PlanningExecutionSaveResponsableOutput output = new PlanningExecutionSaveResponsableOutput();
            if(StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if(item.getDatePlanningExecution()!=null)
                output.setDatePlanningExecution(DateUtil.dateTimeToString(item.getDatePlanningExecution()));
            if(StringUtil.isNotEmpty(item.getQuantiteExecution()))
                output.setQuantiteExecution(item.getQuantiteExecution());
            if(StringUtil.isNotEmpty(item.getCommentaire()))
                output.setCommentaire(item.getCommentaire());
            if(this.planningRepas && item.getPlanningRepas()!=null) {
                output.setPlanningRepas(planningRepasConverter.toDto(item.getPlanningRepas())) ;
    }
        return output;
    }
}



    public PlanningRepasConverter getPlanningRepasConverter(){
        return this.planningRepasConverter;
    }
    public void setPlanningRepasConverter(PlanningRepasConverter planningRepasConverter ){
        this.planningRepasConverter = planningRepasConverter;
    }


    public boolean  isPlanningRepas(){
        return this.planningRepas;
    }
    public void  setPlanningRepas(boolean planningRepas){
        this.planningRepas = planningRepas;
    }
}
