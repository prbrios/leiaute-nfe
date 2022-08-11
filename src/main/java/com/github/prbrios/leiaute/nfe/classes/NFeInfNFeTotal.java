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

@JsonRootName("total")
@Root(name = "total")
public class NFeInfNFeTotal extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("icmstot")
    @Element(name = "ICMSTot", required = false)
    private NFeInfNFeTotalICMSTot ICMSTot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("issqntot")
    @Element(name = "ISSQNtot", required = false)
    private NFeInfNFeTotalISSQNtot ISSQNtot;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rettrib")
    @Element(name = "retTrib", required = false)
    private NFeInfNFeTotalRetTrib retTrib;

    public NFeInfNFeTotal() {}

    public NFeInfNFeTotal(NFeInfNFeTotalICMSTot ICMSTot, NFeInfNFeTotalISSQNtot ISSQNtot, NFeInfNFeTotalRetTrib retTrib) {
        this.ICMSTot = ICMSTot;
        this.ISSQNtot = ISSQNtot;
        this.retTrib = retTrib;
    }

	public NFeInfNFeTotalICMSTot getICMSTot() {
		return ICMSTot;
	}

	public void setICMSTot(NFeInfNFeTotalICMSTot iCMSTot) {
		ICMSTot = iCMSTot;
	}

	public NFeInfNFeTotalISSQNtot getISSQNtot() {
		return ISSQNtot;
	}

	public void setISSQNtot(NFeInfNFeTotalISSQNtot iSSQNtot) {
		ISSQNtot = iSSQNtot;
	}

	public NFeInfNFeTotalRetTrib getRetTrib() {
		return retTrib;
	}

	public void setRetTrib(NFeInfNFeTotalRetTrib retTrib) {
		this.retTrib = retTrib;
	}

}
