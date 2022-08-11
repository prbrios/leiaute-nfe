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

@JsonRootName("detpag")
@Root(name = "detPag")
public class NFeInfNFePagDetPag extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("indpag")
    @Element(name = "indPag", required = false)
    private String indPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("tpag")
    @Element(name = "tPag", required = false)
    private String tPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xpag")
    @Element(name = "xPag", required = false)
    private String xPag;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vpag")
    @Element(name = "vPag", required = false)
    private String vPag;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("card")
    @Element(name = "card", required = false)
    private NFeInfNFePagDetPagCard card;

    public NFeInfNFePagDetPag() {}

    public NFeInfNFePagDetPag(String indPag, String tPag, String vPag, NFeInfNFePagDetPagCard card) {
        this.indPag = indPag;
        this.tPag = tPag;
        this.vPag = vPag;
        this.card = card;
    }

	public String getIndPag() {
		return indPag;
	}

	public void setIndPag(String indPag) {
		this.indPag = indPag;
	}

	public String gettPag() {
		return tPag;
	}

	public void settPag(String tPag) {
		this.tPag = tPag;
	}

	public String getxPag() {
		return xPag;
	}

	public void setxPag(String xPag) {
		this.xPag = xPag;
	}

	public String getvPag() {
		return vPag;
	}

	public void setvPag(String vPag) {
		this.vPag = vPag;
	}

	public NFeInfNFePagDetPagCard getCard() {
		return card;
	}

	public void setCard(NFeInfNFePagDetPagCard card) {
		this.card = card;
	}

}
