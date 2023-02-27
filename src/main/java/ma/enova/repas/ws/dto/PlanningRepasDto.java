package  ma.enova.repas.ws.dto;

import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlanningRepasDto  extends AuditBaseDto {

    private Integer quantite  = 0 ;
    private String description  ;

    private PlanningDto planning ;
    private RepasDto repas ;
    private TypeRepasDto typeRepas ;


    public PlanningRepasDto(){
        super();
    }



    @Log
    public Integer getQuantite(){
        return this.quantite;
    }
    public void setQuantite(Integer quantite){
        this.quantite = quantite;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public PlanningDto getPlanning(){
        return this.planning;
    }

    public void setPlanning(PlanningDto planning){
        this.planning = planning;
    }
    public RepasDto getRepas(){
        return this.repas;
    }

    public void setRepas(RepasDto repas){
        this.repas = repas;
    }
    public TypeRepasDto getTypeRepas(){
        return this.typeRepas;
    }

    public void setTypeRepas(TypeRepasDto typeRepas){
        this.typeRepas = typeRepas;
    }


}
