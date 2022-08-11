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

@JsonRootName("icms20")
@Root(name = "ICMS20")
public class NFeInfNFeDetImpostoICMSICMS20 extends Base {

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
    @JsonProperty("vicmsdeson")
    @Element(name = "vICMSDeson", required = false)
    private String vICMSDeson;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("motdesicms")
    @Element(name = "motDesICMS", required = false)
    private String motDesICMS;

    public NFeInfNFeDetImpostoICMSICMS20() {}

    public NFeInfNFeDetImpostoICMSICMS20(String orig, String CST, String modBC, String pRedBC, String vBC, String pICMS, String vICMS, String vBCFCP, String pFCP, String vFCP, String vICMSDeson, String motDesICMS) {
        this.orig = orig;
        this.CST = CST;
        this.modBC = modBC;
        this.pRedBC = pRedBC;
        this.vBC = vBC;
        this.pICMS = pICMS;
        this.vICMS = vICMS;
        this.vBCFCP = vBCFCP;
        this.pFCP = pFCP;
        this.vFCP = vFCP;
        this.vICMSDeson = vICMSDeson;
        this.motDesICMS = motDesICMS;
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

	public String getvICMSDeson() {
		return vICMSDeson;
	}

	public void setvICMSDeson(String vICMSDeson) {
		this.vICMSDeson = vICMSDeson;
	}

	public String getMotDesICMS() {
		return motDesICMS;
	}

	public void setMotDesICMS(String motDesICMS) {
		this.motDesICMS = motDesICMS;
	}

}
