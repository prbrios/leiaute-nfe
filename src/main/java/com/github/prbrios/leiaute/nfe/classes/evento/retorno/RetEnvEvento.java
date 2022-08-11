package com.github.prbrios.leiaute.nfe.classes.evento.retorno;

import com.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "retEnvEvento")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetEnvEvento extends Base {

	@Attribute(name = "versao", required = false)
	private String versao;

	@Element(name = "idLote", required = false)
	private String idLote;

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

	@Element(name = "retEvento", required = false)
	private RetEnvEventoRetEvento retEvento;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
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

	public RetEnvEventoRetEvento getRetEvento() {
		return retEvento;
	}

	public void setRetEvento(RetEnvEventoRetEvento retEvento) {
		this.retEvento = retEvento;
	}

}