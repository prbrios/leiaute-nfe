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
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("di")
@Root(name = "DI")
public class NFeInfNFeDetProdDI extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ndi")
    @Element(name = "nDI", required = false)
    private String nDI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ddi")
    @Element(name = "dDI", required = false)
    private String dDI;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xlocdesemb")
    @Element(name = "xLocDesemb", required = false)
    private String xLocDesemb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufdesemb")
    @Element(name = "UFDesemb", required = false)
    private String UFDesemb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ddesemb")
    @Element(name = "dDesemb", required = false)
    private String dDesemb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpviatransp")
    @Element(name = "tpViaTransp", required = false)
    private String tpViaTransp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vafrmm")
    @Element(name = "vAFRMM", required = false)
    private String vAFRMM;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpintermedio")
    @Element(name = "tpIntermedio", required = false)
    private String tpIntermedio;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ufterceiro")
    @Element(name = "UFTerceiro", required = false)
    private String UFTerceiro;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cexportador")
    @Element(name = "cExportador", required = false)
    private String cExportador;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("adi")
    @ElementList(name = "adi", required = false, inline = true)
    private List<NFeInfNFeDetProdDIAdi> adi = new ArrayList<NFeInfNFeDetProdDIAdi>();

    public NFeInfNFeDetProdDI() {}

    public NFeInfNFeDetProdDI(String nDI, String dDI, String xLocDesemb, String UFDesemb, String dDesemb, String tpViaTransp, String vAFRMM, String tpIntermedio, String CNPJ, String UFTerceiro, String cExportador, List<NFeInfNFeDetProdDIAdi> adi) {
        this.nDI = nDI;
        this.dDI = dDI;
        this.xLocDesemb = xLocDesemb;
        this.UFDesemb = UFDesemb;
        this.dDesemb = dDesemb;
        this.tpViaTransp = tpViaTransp;
        this.vAFRMM = vAFRMM;
        this.tpIntermedio = tpIntermedio;
        this.CNPJ = CNPJ;
        this.UFTerceiro = UFTerceiro;
        this.cExportador = cExportador;
        this.adi = adi;
    }

	public String getnDI() {
		return nDI;
	}

	public void setnDI(String nDI) {
		this.nDI = nDI;
	}

	public String getdDI() {
		return dDI;
	}

	public void setdDI(String dDI) {
		this.dDI = dDI;
	}

	public String getxLocDesemb() {
		return xLocDesemb;
	}

	public void setxLocDesemb(String xLocDesemb) {
		this.xLocDesemb = xLocDesemb;
	}

	public String getUFDesemb() {
		return UFDesemb;
	}

	public void setUFDesemb(String uFDesemb) {
		UFDesemb = uFDesemb;
	}

	public String getdDesemb() {
		return dDesemb;
	}

	public void setdDesemb(String dDesemb) {
		this.dDesemb = dDesemb;
	}

	public String getTpViaTransp() {
		return tpViaTransp;
	}

	public void setTpViaTransp(String tpViaTransp) {
		this.tpViaTransp = tpViaTransp;
	}

	public String getvAFRMM() {
		return vAFRMM;
	}

	public void setvAFRMM(String vAFRMM) {
		this.vAFRMM = vAFRMM;
	}

	public String getTpIntermedio() {
		return tpIntermedio;
	}

	public void setTpIntermedio(String tpIntermedio) {
		this.tpIntermedio = tpIntermedio;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getUFTerceiro() {
		return UFTerceiro;
	}

	public void setUFTerceiro(String uFTerceiro) {
		UFTerceiro = uFTerceiro;
	}

	public String getcExportador() {
		return cExportador;
	}

	public void setcExportador(String cExportador) {
		this.cExportador = cExportador;
	}

	public List<NFeInfNFeDetProdDIAdi> getAdi() {
		return adi;
	}

	public void setAdi(List<NFeInfNFeDetProdDIAdi> adi) {
		this.adi = adi;
	}

}
