package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.ResponsablePlanningHistory;
import ma.enova.repas.bean.core.ResponsablePlanning;
import ma.enova.repas.ws.dto.ResponsablePlanningDto;

@Component
public class ResponsablePlanningConverter extends AbstractConverter<ResponsablePlanning, ResponsablePlanningDto, ResponsablePlanningHistory> {


    public  ResponsablePlanningConverter(){
        super(ResponsablePlanning.class, ResponsablePlanningDto.class, ResponsablePlanningHistory.class);
    }

    @Override
    public ResponsablePlanning toItem(ResponsablePlanningDto dto) {
        if (dto == null) {
            return null;
        } else {
        ResponsablePlanning item = new ResponsablePlanning();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());


        return item;
        }
    }

    @Override
    public ResponsablePlanningDto toDto(ResponsablePlanning item) {
        if (item == null) {
            return null;
        } else {
            ResponsablePlanningDto dto = new ResponsablePlanningDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
        return dto;
        }
    }


    public void initObject(boolean value) {
    }




}
