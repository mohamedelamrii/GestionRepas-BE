package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.repas.zynerator.util.ListUtil;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.PlanningHistory;
import ma.enova.repas.bean.core.Planning;
import ma.enova.repas.ws.dto.PlanningDto;

@Component
public class PlanningConverter extends AbstractConverter<Planning, PlanningDto, PlanningHistory> {

    @Autowired
    private CategoriePatientConverter categoriePatientConverter ;
    @Autowired
    private JourConverter jourConverter ;
    @Autowired
    private PlanningRepasConverter planningRepasConverter ;
    @Autowired
    private TypeRepasConverter typeRepasConverter ;
    @Autowired
    private RepasConverter repasConverter ;
    private boolean categoriePatient;
    private boolean jour;
    private boolean planningRepass;

    public  PlanningConverter(){
        super(Planning.class, PlanningDto.class, PlanningHistory.class);
        init(true);
    }

    @Override
    public Planning toItem(PlanningDto dto) {
        if (dto == null) {
            return null;
        } else {
        Planning item = new Planning();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(this.categoriePatient && dto.getCategoriePatient()!=null)
                item.setCategoriePatient(categoriePatientConverter.toItem(dto.getCategoriePatient())) ;

            if(this.jour && dto.getJour()!=null)
                item.setJour(jourConverter.toItem(dto.getJour())) ;


            if(this.planningRepass && ListUtil.isNotEmpty(dto.getPlanningRepass()))
                item.setPlanningRepass(planningRepasConverter.toItem(dto.getPlanningRepass()));

        return item;
        }
    }

    @Override
    public PlanningDto toDto(Planning item) {
        if (item == null) {
            return null;
        } else {
            PlanningDto dto = new PlanningDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
        if(this.categoriePatient && item.getCategoriePatient()!=null) {
            dto.setCategoriePatient(categoriePatientConverter.toDto(item.getCategoriePatient())) ;
        }
        if(this.jour && item.getJour()!=null) {
            dto.setJour(jourConverter.toDto(item.getJour())) ;
        }
        if(this.planningRepass && ListUtil.isNotEmpty(item.getPlanningRepass())){
            planningRepasConverter.init(true);
            planningRepasConverter.setPlanning(false);
            dto.setPlanningRepass(planningRepasConverter.toDto(item.getPlanningRepass()));
            planningRepasConverter.setPlanning(true);

        }
        return dto;
        }
    }

    public void initList(boolean value) {
        this.planningRepass = value;
    }

    public void initObject(boolean value) {
        this.categoriePatient = value;
        this.jour = value;
    }


    public CategoriePatientConverter getCategoriePatientConverter(){
        return this.categoriePatientConverter;
    }
    public void setCategoriePatientConverter(CategoriePatientConverter categoriePatientConverter ){
        this.categoriePatientConverter = categoriePatientConverter;
    }
    public JourConverter getJourConverter(){
        return this.jourConverter;
    }
    public void setJourConverter(JourConverter jourConverter ){
        this.jourConverter = jourConverter;
    }
    public PlanningRepasConverter getPlanningRepasConverter(){
        return this.planningRepasConverter;
    }
    public void setPlanningRepasConverter(PlanningRepasConverter planningRepasConverter ){
        this.planningRepasConverter = planningRepasConverter;
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


    public boolean  isCategoriePatient(){
        return this.categoriePatient;
    }
    public void  setCategoriePatient(boolean categoriePatient){
        this.categoriePatient = categoriePatient;
    }
    public boolean  isJour(){
        return this.jour;
    }
    public void  setJour(boolean jour){
        this.jour = jour;
    }
    public boolean  isPlanningRepass(){
        return this.planningRepass ;
    }
    public void  setPlanningRepass(boolean planningRepass ){
        this.planningRepass  = planningRepass ;
    }
}
