package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.PlanningExecutionHistory;
import ma.enova.repas.bean.core.PlanningExecution;
import ma.enova.repas.ws.dto.PlanningExecutionDto;

@Component
public class PlanningExecutionConverter extends AbstractConverter<PlanningExecution, PlanningExecutionDto, PlanningExecutionHistory> {

    @Autowired
    private PlanningRepasConverter planningRepasConverter ;
    private boolean planningRepas;

    public  PlanningExecutionConverter(){
        super(PlanningExecution.class, PlanningExecutionDto.class, PlanningExecutionHistory.class);
    }

    @Override
    public PlanningExecution toItem(PlanningExecutionDto dto) {
        if (dto == null) {
            return null;
        } else {
        PlanningExecution item = new PlanningExecution();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDatePlanningExecution()))
                item.setDatePlanningExecution(DateUtil.stringEnToDate(dto.getDatePlanningExecution()));
            if(StringUtil.isNotEmpty(dto.getQuantiteExecution()))
                item.setQuantiteExecution(dto.getQuantiteExecution());
            if(StringUtil.isNotEmpty(dto.getCommentaire()))
                item.setCommentaire(dto.getCommentaire());
            if(this.planningRepas && dto.getPlanningRepas()!=null)
                item.setPlanningRepas(planningRepasConverter.toItem(dto.getPlanningRepas())) ;



        return item;
        }
    }

    @Override
    public PlanningExecutionDto toDto(PlanningExecution item) {
        if (item == null) {
            return null;
        } else {
            PlanningExecutionDto dto = new PlanningExecutionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDatePlanningExecution()!=null)
                dto.setDatePlanningExecution(DateUtil.dateTimeToString(item.getDatePlanningExecution()));
            if(StringUtil.isNotEmpty(item.getQuantiteExecution()))
                dto.setQuantiteExecution(item.getQuantiteExecution());
            if(StringUtil.isNotEmpty(item.getCommentaire()))
                dto.setCommentaire(item.getCommentaire());
        if(this.planningRepas && item.getPlanningRepas()!=null) {
            dto.setPlanningRepas(planningRepasConverter.toDto(item.getPlanningRepas())) ;
        }
        return dto;
        }
    }


    public void initObject(boolean value) {
        this.planningRepas = value;
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
