package  ma.enova.repas.ws.dto;

import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoriePatientDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;
    private Integer nombrePatientTotal  = 0 ;
    private String description  ;



    public CategoriePatientDto(){
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

    @Log
    public Integer getNombrePatientTotal(){
        return this.nombrePatientTotal;
    }
    public void setNombrePatientTotal(Integer nombrePatientTotal){
        this.nombrePatientTotal = nombrePatientTotal;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }




}
