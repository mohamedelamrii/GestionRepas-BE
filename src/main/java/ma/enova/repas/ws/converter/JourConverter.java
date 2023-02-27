package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.JourHistory;
import ma.enova.repas.bean.core.Jour;
import ma.enova.repas.ws.dto.JourDto;

@Component
public class JourConverter extends AbstractConverter<Jour, JourDto, JourHistory> {


    public  JourConverter(){
        super(Jour.class, JourDto.class, JourHistory.class);
    }

    @Override
    public Jour toItem(JourDto dto) {
        if (dto == null) {
            return null;
        } else {
        Jour item = new Jour();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public JourDto toDto(Jour item) {
        if (item == null) {
            return null;
        } else {
            JourDto dto = new JourDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
        return dto;
        }
    }


    public void initObject(boolean value) {
    }




}
