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

@JsonRootName("transporta")
@Root(name = "transporta")
public class NFeInfNFeTranspTransporta extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpj")
    @Element(name = "CNPJ", required = false)
    private String CNPJ;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cpf")
    @Element(name = "CPF", required = false)
    private String CPF;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnome")
    @Element(name = "xNome", required = false)
    private String xNome;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ie")
    @Element(name = "IE", required = false)
    private String IE;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xender")
    @Element(name = "xEnder", required = false)
    private String xEnder;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xmun")
    @Element(name = "xMun", required = false)
    private String xMun;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("uf")
    @Element(name = "UF", required = false)
    private String UF;

    public NFeInfNFeTranspTransporta() {}

    public NFeInfNFeTranspTransporta(String CNPJ, String CPF, String xNome, String IE, String xEnder, String xMun, String UF) {
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.xNome = xNome;
        this.IE = IE;
        this.xEnder = xEnder;
        this.xMun = xMun;
        this.UF = UF;
    }

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getxEnder() {
		return xEnder;
	}

	public void setxEnder(String xEnder) {
		this.xEnder = xEnder;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

}
