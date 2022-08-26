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

import io.github.prbrios.leiaute.nfe.classes.NFe;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.github.prbrios.leiaute.nfe.Base;
import io.github.prbrios.leiaute.nfe.classes.retorno.RetEnviNFeProtNFe;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@JsonRootName("nfeproc")
@Root(name = "nfeProc")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFeProc extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name = "versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfe")
    @Element(name = "NFe", required = false)
    private NFe NFe;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("protnfe")
    @Element(name = "protNFe", required = false)
    private RetEnviNFeProtNFe protNFe;

    public NFeProc() {}

    public NFeProc(String versao, NFe nfe, RetEnviNFeProtNFe protNFe) {
        this.versao = versao;
        this.NFe = nfe;
        this.protNFe = protNFe;
    }

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public NFe getNFe() {
		return NFe;
	}

	public void setNFe(NFe nFe) {
		NFe = nFe;
	}

	public RetEnviNFeProtNFe getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(RetEnviNFeProtNFe protNFe) {
		this.protNFe = protNFe;
	}

}
