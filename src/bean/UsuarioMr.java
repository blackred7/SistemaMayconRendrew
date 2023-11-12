package bean;
// Generated 09/11/2023 15:03:23 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuarioMr generated by hbm2java
 */
@Entity
@Table(name="usuario_mr"
    ,catalog="db_maycon_borges"
)
public class UsuarioMr  implements java.io.Serializable {


     private int idUsuarioMr;
     private String nomeMr;
     private Date nascMr;
     private String senhaMr;
     private String apelidoMr;
     private String cpfMr;
     private int nivelMr;
     private String ativoMr;


    public UsuarioMr() {
    }

	
    public UsuarioMr(int idUsuarioMr, String nomeMr, Date nascMr, String senhaMr, String apelidoMr, String cpfMr, int nivelMr, String ativoMr) {
        this.idUsuarioMr = idUsuarioMr;
        this.nomeMr = nomeMr;
        this.nascMr = nascMr;
        this.senhaMr = senhaMr;
        this.apelidoMr = apelidoMr;
        this.cpfMr = cpfMr;
        this.nivelMr = nivelMr;
        this.ativoMr = ativoMr;
    }
    public UsuarioMr( String nomeMr, Date nascMr, String senhaMr, String apelidoMr, String cpfMr, int nivelMr, String ativoMr, int idUsuarioMr) {
       this.idUsuarioMr = idUsuarioMr;
       this.nomeMr = nomeMr;
       this.nascMr = nascMr;
       this.senhaMr = senhaMr;
       this.apelidoMr = apelidoMr;
       this.cpfMr = cpfMr;
       this.nivelMr = nivelMr;
       this.ativoMr = ativoMr;
      
    }
   
     @Id 

    
    @Column(name="idUsuario_MR", unique=true, nullable=false)
    public int getIdUsuarioMr() {
        return this.idUsuarioMr;
    }
    
    public void setIdUsuarioMr(int idUsuarioMr) {
        this.idUsuarioMr = idUsuarioMr;
    }

    
    @Column(name="Nome_MR", nullable=false, length=60)
    public String getNomeMr() {
        return this.nomeMr;
    }
    
    public void setNomeMr(String nomeMr) {
        this.nomeMr = nomeMr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Nasc_MR", nullable=false, length=10)
    public Date getNascMr() {
        return this.nascMr;
    }
    
    public void setNascMr(Date nascMr) {
        this.nascMr = nascMr;
    }

    
    @Column(name="Senha_MR", nullable=false, length=20)
    public String getSenhaMr() {
        return this.senhaMr;
    }
    
    public void setSenhaMr(String senhaMr) {
        this.senhaMr = senhaMr;
    }

    
    @Column(name="Apelido_MR", nullable=false, length=45)
    public String getApelidoMr() {
        return this.apelidoMr;
    }
    
    public void setApelidoMr(String apelidoMr) {
        this.apelidoMr = apelidoMr;
    }

    
    @Column(name="Cpf_MR", nullable=false, length=15)
    public String getCpfMr() {
        return this.cpfMr;
    }
    
    public void setCpfMr(String cpfMr) {
        this.cpfMr = cpfMr;
    }

    
    @Column(name="Nivel_MR", nullable=false)
    public int getNivelMr() {
        return this.nivelMr;
    }
    
    public void setNivelMr(int nivelMr) {
        this.nivelMr = nivelMr;
    }

    
    @Column(name="Ativo_MR", nullable=false, length=1)
    public String getAtivoMr() {
        return this.ativoMr;
    }
    
    public void setAtivoMr(String ativoMr) {
        this.ativoMr = ativoMr;
    }


@Override
     public  String toString(){
    
         return this.getNomeMr();

}



}


