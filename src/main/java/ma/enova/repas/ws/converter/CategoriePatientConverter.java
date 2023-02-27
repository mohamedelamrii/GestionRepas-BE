package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.CategoriePatientHistory;
import ma.enova.repas.bean.core.CategoriePatient;
import ma.enova.repas.ws.dto.CategoriePatientDto;

@Component
public class CategoriePatientConverter extends AbstractConverter<CategoriePatient, CategoriePatientDto, CategoriePatientHistory> {


    public  CategoriePatientConverter(){
        super(CategoriePatient.class, CategoriePatientDto.class, CategoriePatientHistory.class);
    }

    @Override
    public CategoriePatient toItem(CategoriePatientDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategoriePatient item = new CategoriePatient();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNombrePatientTotal()))
                item.setNombrePatientTotal(dto.getNombrePatientTotal());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


        return item;
        }
    }

    @Override
    public CategoriePatientDto toDto(CategoriePatient item) {
        if (item == null) {
            return null;
        } else {
            CategoriePatientDto dto = new CategoriePatientDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNombrePatientTotal()))
                dto.setNombrePatientTotal(item.getNombrePatientTotal());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        return dto;
        }
    }


    public void initObject(boolean value) {
    }




}
