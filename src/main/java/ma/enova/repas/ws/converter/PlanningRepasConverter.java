package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.repas.bean.core.Planning;
import ma.enova.repas.bean.core.Repas;

import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.PlanningRepasHistory;
import ma.enova.repas.bean.core.PlanningRepas;
import ma.enova.repas.ws.dto.PlanningRepasDto;

@Component
public class PlanningRepasConverter extends AbstractConverter<PlanningRepas, PlanningRepasDto, PlanningRepasHistory> {

    @Autowired
    private PlanningConverter planningConverter ;
    @Autowired
    private TypeRepasConverter typeRepasConverter ;
    @Autowired
    private RepasConverter repasConverter ;
    private boolean planning;
    private boolean repas;
    private boolean typeRepas;

    public  PlanningRepasConverter(){
        super(PlanningRepas.class, PlanningRepasDto.class, PlanningRepasHistory.class);
    }

    @Override
    public PlanningRepas toItem(PlanningRepasDto dto) {
        if (dto == null) {
            return null;
        } else {
        PlanningRepas item = new PlanningRepas();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQuantite()))
                item.setQuantite(dto.getQuantite());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(dto.getPlanning() != null && dto.getPlanning().getId() != null){
                item.setPlanning(new Planning());
                item.getPlanning().setId(dto.getPlanning().getId());
            }

            if(dto.getRepas() != null && dto.getRepas().getId() != null){
                item.setRepas(new Repas());
                item.getRepas().setId(dto.getRepas().getId());
            }

            if(this.typeRepas && dto.getTypeRepas()!=null)
                item.setTypeRepas(typeRepasConverter.toItem(dto.getTypeRepas())) ;



        return item;
        }
    }

    @Override
    public PlanningRepasDto toDto(PlanningRepas item) {
        if (item == null) {
            return null;
        } else {
            PlanningRepasDto dto = new PlanningRepasDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQuantite()))
                dto.setQuantite(item.getQuantite());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.planning && item.getPlanning()!=null) {
            dto.setPlanning(planningConverter.toDto(item.getPlanning())) ;
        }
        if(this.repas && item.getRepas()!=null) {
            dto.setRepas(repasConverter.toDto(item.getRepas())) ;
        }
        if(this.typeRepas && item.getTypeRepas()!=null) {
            dto.setTypeRepas(typeRepasConverter.toDto(item.getTypeRepas())) ;
        }
        return dto;
        }
    }


    public void initObject(boolean value) {
        this.planning = value;
        this.repas = value;
        this.typeRepas = value;
    }


    public PlanningConverter getPlanningConverter(){
        return this.planningConverter;
    }
    public void setPlanningConverter(PlanningConverter planningConverter ){
        this.planningConverter = planningConverter;
    }
    public TypeRepasConverter getTypeRepasConverter(){
        return this.typeRepasConverter;
    }
    public void setTypeRepasConverter(TypeRepasConverter typeRepasConverter ){
        this.typeRepasConverter = typeRepasConverter;
    }
    public RepasConverter getRepasConverter(){
        return this.repasConverter;
    }
    public void setRepasConverter(RepasConverter repasConverter ){
        this.repasConverter = repasConverter;
    }


    public boolean  isPlanning(){
        return this.planning;
    }
    public void  setPlanning(boolean planning){
        this.planning = planning;
    }
    public boolean  isRepas(){
        return this.repas;
    }
    public void  setRepas(boolean repas){
        this.repas = repas;
    }
    public boolean  isTypeRepas(){
        return this.typeRepas;
    }
    public void  setTypeRepas(boolean typeRepas){
        this.typeRepas = typeRepas;
    }
}
