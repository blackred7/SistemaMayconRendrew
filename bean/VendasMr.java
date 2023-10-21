package bean;
// Generated 21/09/2023 15:04:01 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendasMr generated by hbm2java
 */
@Entity
@Table(name="vendas_mr"
    ,catalog="db_maycon_borges"
)
public class VendasMr  implements java.io.Serializable {


     private int idVendasMr;
     private ClienteMr clienteMr;
     private FunionarioMr funionarioMr;
     private int quantidadeTotalMr;
     private String valorTotalMr;
     private Date dataMr;

    public VendasMr() {
    }

	
    public VendasMr(int idVendasMr, ClienteMr clienteMr, FunionarioMr funionarioMr, int quantidadeTotalMr, String valorTotalMr, Date dataMr) {
        this.idVendasMr = idVendasMr;
        this.clienteMr = clienteMr;
        this.funionarioMr = funionarioMr;
        this.quantidadeTotalMr = quantidadeTotalMr;
        this.valorTotalMr = valorTotalMr;
        this.dataMr = dataMr;
    }
    public VendasMr(int idVendasMr, ClienteMr clienteMr, FunionarioMr funionarioMr, String valorTotalMr, Date dataMr, int quantidadeTotalMr) {
       this.idVendasMr = idVendasMr;
       this.clienteMr = clienteMr;
       this.funionarioMr = funionarioMr;
       this.quantidadeTotalMr = quantidadeTotalMr;
       this.valorTotalMr = valorTotalMr;
       this.dataMr = dataMr;
    }
   
     @Id 

    
    @Column(name="idVendas_MR", unique=true, nullable=false)
    public int getIdVendasMr() {
        return this.idVendasMr;
    }
    
    public void setIdVendasMr(int idVendasMr) {
        this.idVendasMr = idVendasMr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Cliente_idCliente_MR", nullable=false)
    public ClienteMr getClienteMr() {
        return this.clienteMr;
    }
    
    public void setClienteMr(ClienteMr clienteMr) {
        this.clienteMr = clienteMr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Funionario_idFunionario_MR", nullable=false)
    public FunionarioMr getFunionarioMr() {
        return this.funionarioMr;
    }
    
    public void setFunionarioMr(FunionarioMr funionarioMr) {
        this.funionarioMr = funionarioMr;
    }

    
    @Column(name="Quantidade_Total_MR", nullable=false)
    public int getQuantidadeTotalMr() {
        return this.quantidadeTotalMr;
    }
    
    public void setQuantidadeTotalMr(int quantidadeTotalMr) {
        this.quantidadeTotalMr = quantidadeTotalMr;
    }

    
    @Column(name="Valor_Total_MR", nullable=false, length=100)
    public String getValorTotalMr() {
        return this.valorTotalMr;
    }
    
    public void setValorTotalMr(String valorTotalMr) {
        this.valorTotalMr = valorTotalMr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Data_MR", nullable=false, length=10)
    public Date getDataMr() {
        return this.dataMr;
    }
    
    public void setDataMr(Date dataMr) {
        this.dataMr = dataMr;
    }






}

