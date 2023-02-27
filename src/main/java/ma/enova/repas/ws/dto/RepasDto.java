package  ma.enova.repas.ws.dto;

import ma.enova.repas.zynerator.audit.Log;
import ma.enova.repas.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

    import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepasDto  extends AuditBaseDto {

    private String libelle  ;
    private String image  ;
    private String description  ;

    private TypeRepasDto typeRepas ;

    private List<RepasCategoriePatientDto> repasCategoriePatients ;

    public RepasDto(){
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
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public TypeRepasDto getTypeRepas(){
        return this.typeRepas;
    }

    public void setTypeRepas(TypeRepasDto typeRepas){
        this.typeRepas = typeRepas;
    }

    public List<RepasCategoriePatientDto> getRepasCategoriePatients(){
        return this.repasCategoriePatients;
    }

    public void setRepasCategoriePatients(List<RepasCategoriePatientDto> repasCategoriePatients){
        this.repasCategoriePatients = repasCategoriePatients;
    }

}
