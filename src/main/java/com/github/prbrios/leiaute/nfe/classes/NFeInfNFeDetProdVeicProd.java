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

@JsonRootName("veicprod")
@Root(name = "veicProd")
public class NFeInfNFeDetProdVeicProd extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpop")
    @Element(name = "tpOp", required = false)
    private String tpOp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("chassi")
    @Element(name = "chassi", required = false)
    private String chassi;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ccor")
    @Element(name = "cCor", required = false)
    private String cCor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcor")
    @Element(name = "xCor", required = false)
    private String xCor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pot")
    @Element(name = "pot", required = false)
    private String pot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cilin")
    @Element(name = "cilin", required = false)
    private String cilin;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesol")
    @Element(name = "pesoL", required = false)
    private String pesoL;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pesob")
    @Element(name = "pesoB", required = false)
    private String pesoB;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nserie")
    @Element(name = "nSerie", required = false)
    private String nSerie;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpcomb")
    @Element(name = "tpComb", required = false)
    private String tpComb;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nmotor")
    @Element(name = "nMotor", required = false)
    private String nMotor;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmt")
    @Element(name = "CMT", required = false)
    private String CMT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dist")
    @Element(name = "dist", required = false)
    private String dist;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("anomod")
    @Element(name = "anoMod", required = false)
    private String anoMod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("anofab")
    @Element(name = "anoFab", required = false)
    private String anoFab;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tppint")
    @Element(name = "tpPint", required = false)
    private String tpPint;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpveic")
    @Element(name = "tpVeic", required = false)
    private String tpVeic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("espveic")
    @Element(name = "espVeic", required = false)
    private String espVeic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vin")
    @Element(name = "VIN", required = false)
    private String VIN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("condveic")
    @Element(name = "condVeic", required = false)
    private String condVeic;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cmod")
    @Element(name = "cMod", required = false)
    private String cMod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ccordenatran")
    @Element(name = "cCorDENATRAN", required = false)
    private String cCorDENATRAN;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("lota")
    @Element(name = "lota", required = false)
    private String lota;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tprest")
    @Element(name = "tpRest", required = false)
    private String tpRest;

    public NFeInfNFeDetProdVeicProd() {}

    public NFeInfNFeDetProdVeicProd(String tpOp, String chassi, String cCor, String xCor, String pot, String cilin, String pesoL, String pesoB, String nSerie, String tpComb, String nMotor, String CMT, String dist, String anoMod, String anoFab, String tpPint, String tpVeic, String espVeic, String VIN, String condVeic, String cMod, String cCorDENATRAN, String lota, String tpRest) {
        this.tpOp = tpOp;
        this.chassi = chassi;
        this.cCor = cCor;
        this.xCor = xCor;
        this.pot = pot;
        this.cilin = cilin;
        this.pesoL = pesoL;
        this.pesoB = pesoB;
        this.nSerie = nSerie;
        this.tpComb = tpComb;
        this.nMotor = nMotor;
        this.CMT = CMT;
        this.dist = dist;
        this.anoMod = anoMod;
        this.anoFab = anoFab;
        this.tpPint = tpPint;
        this.tpVeic = tpVeic;
        this.espVeic = espVeic;
        this.VIN = VIN;
        this.condVeic = condVeic;
        this.cMod = cMod;
        this.cCorDENATRAN = cCorDENATRAN;
        this.lota = lota;
        this.tpRest = tpRest;
    }

	public String getTpOp() {
		return tpOp;
	}

	public void setTpOp(String tpOp) {
		this.tpOp = tpOp;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getcCor() {
		return cCor;
	}

	public void setcCor(String cCor) {
		this.cCor = cCor;
	}

	public String getxCor() {
		return xCor;
	}

	public void setxCor(String xCor) {
		this.xCor = xCor;
	}

	public String getPot() {
		return pot;
	}

	public void setPot(String pot) {
		this.pot = pot;
	}

	public String getCilin() {
		return cilin;
	}

	public void setCilin(String cilin) {
		this.cilin = cilin;
	}

	public String getPesoL() {
		return pesoL;
	}

	public void setPesoL(String pesoL) {
		this.pesoL = pesoL;
	}

	public String getPesoB() {
		return pesoB;
	}

	public void setPesoB(String pesoB) {
		this.pesoB = pesoB;
	}

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public String getTpComb() {
		return tpComb;
	}

	public void setTpComb(String tpComb) {
		this.tpComb = tpComb;
	}

	public String getnMotor() {
		return nMotor;
	}

	public void setnMotor(String nMotor) {
		this.nMotor = nMotor;
	}

	public String getCMT() {
		return CMT;
	}

	public void setCMT(String cMT) {
		CMT = cMT;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getAnoMod() {
		return anoMod;
	}

	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}

	public String getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}

	public String getTpPint() {
		return tpPint;
	}

	public void setTpPint(String tpPint) {
		this.tpPint = tpPint;
	}

	public String getTpVeic() {
		return tpVeic;
	}

	public void setTpVeic(String tpVeic) {
		this.tpVeic = tpVeic;
	}

	public String getEspVeic() {
		return espVeic;
	}

	public void setEspVeic(String espVeic) {
		this.espVeic = espVeic;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public String getCondVeic() {
		return condVeic;
	}

	public void setCondVeic(String condVeic) {
		this.condVeic = condVeic;
	}

	public String getcMod() {
		return cMod;
	}

	public void setcMod(String cMod) {
		this.cMod = cMod;
	}

	public String getcCorDENATRAN() {
		return cCorDENATRAN;
	}

	public void setcCorDENATRAN(String cCorDENATRAN) {
		this.cCorDENATRAN = cCorDENATRAN;
	}

	public String getLota() {
		return lota;
	}

	public void setLota(String lota) {
		this.lota = lota;
	}

	public String getTpRest() {
		return tpRest;
	}

	public void setTpRest(String tpRest) {
		this.tpRest = tpRest;
	}

}
