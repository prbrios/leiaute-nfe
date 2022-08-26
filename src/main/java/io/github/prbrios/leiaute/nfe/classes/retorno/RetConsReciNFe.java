/*
 * Copyright 2022 prbrios.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.prbrios.leiaute.nfe.classes.retorno;

import io.github.prbrios.leiaute.nfe.Base;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "retConsReciNFe")
public class RetConsReciNFe extends Base {

	@Attribute(name = "versao", required = false)
	private String versao;
	
	@Element(name = "tpAmb", required = false)
	private String tpAmb;
	
	@Element(name = "verAplic", required = false)
	private String verAplic;
	
	@Element(name = "nRec", required = false)
	private String nRec;
	
	@Element(name = "cStat", required = false)
	private String cStat;
	
	@Element(name = "xMotivo", required = false)
	private String xMotivo;
	
	@Element(name = "cUF", required = false)
	private String cUF;
	
	@Element(name = "dhRecbto", required = false)
	private String dhRecbto;
	
	@Element(name = "cMsg", required = false)
	private String cMsg;
	
	@Element(name = "xMsg", required = false)
	private String xMsg;
	
	@ElementList(name = "protNFe", required = false, inline = true)
	private List<RetEnviNFeProtNFe> protNFe = new ArrayList<RetEnviNFeProtNFe>();

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
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

	public String getnRec() {
		return nRec;
	}

	public void setnRec(String nRec) {
		this.nRec = nRec;
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

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getDhRecbto() {
		return dhRecbto;
	}

	public void setDhRecbto(String dhRecbto) {
		this.dhRecbto = dhRecbto;
	}

	public String getcMsg() {
		return cMsg;
	}

	public void setcMsg(String cMsg) {
		this.cMsg = cMsg;
	}

	public String getxMsg() {
		return xMsg;
	}

	public void setxMsg(String xMsg) {
		this.xMsg = xMsg;
	}

	public List<RetEnviNFeProtNFe> getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(List<RetEnviNFeProtNFe> protNFe) {
		this.protNFe = protNFe;
	}
	
}
