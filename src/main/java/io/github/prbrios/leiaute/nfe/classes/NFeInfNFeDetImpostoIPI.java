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

@JsonRootName("ipi")
@Root(name = "IPI")
public class NFeInfNFeDetImpostoIPI extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cnpjprod")
    @Element(name = "CNPJProd", required = false)
    private String CNPJProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cselo")
    @Element(name = "cSelo", required = false)
    private String cSelo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("qselo")
    @Element(name = "qSelo", required = false)
    private String qSelo;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("cenq")
    @Element(name = "cEnq", required = false)
    private String cEnq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipitrib")
    @Element(name = "IPITrib", required = false)
    private NFeInfNFeDetImpostoIPIIPITrib IPITrib;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ipint")
    @Element(name = "IPINT", required = false)
    private NFeInfNFeDetImpostoIPIIPINT IPINT;

    public NFeInfNFeDetImpostoIPI() {}

    public NFeInfNFeDetImpostoIPI(String CNPJProd, String cSelo, String qSelo, String cEnq, NFeInfNFeDetImpostoIPIIPITrib IPITrib, NFeInfNFeDetImpostoIPIIPINT IPINT) {
        this.CNPJProd = CNPJProd;
        this.cSelo = cSelo;
        this.qSelo = qSelo;
        this.cEnq = cEnq;
        this.IPITrib = IPITrib;
        this.IPINT = IPINT;
    }

	public String getCNPJProd() {
		return CNPJProd;
	}

	public void setCNPJProd(String cNPJProd) {
		CNPJProd = cNPJProd;
	}

	public String getcSelo() {
		return cSelo;
	}

	public void setcSelo(String cSelo) {
		this.cSelo = cSelo;
	}

	public String getqSelo() {
		return qSelo;
	}

	public void setqSelo(String qSelo) {
		this.qSelo = qSelo;
	}

	public String getcEnq() {
		return cEnq;
	}

	public void setcEnq(String cEnq) {
		this.cEnq = cEnq;
	}

	public NFeInfNFeDetImpostoIPIIPITrib getIPITrib() {
		return IPITrib;
	}

	public void setIPITrib(NFeInfNFeDetImpostoIPIIPITrib iPITrib) {
		IPITrib = iPITrib;
	}

	public NFeInfNFeDetImpostoIPIIPINT getIPINT() {
		return IPINT;
	}

	public void setIPINT(NFeInfNFeDetImpostoIPIIPINT iPINT) {
		IPINT = iPINT;
	}

}
