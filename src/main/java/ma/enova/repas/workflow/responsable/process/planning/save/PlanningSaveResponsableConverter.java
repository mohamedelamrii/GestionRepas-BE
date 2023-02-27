package ma.enova.repas.workflow.responsable.process.planning.save;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.repas.zynerator.util.ListUtil;


import ma.enova.repas.ws.converter.CategoriePatientConverter;
import ma.enova.repas.ws.converter.JourConverter;
import ma.enova.repas.ws.converter.PlanningRepasConverter;
import ma.enova.repas.ws.converter.TypeRepasConverter;
import ma.enova.repas.ws.converter.RepasConverter;
import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.process.AbstractProcessConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.core.Planning;

@Component
public class PlanningSaveResponsableConverter extends AbstractProcessConverter<PlanningSaveResponsableInput,PlanningSaveResponsableOutput,Planning> {

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

    public PlanningSaveResponsableConverter(){
        super(Planning.class, PlanningSaveResponsableInput.class, PlanningSaveResponsableOutput.class);
    }

    @Override
    public Planning toItem(PlanningSaveResponsableInput input) {
        if (input == null) {
            return null;
        } else {
            Planning item = new Planning();
            if(StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if(StringUtil.isNotEmpty(input.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(input.getDateDebut()));
            if(StringUtil.isNotEmpty(input.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(input.getDateFin()));
            if(this.categoriePatient && input.getCategoriePatient()!=null)
                item.setCategoriePatient(categoriePatientConverter.toItem(input.getCategoriePatient())) ;

            if(this.jour && input.getJour()!=null)
                item.setJour(jourConverter.toItem(input.getJour())) ;


            if(this.planningRepass && ListUtil.isNotEmpty(input.getPlanningRepass()))
                item.setPlanningRepass(planningRepasConverter.toItem(input.getPlanningRepass()));

        return item;
        }
    }

    @Override
    public PlanningSaveResponsableOutput toOutput(Planning item) {
        if (item == null) {
            return null;
        } else {
            PlanningSaveResponsableOutput output = new PlanningSaveResponsableOutput();
            if(StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if(item.getDateDebut()!=null)
                output.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                output.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
            if(this.categoriePatient && item.getCategoriePatient()!=null) {
                output.setCategoriePatient(categoriePatientConverter.toDto(item.getCategoriePatient())) ;
    }
            if(this.jour && item.getJour()!=null) {
                output.setJour(jourConverter.toDto(item.getJour())) ;
    }
        if(this.planningRepass && ListUtil.isNotEmpty(item.getPlanningRepass())){
            planningRepasConverter.init(true);
            planningRepasConverter.setPlanning(false);
            output.setPlanningRepass(planningRepasConverter.toDto(item.getPlanningRepass()));
            planningRepasConverter.setPlanning(true);

        }
        return output;
    }
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
