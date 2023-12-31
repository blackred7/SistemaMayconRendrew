package bean;
// Generated 01/12/2023 14:49:00 by Hibernate Tools 4.3.1


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

/**
 * ClienteMr generated by hbm2java
 */
@Entity
@Table(name="cliente_mr"
    ,catalog="db_maycon_borges"
)
public class ClienteMr  implements java.io.Serializable {


     private int idClienteMr;
     private UsuarioMr usuarioMr;
     private String nomeMr;
     private String emailMr;
     private String cepMr;
     private String rgMr;
     private String descricaoMr;
     private String numTelMr;
     private int sexoMr;
     private String nomeBancoMr;
     private String agenciaBancoMr;
     private String numeroBancoMr;
     private String ruaMr;
     private String bairroMr;
     private String numCasaMr;

    public ClienteMr() {
    }

	
    public ClienteMr(int idClienteMr, UsuarioMr usuarioMr, String nomeMr, String emailMr, String cepMr, String rgMr, String nomeBancoMr, String agenciaBancoMr, String numeroBancoMr, String ruaMr, String bairroMr, String numCasaMr) {
        this.idClienteMr = idClienteMr;
        this.usuarioMr = usuarioMr;
        this.nomeMr = nomeMr;
        this.emailMr = emailMr;
        this.cepMr = cepMr;
        this.rgMr = rgMr;
        this.nomeBancoMr = nomeBancoMr;
        this.agenciaBancoMr = agenciaBancoMr;
        this.numeroBancoMr = numeroBancoMr;
        this.ruaMr = ruaMr;
        this.bairroMr = bairroMr;
        this.numCasaMr = numCasaMr;
    }
    public ClienteMr(int idClienteMr, UsuarioMr usuarioMr, String nomeMr, String emailMr, String cepMr, String rgMr, String descricaoMr, String numTelMr, int sexoMr, String nomeBancoMr, String agenciaBancoMr, String numeroBancoMr, String ruaMr, String bairroMr, String numCasaMr) {
       this.idClienteMr = idClienteMr;
       this.usuarioMr = usuarioMr;
       this.nomeMr = nomeMr;
       this.emailMr = emailMr;
       this.cepMr = cepMr;
       this.rgMr = rgMr;
       this.descricaoMr = descricaoMr;
       this.numTelMr = numTelMr;
       this.sexoMr = sexoMr;
       this.nomeBancoMr = nomeBancoMr;
       this.agenciaBancoMr = agenciaBancoMr;
       this.numeroBancoMr = numeroBancoMr;
       this.ruaMr = ruaMr;
       this.bairroMr = bairroMr;
       this.numCasaMr = numCasaMr;
    }
   
     @Id 

    
    @Column(name="idCliente_MR", unique=true, nullable=false)
    public int getIdClienteMr() {
        return this.idClienteMr;
    }
    
    public void setIdClienteMr(int idClienteMr) {
        this.idClienteMr = idClienteMr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Usuario_idUsuario_MR", nullable=false)
    public UsuarioMr getUsuarioMr() {
        return this.usuarioMr;
    }
    
    public void setUsuarioMr(UsuarioMr usuarioMr) {
        this.usuarioMr = usuarioMr;
    }

    
    @Column(name="Nome_MR", nullable=false, length=60)
    public String getNomeMr() {
        return this.nomeMr;
    }
    
    public void setNomeMr(String nomeMr) {
        this.nomeMr = nomeMr;
    }

    
    @Column(name="Email_MR", nullable=false, length=50)
    public String getEmailMr() {
        return this.emailMr;
    }
    
    public void setEmailMr(String emailMr) {
        this.emailMr = emailMr;
    }

    
    @Column(name="Cep_MR", nullable=false, length=15)
    public String getCepMr() {
        return this.cepMr;
    }
    
    public void setCepMr(String cepMr) {
        this.cepMr = cepMr;
    }

    
    @Column(name="Rg_MR", nullable=false, length=15)
    public String getRgMr() {
        return this.rgMr;
    }
    
    public void setRgMr(String rgMr) {
        this.rgMr = rgMr;
    }

    
    @Column(name="Descricao_MR", length=200)
    public String getDescricaoMr() {
        return this.descricaoMr;
    }
    
    public void setDescricaoMr(String descricaoMr) {
        this.descricaoMr = descricaoMr;
    }

    
    @Column(name="Num_tel_MR", length=13)
    public String getNumTelMr() {
        return this.numTelMr;
    }
    
    public void setNumTelMr(String numTelMr) {
        this.numTelMr = numTelMr;
    }

    
    @Column(name="Sexo_MR")
    public int getSexoMr() {
        return this.sexoMr;
    }
    
    public void setSexoMr(int sexoMr) {
        this.sexoMr = sexoMr;
    }

    
    @Column(name="NomeBanco_MR", nullable=false, length=45)
    public String getNomeBancoMr() {
        return this.nomeBancoMr;
    }
    
    public void setNomeBancoMr(String nomeBancoMr) {
        this.nomeBancoMr = nomeBancoMr;
    }

    
    @Column(name="AgenciaBanco_MR", nullable=false, length=45)
    public String getAgenciaBancoMr() {
        return this.agenciaBancoMr;
    }
    
    public void setAgenciaBancoMr(String agenciaBancoMr) {
        this.agenciaBancoMr = agenciaBancoMr;
    }

    
    @Column(name="NumeroBanco_MR", nullable=false, length=45)
    public String getNumeroBancoMr() {
        return this.numeroBancoMr;
    }
    
    public void setNumeroBancoMr(String numeroBancoMr) {
        this.numeroBancoMr = numeroBancoMr;
    }

    
    @Column(name="Rua_MR", nullable=false, length=45)
    public String getRuaMr() {
        return this.ruaMr;
    }
    
    public void setRuaMr(String ruaMr) {
        this.ruaMr = ruaMr;
    }

    
    @Column(name="Bairro_MR", nullable=false, length=45)
    public String getBairroMr() {
        return this.bairroMr;
    }
    
    public void setBairroMr(String bairroMr) {
        this.bairroMr = bairroMr;
    }

    
    @Column(name="NumCasa_MR", nullable=false, length=45)
    public String getNumCasaMr() {
        return this.numCasaMr;
    }
    
    public void setNumCasaMr(String numCasaMr) {
        this.numCasaMr = numCasaMr;
    }


  @Override
     public String toString() {
return this.nomeMr;
}
@Override
public boolean equals(Object object) {
if (object instanceof ClienteMr) {
ClienteMr atu = (ClienteMr) object;
if (this.getIdClienteMr()== atu.getIdClienteMr()) {
return true;
}
}
return false;
}

}


