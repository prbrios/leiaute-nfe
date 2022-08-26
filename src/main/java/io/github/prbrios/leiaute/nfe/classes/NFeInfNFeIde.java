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
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("ide")
@Root(name = "ide")
public class NFeInfNFeIde extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cuf")
    @Element(name = "cUF", required = false)
    private String cUF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnf")
    @Element(name = "cNF", required = false)
    private String cNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("natop")
    @Element(name = "natOp", required = false)
    private String natOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mod")
    @Element(name = "mod", required = false)
    private String mod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("serie")
    @Element(name = "serie", required = false)
    private String serie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nnf")
    @Element(name = "nNF", required = false)
    private String nNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhemi")
    @Element(name = "dhEmi", required = false)
    private String dhEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhsaient")
    @Element(name = "dhSaiEnt", required = false)
    private String dhSaiEnt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpnf")
    @Element(name = "tpNF", required = false)
    private String tpNF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("iddest")
    @Element(name = "idDest", required = false)
    private String idDest;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmunfg")
    @Element(name = "cMunFG", required = false)
    private String cMunFG;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpimp")
    @Element(name = "tpImp", required = false)
    private String tpImp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpemis")
    @Element(name = "tpEmis", required = false)
    private String tpEmis;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cdv")
    @Element(name = "cDV", required = false)
    private String cDV;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpamb")
    @Element(name = "tpAmb", required = false)
    private String tpAmb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("finnfe")
    @Element(name = "finNFe", required = false)
    private String finNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indfinal")
    @Element(name = "indFinal", required = false)
    private String indFinal;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indpres")
    @Element(name = "indPres", required = false)
    private String indPres;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indintermed")
    @Element(name = "indIntermed", required = false)
    private String indIntermed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("procemi")
    @Element(name = "procEmi", required = false)
    private String procEmi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("verproc")
    @Element(name = "verProc", required = false)
    private String verProc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dhcont")
    @Element(name = "dhCont", required = false)
    private String dhCont;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xjust")
    @Element(name = "xJust", required = false)
    private String xJust;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfref")
    @ElementList(name = "NFref", required = false, inline = true)
    private List<NFeInfNFeIdeNFref> nFref = new ArrayList<NFeInfNFeIdeNFref>();

    public NFeInfNFeIde() {}

    public NFeInfNFeIde(String cUF, String cNF, String natOp, String mod, String serie, String nNF, String dhEmi, String dhSaiEnt, String tpNF, String idDest, String cMunFG, String tpImp, String tpEmis, String cDV, String tpAmb, String finNFe, String indFinal, String indPres, String indIntermed, String procEmi, String verProc, String dhCont, String xJust, List<NFeInfNFeIdeNFref> nFref) {
        this.cUF = cUF;
        this.cNF = cNF;
        this.natOp = natOp;
        this.mod = mod;
        this.serie = serie;
        this.nNF = nNF;
        this.dhEmi = dhEmi;
        this.dhSaiEnt = dhSaiEnt;
        this.tpNF = tpNF;
        this.idDest = idDest;
        this.cMunFG = cMunFG;
        this.tpImp = tpImp;
        this.tpEmis = tpEmis;
        this.cDV = cDV;
        this.tpAmb = tpAmb;
        this.finNFe = finNFe;
        this.indFinal = indFinal;
        this.indPres = indPres;
        this.indIntermed = indIntermed;
        this.procEmi = procEmi;
        this.verProc = verProc;
        this.dhCont = dhCont;
        this.xJust = xJust;
        this.nFref = nFref;
    }

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getcNF() {
		return cNF;
	}

	public void setcNF(String cNF) {
		this.cNF = cNF;
	}

	public String getNatOp() {
		return natOp;
	}

	public void setNatOp(String natOp) {
		this.natOp = natOp;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getnNF() {
		return nNF;
	}

	public void setnNF(String nNF) {
		this.nNF = nNF;
	}

	public String getDhEmi() {
		return dhEmi;
	}

	public void setDhEmi(String dhEmi) {
		this.dhEmi = dhEmi;
	}

	public String getDhSaiEnt() {
		return dhSaiEnt;
	}

	public void setDhSaiEnt(String dhSaiEnt) {
		this.dhSaiEnt = dhSaiEnt;
	}

	public String getTpNF() {
		return tpNF;
	}

	public void setTpNF(String tpNF) {
		this.tpNF = tpNF;
	}

	public String getIdDest() {
		return idDest;
	}

	public void setIdDest(String idDest) {
		this.idDest = idDest;
	}

	public String getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(String cMunFG) {
		this.cMunFG = cMunFG;
	}

	public String getTpImp() {
		return tpImp;
	}

	public void setTpImp(String tpImp) {
		this.tpImp = tpImp;
	}

	public String getTpEmis() {
		return tpEmis;
	}

	public void setTpEmis(String tpEmis) {
		this.tpEmis = tpEmis;
	}

	public String getcDV() {
		return cDV;
	}

	public void setcDV(String cDV) {
		this.cDV = cDV;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getFinNFe() {
		return finNFe;
	}

	public void setFinNFe(String finNFe) {
		this.finNFe = finNFe;
	}

	public String getIndFinal() {
		return indFinal;
	}

	public void setIndFinal(String indFinal) {
		this.indFinal = indFinal;
	}

	public String getIndPres() {
		return indPres;
	}

	public void setIndPres(String indPres) {
		this.indPres = indPres;
	}

	public String getIndIntermed() {
		return indIntermed;
	}

	public void setIndIntermed(String indIntermed) {
		this.indIntermed = indIntermed;
	}

	public String getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(String procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}

	public String getDhCont() {
		return dhCont;
	}

	public void setDhCont(String dhCont) {
		this.dhCont = dhCont;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}

	public List<NFeInfNFeIdeNFref> getnFref() {
		return nFref;
	}

	public void setnFref(List<NFeInfNFeIdeNFref> nFref) {
		this.nFref = nFref;
	}

}
