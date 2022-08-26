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
package io.github.prbrios.leiaute.nfe.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("issqn")
@Root(name = "ISSQN")
public class NFeInfNFeDetImpostoISSQN extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("valiq")
    @Element(name = "vAliq", required = false)
    private String vAliq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vissqn")
    @Element(name = "vISSQN", required = false)
    private String vISSQN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmunfg")
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("clistserv")
    @Element(name = "cListServ", required = false)
    private String cListServ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdeducao")
    @Element(name = "vDeducao", required = false)
    private String vDeducao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("voutro")
    @Element(name = "vOutro", required = false)
    private String vOutro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdescincond")
    @Element(name = "vDescIncond", required = false)
    private String vDescIncond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdesccond")
    @Element(name = "vDescCond", required = false)
    private String vDescCond;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vissret")
    @Element(name = "vISSRet", required = false)
    private String vISSRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indiss")
    @Element(name = "indISS", required = false)
    private String indISS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cservico")
    @Element(name = "cServico", required = false)
    private String cServico;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmun")
    @Element(name = "cMun", required = false)
    private String cMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpais")
    @Element(name = "cPais", required = false)
    private String cPais;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nprocesso")
    @Element(name = "nProcesso", required = false)
    private String nProcesso;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indincentivo")
    @Element(name = "indIncentivo", required = false)
    private String indIncentivo;

    public NFeInfNFeDetImpostoISSQN() {}

    public NFeInfNFeDetImpostoISSQN(String vBC, String vAliq, String vISSQN, String cMunFG, String cListServ, String vDeducao, String vOutro, String vDescIncond, String vDescCond, String vISSRet, String indISS, String cServico, String cMun, String cPais, String nProcesso, String indIncentivo) {
        this.vBC = vBC;
        this.vAliq = vAliq;
        this.vISSQN = vISSQN;
        this.cMunFG = cMunFG;
        this.cListServ = cListServ;
        this.vDeducao = vDeducao;
        this.vOutro = vOutro;
        this.vDescIncond = vDescIncond;
        this.vDescCond = vDescCond;
        this.vISSRet = vISSRet;
        this.indISS = indISS;
        this.cServico = cServico;
        this.cMun = cMun;
        this.cPais = cPais;
        this.nProcesso = nProcesso;
        this.indIncentivo = indIncentivo;
    }

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getvAliq() {
		return vAliq;
	}

	public void setvAliq(String vAliq) {
		this.vAliq = vAliq;
	}

	public String getvISSQN() {
		return vISSQN;
	}

	public void setvISSQN(String vISSQN) {
		this.vISSQN = vISSQN;
	}

	public String getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(String cMunFG) {
		this.cMunFG = cMunFG;
	}

	public String getcListServ() {
		return cListServ;
	}

	public void setcListServ(String cListServ) {
		this.cListServ = cListServ;
	}

	public String getvDeducao() {
		return vDeducao;
	}

	public void setvDeducao(String vDeducao) {
		this.vDeducao = vDeducao;
	}

	public String getvOutro() {
		return vOutro;
	}

	public void setvOutro(String vOutro) {
		this.vOutro = vOutro;
	}

	public String getvDescIncond() {
		return vDescIncond;
	}

	public void setvDescIncond(String vDescIncond) {
		this.vDescIncond = vDescIncond;
	}

	public String getvDescCond() {
		return vDescCond;
	}

	public void setvDescCond(String vDescCond) {
		this.vDescCond = vDescCond;
	}

	public String getvISSRet() {
		return vISSRet;
	}

	public void setvISSRet(String vISSRet) {
		this.vISSRet = vISSRet;
	}

	public String getIndISS() {
		return indISS;
	}

	public void setIndISS(String indISS) {
		this.indISS = indISS;
	}

	public String getcServico() {
		return cServico;
	}

	public void setcServico(String cServico) {
		this.cServico = cServico;
	}

	public String getcMun() {
		return cMun;
	}

	public void setcMun(String cMun) {
		this.cMun = cMun;
	}

	public String getcPais() {
		return cPais;
	}

	public void setcPais(String cPais) {
		this.cPais = cPais;
	}

	public String getnProcesso() {
		return nProcesso;
	}

	public void setnProcesso(String nProcesso) {
		this.nProcesso = nProcesso;
	}

	public String getIndIncentivo() {
		return indIncentivo;
	}

	public void setIndIncentivo(String indIncentivo) {
		this.indIncentivo = indIncentivo;
	}

}
