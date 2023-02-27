package  ma.enova.repas.dao.criteria.core;



import ma.enova.repas.zynerator.criteria.BaseCriteria;
import java.util.List;



public class RepasCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String image;
    private String imageLike;

    private TypeRepasCriteria typeRepas ;
    private List<TypeRepasCriteria> typeRepass ;


    public RepasCriteria(){}

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getImageLike(){
        return this.imageLike;
    }
    public void setImageLike(String imageLike){
        this.imageLike = imageLike;
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
