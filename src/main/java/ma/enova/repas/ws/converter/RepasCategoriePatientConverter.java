package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.repas.bean.core.Repas;

import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.RepasCategoriePatientHistory;
import ma.enova.repas.bean.core.RepasCategoriePatient;
import ma.enova.repas.ws.dto.RepasCategoriePatientDto;

@Component
public class RepasCategoriePatientConverter extends AbstractConverter<RepasCategoriePatient, RepasCategoriePatientDto, RepasCategoriePatientHistory> {

    @Autowired
    private CategoriePatientConverter categoriePatientConverter ;
    @Autowired
    private RepasConverter repasConverter ;
    private boolean repas;
    private boolean categoriePatient;

    public  RepasCategoriePatientConverter(){
        super(RepasCategoriePatient.class, RepasCategoriePatientDto.class, RepasCategoriePatientHistory.class);
    }

    @Override
    public RepasCategoriePatient toItem(RepasCategoriePatientDto dto) {
        if (dto == null) {
            return null;
        } else {
        RepasCategoriePatient item = new RepasCategoriePatient();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getRepas() != null && dto.getRepas().getId() != null){
                item.setRepas(new Repas());
                item.getRepas().setId(dto.getRepas().getId());
            }

            if(this.categoriePatient && dto.getCategoriePatient()!=null)
                item.setCategoriePatient(categoriePatientConverter.toItem(dto.getCategoriePatient())) ;



        return item;
        }
    }

    @Override
    public RepasCategoriePatientDto toDto(RepasCategoriePatient item) {
        if (item == null) {
            return null;
        } else {
            RepasCategoriePatientDto dto = new RepasCategoriePatientDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.repas && item.getRepas()!=null) {
            dto.setRepas(repasConverter.toDto(item.getRepas())) ;
        }
        if(this.categoriePatient && item.getCategoriePatient()!=null) {
            dto.setCategoriePatient(categoriePatientConverter.toDto(item.getCategoriePatient())) ;
        }
        return dto;
        }
    }


    public void initObject(boolean value) {
        this.repas = value;
        this.categoriePatient = value;
    }


    public CategoriePatientConverter getCategoriePatientConverter(){
        return this.categoriePatientConverter;
    }
    public void setCategoriePatientConverter(CategoriePatientConverter categoriePatientConverter ){
        this.categoriePatientConverter = categoriePatientConverter;
    }
    public RepasConverter getRepasConverter(){
        return this.repasConverter;
    }
    public void setRepasConverter(RepasConverter repasConverter ){
        this.repasConverter = repasConverter;
    }


    public boolean  isRepas(){
        return this.repas;
    }
    public void  setRepas(boolean repas){
        this.repas = repas;
    }
    public boolean  isCategoriePatient(){
        return this.categoriePatient;
    }
    public void  setCategoriePatient(boolean categoriePatient){
        this.categoriePatient = categoriePatient;
    }
}
