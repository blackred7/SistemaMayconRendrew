package bean;
// Generated 21/09/2023 15:04:01 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AnimaisMr generated by hbm2java
 */
@Entity
@Table(name="animais_mr"
    ,catalog="db_maycon_borges"
)
public class AnimaisMr  implements java.io.Serializable {


     private int idAnimaisMr;
     private String nomeMr;
     private String descricaoMr;
     private String especieMr;
     private String precoMr;
     private int quantidadeMr;
     private String origemMr;
     private String tamanhoMr;
     private String pesoMr;

    public AnimaisMr() {
    }

	
    public AnimaisMr(int idAnimaisMr, String nomeMr, String descricaoMr, String especieMr, String precoMr, int quantidadeMr, String origemMr, String tamanhoMr) {
        this.idAnimaisMr = idAnimaisMr;
        this.nomeMr = nomeMr;
        this.descricaoMr = descricaoMr;
        this.especieMr = especieMr;
        this.precoMr = precoMr;
        this.quantidadeMr = quantidadeMr;
        this.origemMr = origemMr;
        this.tamanhoMr = tamanhoMr;
    }
    public AnimaisMr(int idAnimaisMr, String nomeMr, String descricaoMr, String especieMr, String precoMr, int quantidadeMr, String origemMr, String tamanhoMr, String pesoMr) {
       this.idAnimaisMr = idAnimaisMr;
       this.nomeMr = nomeMr;
       this.descricaoMr = descricaoMr;
       this.especieMr = especieMr;
       this.precoMr = precoMr;
       this.quantidadeMr = quantidadeMr;
       this.origemMr = origemMr;
       this.tamanhoMr = tamanhoMr;
       this.pesoMr = pesoMr;

    }
   
     @Id 

    
    @Column(name="idAnimais_MR", unique=true, nullable=false)
    public int getIdAnimaisMr() {
        return this.idAnimaisMr;
    }
    
    public void setIdAnimaisMr(int idAnimaisMr) {
        this.idAnimaisMr = idAnimaisMr;
    }

    
    @Column(name="Nome_MR", nullable=false, length=100)
    public String getNomeMr() {
        return this.nomeMr;
    }
    
    public void setNomeMr(String nomeMr) {
        this.nomeMr = nomeMr;
    }

    
    @Column(name="Descricao_MR", nullable=false)
    public String getDescricaoMr() {
        return this.descricaoMr;
    }
    
    public void setDescricaoMr(String descricaoMr) {
        this.descricaoMr = descricaoMr;
    }

    
    @Column(name="Especie_MR", nullable=false, length=45)
    public String getEspecieMr() {
        return this.especieMr;
    }
    
    public void setEspecieMr(String especieMr) {
        this.especieMr = especieMr;
    }

    
    @Column(name="Preco_MR", nullable=false, length=20)
    public String getPrecoMr() {
        return this.precoMr;
    }
    
    public void setPrecoMr(String precoMr) {
        this.precoMr = precoMr;
    }

    
    @Column(name="Quantidade_MR", nullable=false)
    public int getQuantidadeMr() {
        return this.quantidadeMr;
    }
    
    public void setQuantidadeMr(int quantidadeMr) {
        this.quantidadeMr = quantidadeMr;
    }

    
    @Column(name="Origem_MR", nullable=false, length=45)
    public String getOrigemMr() {
        return this.origemMr;
    }
    
    public void setOrigemMr(String origemMr) {
        this.origemMr = origemMr;
    }

    
    @Column(name="Tamanho_MR", nullable=false, length=50)
    public String getTamanhoMr() {
        return this.tamanhoMr;
    }
    
    public void setTamanhoMr(String tamanhoMr) {
        this.tamanhoMr = tamanhoMr;
    }

    
    @Column(name="Peso_MR", length=45)
    public String getPesoMr() {
        return this.pesoMr;
    }
    
    public void setPesoMr(String pesoMr) {
        this.pesoMr = pesoMr;
    }




}


