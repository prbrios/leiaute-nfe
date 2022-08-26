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

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.prbrios.leiaute.nfe.Base;

@JsonRootName("retenvinfe")
@Root(name = "retEnviNFe")
public class RetEnviNFe extends Base {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("versao")
	@Attribute(name="versao", required = false)
	private String versao;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("tpamb")
	@Element(name = "tpAmb", required = false)
	private String tpAmb;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("veraplic")
	@Element(name = "verAplic", required = false)
	private String verAplic;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cstat")
	@Element(name = "cStat", required = false)
	private String cStat;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("xmotivo")
	@Element(name = "xMotivo", required = false)
	private String xMotivo;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("cuf")
	@Element(name = "cUF", required = false)
	private String cUF;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("dhrecbto")
	@Element(name = "dhRecbto", required = false)
	private String dhRecbto;

	@Element(name = "infRec", required = false)
	private RetEnviNFeInfRec infRec;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@JsonProperty("protnfe")
	@Element(name = "protNFe", required = false)
	private RetEnviNFeProtNFe protNFe;

	public RetEnviNFeInfRec getInfRec() {
		return infRec;
	}

	public void setInfRec(RetEnviNFeInfRec infRec) {
		this.infRec = infRec;
	}

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

	public RetEnviNFeProtNFe getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(RetEnviNFeProtNFe protNFe) {
		this.protNFe = protNFe;
	}

}