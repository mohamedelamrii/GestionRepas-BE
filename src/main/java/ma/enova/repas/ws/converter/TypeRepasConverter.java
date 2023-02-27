package  ma.enova.repas.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.repas.zynerator.util.StringUtil;
import ma.enova.repas.zynerator.converter.AbstractConverter;
import ma.enova.repas.zynerator.util.DateUtil;
import ma.enova.repas.bean.history.TypeRepasHistory;
import ma.enova.repas.bean.core.TypeRepas;
import ma.enova.repas.ws.dto.TypeRepasDto;

@Component
public class TypeRepasConverter extends AbstractConverter<TypeRepas, TypeRepasDto, TypeRepasHistory> {


    public  TypeRepasConverter(){
        super(TypeRepas.class, TypeRepasDto.class, TypeRepasHistory.class);
    }

    @Override
    public TypeRepas toItem(TypeRepasDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeRepas item = new TypeRepas();
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
    public TypeRepasDto toDto(TypeRepas item) {
        if (item == null) {
            return null;
        } else {
            TypeRepasDto dto = new TypeRepasDto();
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
