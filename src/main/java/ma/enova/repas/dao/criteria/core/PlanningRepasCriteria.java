package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;



public class PlanningRepasCriteria extends BaseCriteria {

    private String quantite;
    private String quantiteMin;
    private String quantiteMax;

    private PlanningCriteria planning ;
    private List<PlanningCriteria> plannings ;
    private RepasCriteria repas ;
    private List<RepasCriteria> repass ;
    private TypeRepasCriteria typeRepas ;
    private List<TypeRepasCriteria> typeRepass ;


    public PlanningRepasCriteria(){}

    public String getQuantite(){
        return this.quantite;
    }
    public void setQuantite(String quantite){
        this.quantite = quantite;
    }   
    public String getQuantiteMin(){
        return this.quantiteMin;
    }
    public void setQuantiteMin(String quantiteMin){
        this.quantiteMin = quantiteMin;
    }
    public String getQuantiteMax(){
        return this.quantiteMax;
    }
    public void setQuantiteMax(String quantiteMax){
        this.quantiteMax = quantiteMax;
    }
      

    public PlanningCriteria getPlanning(){
        return this.planning;
    }

    public void setPlanning(PlanningCriteria planning){
        this.planning = planning;
    }
    public List<PlanningCriteria> getPlannings(){
        return this.plannings;
    }

    public void setPlannings(List<PlanningCriteria> plannings){
        this.plannings = plannings;
    }
    public RepasCriteria getRepas(){
        return this.repas;
    }

    public void setRepas(RepasCriteria repas){
        this.repas = repas;
    }
    public List<RepasCriteria> getRepass(){
        return this.repass;
    }

    public void setRepass(List<RepasCriteria> repass){
        this.repass = repass;
    }
    public TypeRepasCriteria getTypeRepas(){
        return this.typeRepas;
    }

    public void setTypeRepas(TypeRepasCriteria typeRepas){
        this.typeRepas = typeRepas;
    }
    public List<TypeRepasCriteria> getTypeRepass(){
        return this.typeRepass;
    }

    public void setTypeRepass(List<TypeRepasCriteria> typeRepass){
        this.typeRepass = typeRepass;
    }
}
