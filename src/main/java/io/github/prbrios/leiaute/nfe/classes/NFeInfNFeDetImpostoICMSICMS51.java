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

@JsonRootName("icms51")
@Root(name = "ICMS51")
public class NFeInfNFeDetImpostoICMSICMS51 extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cst")
    @Element(name = "CST", required = false)
    private String CST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("modbc")
    @Element(name = "modBC", required = false)
    private String modBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbc")
    @Element(name = "pRedBC", required = false)
    private String pRedBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbc")
    @Element(name = "vBC", required = false)
    private String vBC;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picms")
    @Element(name = "pICMS", required = false)
    private String pICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsop")
    @Element(name = "vICMSOp", required = false)
    private String vICMSOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pdif")
    @Element(name = "pDif", required = false)
    private String pDif;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsdif")
    @Element(name = "vICMSDif", required = false)
    private String vICMSDif;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicms")
    @Element(name = "vICMS", required = false)
    private String vICMS;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcp")
    @Element(name = "vBCFCP", required = false)
    private String vBCFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcp")
    @Element(name = "pFCP", required = false)
    private String pFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcp")
    @Element(name = "vFCP", required = false)
    private String vFCP;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpdif")
    @Element(name = "pFCPDif", required = false)
    private String pFCPDif;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpdif")
    @Element(name = "vFCPDif", required = false)
    private String vFCPDif;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpefet")
    @Element(name = "vFCPEfet", required = false)
    private String vFCPEfet;
    
    public NFeInfNFeDetImpostoICMSICMS51() {}

    @Deprecated
    public NFeInfNFeDetImpostoICMSICMS51(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMSOp, String pDif, String vICMSDif, String vICMS, String vBCFCP, String pFCP, String vFCP) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMSOp = vICMSOp;
        this.pDif = pDif;
        this.vICMSDif = vICMSDif;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
    }
    
	public NFeInfNFeDetImpostoICMSICMS51(String orig, String cST, String modBC, String pRedBC, String vBC, String pICMS, String vICMSOp, String pDif, String vICMSDif, String vICMS, String vBCFCP, String pFCP, String vFCP, String pFCPDif, String vFCPDif, String vFCPEfet) {
		this.orig = orig;
		this.CST = cST;
		this.modBC = modBC;
		this.pRedBC = pRedBC;
		this.vBC = vBC;
		this.pICMS = pICMS;
		this.vICMSOp = vICMSOp;
		this.pDif = pDif;
		this.vICMSDif = vICMSDif;
		this.vICMS = vICMS;
		this.vBCFCP = vBCFCP;
		this.pFCP = pFCP;
		this.vFCP = vFCP;
		this.pFCPDif = pFCPDif;
		this.vFCPDif = vFCPDif;
		this.vFCPEfet = vFCPEfet;
	}

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getModBC() {
		return modBC;
	}

	public void setModBC(String modBC) {
		this.modBC = modBC;
	}

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMSOp() {
		return vICMSOp;
	}

	public void setvICMSOp(String vICMSOp) {
		this.vICMSOp = vICMSOp;
	}

	public String getpDif() {
		return pDif;
	}

	public void setpDif(String pDif) {
		this.pDif = pDif;
	}

	public String getvICMSDif() {
		return vICMSDif;
	}

	public void setvICMSDif(String vICMSDif) {
		this.vICMSDif = vICMSDif;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getvBCFCP() {
		return vBCFCP;
	}

	public void setvBCFCP(String vBCFCP) {
		this.vBCFCP = vBCFCP;
	}

	public String getpFCP() {
		return pFCP;
	}

	public void setpFCP(String pFCP) {
		this.pFCP = pFCP;
	}

	public String getvFCP() {
		return vFCP;
	}

	public void setvFCP(String vFCP) {
		this.vFCP = vFCP;
	}

	public String getpFCPDif() {
		return pFCPDif;
	}

	public void setpFCPDif(String pFCPDif) {
		this.pFCPDif = pFCPDif;
	}

	public String getvFCPDif() {
		return vFCPDif;
	}

	public void setvFCPDif(String vFCPDif) {
		this.vFCPDif = vFCPDif;
	}

	public String getvFCPEfet() {
		return vFCPEfet;
	}

	public void setvFCPEfet(String vFCPEfet) {
		this.vFCPEfet = vFCPEfet;
	}

}
