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

@JsonRootName("icmssn500")
@Root(name = "ICMSSN500")
public class NFeInfNFeDetImpostoICMSICMSSN500 extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("orig")
    @Element(name = "orig", required = false)
    private String orig;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("csosn")
    @Element(name = "CSOSN", required = false)
    private String CSOSN;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcstret")
    @Element(name = "vBCSTRet", required = false)
    private String vBCSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pst")
    @Element(name = "pST", required = false)
    private String pST;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmssubstituto")
    @Element(name = "vICMSSubstituto", required = false)
    private String vICMSSubstituto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsstret")
    @Element(name = "vICMSSTRet", required = false)
    private String vICMSSTRet;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcfcpstret")
    @Element(name = "vBCFCPSTRet", required = false)
    private String vBCFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pfcpstret")
    @Element(name = "pFCPSTRet", required = false)
    private String pFCPSTRet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vfcpstret")
    @Element(name = "vFCPSTRet", required = false)
    private String vFCPSTRet;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("predbcefet")
    @Element(name = "pRedBCEfet", required = false)
    private String pRedBCEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vbcefet")
    @Element(name = "vBCEfet", required = false)
    private String vBCEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("picmsefet")
    @Element(name = "pICMSEfet", required = false)
    private String pICMSEfet;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vicmsefet")
    @Element(name = "vICMSEfet", required = false)
    private String vICMSEfet;

    public NFeInfNFeDetImpostoICMSICMSSN500() {}

    public NFeInfNFeDetImpostoICMSICMSSN500(String orig, String CSOSN, String vBCSTRet, String pST, String vICMSSubstituto, String vICMSSTRet, String vBCFCPSTRet, String pFCPSTRet, String vFCPSTRet, String pRedBCEfet, String vBCEfet, String pICMSEfet, String vICMSEfet) {
        this.orig = orig;
        this.CSOSN = CSOSN;
        this.vBCSTRet = vBCSTRet;
        this.pST = pST;
        this.vICMSSubstituto = vICMSSubstituto;
        this.vICMSSTRet = vICMSSTRet;
        this.vBCFCPSTRet = vBCFCPSTRet;
        this.pFCPSTRet = pFCPSTRet;
        this.vFCPSTRet = vFCPSTRet;
        this.pRedBCEfet = pRedBCEfet;
        this.vBCEfet = vBCEfet;
        this.pICMSEfet = pICMSEfet;
        this.vICMSEfet = vICMSEfet;
    }

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCSOSN() {
		return CSOSN;
	}

	public void setCSOSN(String cSOSN) {
		CSOSN = cSOSN;
	}

	public String getvBCSTRet() {
		return vBCSTRet;
	}

	public void setvBCSTRet(String vBCSTRet) {
		this.vBCSTRet = vBCSTRet;
	}

	public String getpST() {
		return pST;
	}

	public void setpST(String pST) {
		this.pST = pST;
	}

	public String getvICMSSubstituto() {
		return vICMSSubstituto;
	}

	public void setvICMSSubstituto(String vICMSSubstituto) {
		this.vICMSSubstituto = vICMSSubstituto;
	}

	public String getvICMSSTRet() {
		return vICMSSTRet;
	}

	public void setvICMSSTRet(String vICMSSTRet) {
		this.vICMSSTRet = vICMSSTRet;
	}

	public String getvBCFCPSTRet() {
		return vBCFCPSTRet;
	}

	public void setvBCFCPSTRet(String vBCFCPSTRet) {
		this.vBCFCPSTRet = vBCFCPSTRet;
	}

	public String getpFCPSTRet() {
		return pFCPSTRet;
	}

	public void setpFCPSTRet(String pFCPSTRet) {
		this.pFCPSTRet = pFCPSTRet;
	}

	public String getvFCPSTRet() {
		return vFCPSTRet;
	}

	public void setvFCPSTRet(String vFCPSTRet) {
		this.vFCPSTRet = vFCPSTRet;
	}

	public String getpRedBCEfet() {
		return pRedBCEfet;
	}

	public void setpRedBCEfet(String pRedBCEfet) {
		this.pRedBCEfet = pRedBCEfet;
	}

	public String getvBCEfet() {
		return vBCEfet;
	}

	public void setvBCEfet(String vBCEfet) {
		this.vBCEfet = vBCEfet;
	}

	public String getpICMSEfet() {
		return pICMSEfet;
	}

	public void setpICMSEfet(String pICMSEfet) {
		this.pICMSEfet = pICMSEfet;
	}

	public String getvICMSEfet() {
		return vICMSEfet;
	}

	public void setvICMSEfet(String vICMSEfet) {
		this.vICMSEfet = vICMSEfet;
	}

}
