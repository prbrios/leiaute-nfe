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
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@JsonRootName("det")
@Root(name = "det")
public class NFeInfNFeDet extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("nitem")
    @Attribute(name = "nItem", required = false)
    private String nItem;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("prod")
    @Element(name = "prod", required = false)
    private NFeInfNFeDetProd prod;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("imposto")
    @Element(name = "imposto", required = false)
    private NFeInfNFeDetImposto imposto;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("impostodevol")
    @Element(name = "impostoDevol", required = false)
    private NFeInfNFeDetImpostoDevol impostoDevol;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("infadprod")
    @Element(name = "infAdProd", required = false)
    private String infAdProd;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obsitem")
    @Element(name = "obsItem", required = false)
    private NFeInfNFeDetObsItem obsItem;

    public NFeInfNFeDet() {}

    public NFeInfNFeDet(String nItem, NFeInfNFeDetProd prod, NFeInfNFeDetImposto imposto, NFeInfNFeDetImpostoDevol impostoDevol, String infAdProd) {
        this.nItem = nItem;
        this.prod = prod;
        this.imposto = imposto;
        this.impostoDevol = impostoDevol;
        this.infAdProd = infAdProd;
    }

	public NFeInfNFeDet(String nItem, NFeInfNFeDetProd prod, NFeInfNFeDetImposto imposto, NFeInfNFeDetImpostoDevol impostoDevol, String infAdProd, NFeInfNFeDetObsItem obsItem) {
		this.nItem = nItem;
		this.prod = prod;
		this.imposto = imposto;
		this.impostoDevol = impostoDevol;
		this.infAdProd = infAdProd;
		this.obsItem = obsItem;
	}

	public String getnItem() {
		return nItem;
	}

	public void setnItem(String nItem) {
		this.nItem = nItem;
	}

	public NFeInfNFeDetProd getProd() {
		return prod;
	}

	public void setProd(NFeInfNFeDetProd prod) {
		this.prod = prod;
	}

	public NFeInfNFeDetImposto getImposto() {
		return imposto;
	}

	public void setImposto(NFeInfNFeDetImposto imposto) {
		this.imposto = imposto;
	}

	public NFeInfNFeDetImpostoDevol getImpostoDevol() {
		return impostoDevol;
	}

	public void setImpostoDevol(NFeInfNFeDetImpostoDevol impostoDevol) {
		this.impostoDevol = impostoDevol;
	}

	public String getInfAdProd() {
		return infAdProd;
	}

	public void setInfAdProd(String infAdProd) {
		this.infAdProd = infAdProd;
	}

	public NFeInfNFeDetObsItem getObsItem() {
		return obsItem;
	}

	public void setObsItem(NFeInfNFeDetObsItem obsItem) {
		this.obsItem = obsItem;
	}

}
