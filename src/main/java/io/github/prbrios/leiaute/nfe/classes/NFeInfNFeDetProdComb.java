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

@JsonRootName("comb")
@Root(name = "comb")
public class NFeInfNFeDetProdComb extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cprodanp")
    @Element(name = "cProdANP", required = false)
    private String cProdANP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("descanp")
    @Element(name = "descANP", required = false)
    private String descANP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pglp")
    @Element(name = "pGLP", required = false)
    private String pGLP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pgnn")
    @Element(name = "pGNn", required = false)
    private String pGNn;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pgni")
    @Element(name = "pGNi", required = false)
    private String pGNi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpart")
    @Element(name = "vPart", required = false)
    private String vPart;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("codif")
    @Element(name = "CODIF", required = false)
    private String CODIF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qtemp")
    @Element(name = "qTemp", required = false)
    private String qTemp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufcons")
    @Element(name = "UFCons", required = false)
    private String UFCons;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cide")
    @Element(name = "CIDE", required = false)
    private NFeInfNFeDetProdCombCIDE CIDE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("encerrante")
    @Element(name = "encerrante", required = false)
    private NFeInfNFeDetProdCombEncerrante encerrante;

    public NFeInfNFeDetProdComb() {}

    public NFeInfNFeDetProdComb(String cProdANP, String descANP, String pGLP, String pGNn, String pGNi, String vPart, String CODIF, String qTemp, String UFCons, NFeInfNFeDetProdCombCIDE CIDE, NFeInfNFeDetProdCombEncerrante encerrante) {
        this.cProdANP = cProdANP;
        this.descANP = descANP;
        this.pGLP = pGLP;
        this.pGNn = pGNn;
        this.pGNi = pGNi;
        this.vPart = vPart;
        this.CODIF = CODIF;
        this.qTemp = qTemp;
        this.UFCons = UFCons;
        this.CIDE = CIDE;
        this.encerrante = encerrante;
    }

	public String getcProdANP() {
		return cProdANP;
	}

	public void setcProdANP(String cProdANP) {
		this.cProdANP = cProdANP;
	}

	public String getDescANP() {
		return descANP;
	}

	public void setDescANP(String descANP) {
		this.descANP = descANP;
	}

	public String getpGLP() {
		return pGLP;
	}

	public void setpGLP(String pGLP) {
		this.pGLP = pGLP;
	}

	public String getpGNn() {
		return pGNn;
	}

	public void setpGNn(String pGNn) {
		this.pGNn = pGNn;
	}

	public String getpGNi() {
		return pGNi;
	}

	public void setpGNi(String pGNi) {
		this.pGNi = pGNi;
	}

	public String getvPart() {
		return vPart;
	}

	public void setvPart(String vPart) {
		this.vPart = vPart;
	}

	public String getCODIF() {
		return CODIF;
	}

	public void setCODIF(String cODIF) {
		CODIF = cODIF;
	}

	public String getqTemp() {
		return qTemp;
	}

	public void setqTemp(String qTemp) {
		this.qTemp = qTemp;
	}

	public String getUFCons() {
		return UFCons;
	}

	public void setUFCons(String uFCons) {
		UFCons = uFCons;
	}

	public NFeInfNFeDetProdCombCIDE getCIDE() {
		return CIDE;
	}

	public void setCIDE(NFeInfNFeDetProdCombCIDE cIDE) {
		CIDE = cIDE;
	}

	public NFeInfNFeDetProdCombEncerrante getEncerrante() {
		return encerrante;
	}

	public void setEncerrante(NFeInfNFeDetProdCombEncerrante encerrante) {
		this.encerrante = encerrante;
	}

}
