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
package io.github.prbrios.leiaute.nfe.classes.inutilizacao.envio;

import io.github.prbrios.leiaute.nfe.Base;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "infInut")
public class InutNFeInfInut extends Base {

    @Attribute(name = "Id", required = false)
    private String id;

    @Element(name="tpAmb", required = false)
    private String tpAmb;

    @Element(name="xServ", required = false)
    private String xServ;

    @Element(name="cUF", required = false)
    private String cUF;

    @Element(name="ano", required = false)
    private String ano;

    @Element(name="CNPJ", required = false)
    private String CNPJ;

    @Element(name="mod", required = false)
    private String mod;

    @Element(name="serie", required = false)
    private String serie;

    @Element(name="nNFIni", required = false)
    private String nNFIni;

    @Element(name="nNFFin", required = false)
    private String nNFFin;

    @Element(name="xJust", required = false)
    private String xJust;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(String tpAmb) {
		this.tpAmb = tpAmb;
	}

	public String getxServ() {
		return xServ;
	}

	public void setxServ(String xServ) {
		this.xServ = xServ;
	}

	public String getcUF() {
		return cUF;
	}

	public void setcUF(String cUF) {
		this.cUF = cUF;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
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

	public String getnNFIni() {
		return nNFIni;
	}

	public void setnNFIni(String nNFIni) {
		this.nNFIni = nNFIni;
	}

	public String getnNFFin() {
		return nNFFin;
	}

	public void setnNFFin(String nNFFin) {
		this.nNFFin = nNFFin;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}

}
