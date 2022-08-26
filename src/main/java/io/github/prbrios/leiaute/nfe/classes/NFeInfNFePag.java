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
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("pag")
@Root(name = "pag")
public class NFeInfNFePag extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("detpag")
    @ElementList(name = "detPag", required = false, inline = true)
    private List<NFeInfNFePagDetPag> detPag = new ArrayList<NFeInfNFePagDetPag>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vtroco")
    @Element(name = "vTroco", required = false)
    private String vTroco;

    public NFeInfNFePag() {}

    public NFeInfNFePag(List<NFeInfNFePagDetPag> detPag, String vTroco) {
        this.detPag = detPag;
        this.vTroco = vTroco;
    }

	public List<NFeInfNFePagDetPag> getDetPag() {
		return detPag;
	}

	public void setDetPag(List<NFeInfNFePagDetPag> detPag) {
		this.detPag = detPag;
	}

	public String getvTroco() {
		return vTroco;
	}

	public void setvTroco(String vTroco) {
		this.vTroco = vTroco;
	}

}
