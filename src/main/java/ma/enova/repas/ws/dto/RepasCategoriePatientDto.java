package  ma.enova.repas.ws.dto;

import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepasCategoriePatientDto  extends AuditBaseDto {


    private RepasDto repas ;
    private CategoriePatientDto categoriePatient ;


    public RepasCategoriePatientDto(){
        super();
    }




    public RepasDto getRepas(){
        return this.repas;
    }

    public void setRepas(RepasDto repas){
        this.repas = repas;
    }
    public CategoriePatientDto getCategoriePatient(){
        return this.categoriePatient;
    }

    public void setCategoriePatient(CategoriePatientDto categoriePatient){
        this.categoriePatient = categoriePatient;
    }


}
