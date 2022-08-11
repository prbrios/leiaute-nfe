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

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.leiaute.nfe.Base;
import com.github.prbrios.leiaute.nfe.assinatura.Signature;

@JsonRootName("nfe")
@Root(name = "NFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFe extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infnfe")
    @Element(name = "infNFe", required = false)
    private NFeInfNFe infNFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infnfesupl")
    @Element(name = "infNFeSupl", required = false)
    private NFeInfNFeSupl infNFeSupl;

    @JsonIgnore
    @Element(name = "Signature", required = false)
    private Signature signature;

    public NFe() {}

    public NFe(NFeInfNFe infNFe, NFeInfNFeSupl infNFeSupl, Signature signature) {
        this.infNFe = infNFe;
        this.infNFeSupl = infNFeSupl;
        this.signature = signature;
    }

	public NFeInfNFe getInfNFe() {
		return infNFe;
	}

	public void setInfNFe(NFeInfNFe infNFe) {
		this.infNFe = infNFe;
	}

	public NFeInfNFeSupl getInfNFeSupl() {
		return infNFeSupl;
	}

	public void setInfNFeSupl(NFeInfNFeSupl infNFeSupl) {
		this.infNFeSupl = infNFeSupl;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

}