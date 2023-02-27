package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.repas.zynerator.util.ListUtil;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.RepasHistory;
import ma.enova.repas.bean.core.Repas;
import ma.enova.repas.ws.dto.RepasDto;

@Component
public class RepasConverter extends AbstractConverter<Repas, RepasDto, RepasHistory> {

    @Autowired
    private RepasCategoriePatientConverter repasCategoriePatientConverter ;
    @Autowired
    private CategoriePatientConverter categoriePatientConverter ;
    @Autowired
    private TypeRepasConverter typeRepasConverter ;
    private boolean typeRepas;
    private boolean repasCategoriePatients;

    public  RepasConverter(){
        super(Repas.class, RepasDto.class, RepasHistory.class);
        init(true);
    }

    @Override
    public Repas toItem(RepasDto dto) {
        if (dto == null) {
            return null;
        } else {
        Repas item = new Repas();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getImage()))
                item.setImage(dto.getImage());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.typeRepas && dto.getTypeRepas()!=null)
                item.setTypeRepas(typeRepasConverter.toItem(dto.getTypeRepas())) ;


            if(this.repasCategoriePatients && ListUtil.isNotEmpty(dto.getRepasCategoriePatients()))
                item.setRepasCategoriePatients(repasCategoriePatientConverter.toItem(dto.getRepasCategoriePatients()));

        return item;
        }
    }

    @Override
    public RepasDto toDto(Repas item) {
        if (item == null) {
            return null;
        } else {
            RepasDto dto = new RepasDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getImage()))
                dto.setImage(item.getImage());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.typeRepas && item.getTypeRepas()!=null) {
            dto.setTypeRepas(typeRepasConverter.toDto(item.getTypeRepas())) ;
        }
        if(this.repasCategoriePatients && ListUtil.isNotEmpty(item.getRepasCategoriePatients())){
            repasCategoriePatientConverter.init(true);
            repasCategoriePatientConverter.setRepas(false);
            dto.setRepasCategoriePatients(repasCategoriePatientConverter.toDto(item.getRepasCategoriePatients()));
            repasCategoriePatientConverter.setRepas(true);

        }
        return dto;
        }
    }

    public void initList(boolean value) {
        this.repasCategoriePatients = value;
    }

    public void initObject(boolean value) {
        this.typeRepas = value;
    }


    public RepasCategoriePatientConverter getRepasCategoriePatientConverter(){
        return this.repasCategoriePatientConverter;
    }
    public void setRepasCategoriePatientConverter(RepasCategoriePatientConverter repasCategoriePatientConverter ){
        this.repasCategoriePatientConverter = repasCategoriePatientConverter;
    }
    public CategoriePatientConverter getCategoriePatientConverter(){
        return this.categoriePatientConverter;
    }
    public void setCategoriePatientConverter(CategoriePatientConverter categoriePatientConverter ){
        this.categoriePatientConverter = categoriePatientConverter;
    }
    public TypeRepasConverter getTypeRepasConverter(){
        return this.typeRepasConverter;
    }
    public void setTypeRepasConverter(TypeRepasConverter typeRepasConverter ){
        this.typeRepasConverter = typeRepasConverter;
    }


    public boolean  isTypeRepas(){
        return this.typeRepas;
    }
    public void  setTypeRepas(boolean typeRepas){
        this.typeRepas = typeRepas;
    }
    public boolean  isRepasCategoriePatients(){
        return this.repasCategoriePatients ;
    }
    public void  setRepasCategoriePatients(boolean repasCategoriePatients ){
        this.repasCategoriePatients  = repasCategoriePatients ;
    }
}
