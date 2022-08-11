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

@JsonRootName("obsitem")
@Root(name = "obsItem")
public class NFeInfNFeDetObsItem extends Base {

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obscont")
    @Element(name = "obsCont", required = false)
	private NFeInfNFeDetObsItemObsCont obsCont;

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("obsfisco")
    @Element(name = "obsFisco", required = false)
	private NFeInfNFeDetObsItemObsFisco obsFisco;

	public NFeInfNFeDetObsItem() {}

	public NFeInfNFeDetObsItem(NFeInfNFeDetObsItemObsCont obsCont, NFeInfNFeDetObsItemObsFisco obsFisco) {
		this.obsCont = obsCont;
		this.obsFisco = obsFisco;
	}

	public NFeInfNFeDetObsItemObsCont getObsCont() {
		return obsCont;
	}

	public void setObsCont(NFeInfNFeDetObsItemObsCont obsCont) {
		this.obsCont = obsCont;
	}

	public NFeInfNFeDetObsItemObsFisco getObsFisco() {
		return obsFisco;
	}

	public void setObsFisco(NFeInfNFeDetObsItemObsFisco obsFisco) {
		this.obsFisco = obsFisco;
	}

}
