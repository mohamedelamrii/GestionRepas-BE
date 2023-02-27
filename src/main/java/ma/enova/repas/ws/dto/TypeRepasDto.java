package  ma.enova.repas.ws.dto;

import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeRepasDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;



    public TypeRepasDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }




}
