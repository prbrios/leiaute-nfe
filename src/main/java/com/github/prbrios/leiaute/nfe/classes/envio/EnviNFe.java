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
package com.github.prbrios.leiaute.nfe.classes.envio;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.prbrios.leiaute.nfe.Base;
import com.github.prbrios.leiaute.nfe.classes.NFe;

@JsonRootName("enviNFe")
@Root(name = "enviNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class EnviNFe extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("versao")
    @Attribute(name = "versao", required = false)
    private String versao;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("idlote")
    @Element(name = "idLote", required = false)
    private String idLote;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indsinc")
    @Element(name = "indSinc", required = false)
    private String indSinc;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nfe")
    @ElementList(name = "NFe", required = false, inline = true)
    private List<NFe> NFe = new ArrayList<NFe>();

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public String getIndSinc() {
		return indSinc;
	}

	public void setIndSinc(String indSinc) {
		this.indSinc = indSinc;
	}

	public List<NFe> getNFe() {
		return NFe;
	}

	public void setNFe(List<NFe> nFe) {
		NFe = nFe;
	}
    
}
