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
package com.github.prbrios.leiaute.nfe.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("avulsa")
@Root(name = "avulsa")
public class NFeInfNFeAvulsa extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xorgao")
    @Element(name = "xOrgao", required = false)
    private String xOrgao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("matr")
    @Element(name = "matr", required = false)
    private String matr;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xagente")
    @Element(name = "xAgente", required = false)
    private String xAgente;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fone")
    @Element(name = "fone", required = false)
    private String fone;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @Element(name = "UF", required = false)
    private String UF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndar")
    @Element(name = "nDAR", required = false)
    private String nDAR;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("demi")
    @Element(name = "dEmi", required = false)
    private String dEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vdar")
    @Element(name = "vDAR", required = false)
    private String vDAR;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("repemi")
    @Element(name = "repEmi", required = false)
    private String repEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dpag")
    @Element(name = "dPag", required = false)
    private String dPag;

    public NFeInfNFeAvulsa() {}

    public NFeInfNFeAvulsa(String CNPJ, String xOrgao, String matr, String xAgente, String fone, String UF, String nDAR, String dEmi, String vDAR, String repEmi, String dPag) {
        this.CNPJ = CNPJ;
        this.xOrgao = xOrgao;
        this.matr = matr;
        this.xAgente = xAgente;
        this.fone = fone;
        this.UF = UF;
        this.nDAR = nDAR;
        this.dEmi = dEmi;
        this.vDAR = vDAR;
        this.repEmi = repEmi;
        this.dPag = dPag;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getxOrgao() {
		return xOrgao;
	}

	public void setxOrgao(String xOrgao) {
		this.xOrgao = xOrgao;
	}

	public String getMatr() {
		return matr;
	}

	public void setMatr(String matr) {
		this.matr = matr;
	}

	public String getxAgente() {
		return xAgente;
	}

	public void setxAgente(String xAgente) {
		this.xAgente = xAgente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getnDAR() {
		return nDAR;
	}

	public void setnDAR(String nDAR) {
		this.nDAR = nDAR;
	}

	public String getdEmi() {
		return dEmi;
	}

	public void setdEmi(String dEmi) {
		this.dEmi = dEmi;
	}

	public String getvDAR() {
		return vDAR;
	}

	public void setvDAR(String vDAR) {
		this.vDAR = vDAR;
	}

	public String getRepEmi() {
		return repEmi;
	}

	public void setRepEmi(String repEmi) {
		this.repEmi = repEmi;
	}

	public String getdPag() {
		return dPag;
	}

	public void setdPag(String dPag) {
		this.dPag = dPag;
	}

}
