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
package io.github.prbrios.leiaute.nfe.classes.retorno;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.prbrios.leiaute.nfe.Base;

@JsonRootName("protnfe")
@Root(name = "protNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class RetEnviNFeProtNFe extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name = "versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infprot")
    @Element(name = "infProt", required = false)
    private RetEnviNFeProtNFeInfProt infProt;

    public RetEnviNFeProtNFe() {}

    public RetEnviNFeProtNFe(String versao, RetEnviNFeProtNFeInfProt infProt) {
        this.versao = versao;
        this.infProt = infProt;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public RetEnviNFeProtNFeInfProt getInfProt() {
		return infProt;
	}

	public void setInfProt(RetEnviNFeProtNFeInfProt infProt) {
		this.infProt = infProt;
	}

}