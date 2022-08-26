package io.github.prbrios.leiaute.nfe.classes.evento.retorno;

import io.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infEvento")
public class RetEnvEventoRetEventoInfEvento extends Base {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @Element(name = "verAplic", required = false)
    private String verAplic;

    @Element(name = "cOrgao", required = false)
    private String cOrgao;

    @Element(name = "cStat", required = false)
    private String cStat;

    @Element(name = "xMotivo", required = false)
    private String xMotivo;

    @Element(name = "chNFe", required = false)
    private String chNFe;

    @Element(name = "tpEvento", required = false)
    private String tpEvento;

    @Element(name = "xEvento", required = false)
    private String xEvento;

    @Element(name = "nSeqEvento", required = false)
    private String nSeqEvento;
    
    @Element(name = "cOrgaoAutor", required = false)
    private String cOrgaoAutor;

    @Element(name = "CNPJDest", required = false)
    private String CNPJDest;

    @Element(name = "CPFDest", required = false)
    private String CPFDest;

    @Element(name = "emailDest", required = false)
    private String emailDest;

    @Element(name = "dhRegEvento", required = false)
    private String dhRegEvento;

    @Element(name = "nProt", required = false)
    private String nProt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getVerAplic() {
		return verAplic;
	}

	public void setVerAplic(String verAplic) {
		this.verAplic = verAplic;
	}

	public String getcOrgao() {
		return cOrgao;
	}

	public void setcOrgao(String cOrgao) {
		this.cOrgao = cOrgao;
	}

	public String getcStat() {
		return cStat;
	}

	public void setcStat(String cStat) {
		this.cStat = cStat;
	}

	public String getxMotivo() {
		return xMotivo;
	}

	public void setxMotivo(String xMotivo) {
		this.xMotivo = xMotivo;
	}

	public String getChNFe() {
		return chNFe;
	}

	public void setChNFe(String chNFe) {
		this.chNFe = chNFe;
	}

	public String getTpEvento() {
		return tpEvento;
	}

	public void setTpEvento(String tpEvento) {
		this.tpEvento = tpEvento;
	}

	public String getxEvento() {
		return xEvento;
	}

	public void setxEvento(String xEvento) {
		this.xEvento = xEvento;
	}

	public String getnSeqEvento() {
		return nSeqEvento;
	}

	public void setnSeqEvento(String nSeqEvento) {
		this.nSeqEvento = nSeqEvento;
	}

	public String getcOrgaoAutor() {
		return cOrgaoAutor;
	}

	public void setcOrgaoAutor(String cOrgaoAutor) {
		this.cOrgaoAutor = cOrgaoAutor;
	}

	public String getCNPJDest() {
		return CNPJDest;
	}

	public void setCNPJDest(String cNPJDest) {
		CNPJDest = cNPJDest;
	}

	public String getCPFDest() {
		return CPFDest;
	}

	public void setCPFDest(String cPFDest) {
		CPFDest = cPFDest;
	}

	public String getEmailDest() {
		return emailDest;
	}

	public void setEmailDest(String emailDest) {
		this.emailDest = emailDest;
	}

	public String getDhRegEvento() {
		return dhRegEvento;
	}

	public void setDhRegEvento(String dhRegEvento) {
		this.dhRegEvento = dhRegEvento;
	}

	public String getnProt() {
		return nProt;
	}

	public void setnProt(String nProt) {
		this.nProt = nProt;
	}

}
