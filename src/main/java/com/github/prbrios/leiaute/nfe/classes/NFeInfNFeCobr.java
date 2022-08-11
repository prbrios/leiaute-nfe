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
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("cobr")
@Root(name = "cobr")
public class NFeInfNFeCobr extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("fat")
    @Element(name = "fat", required = false)
    private NFeInfNFeCobrFat fat;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dup")
    @ElementList(name = "dup", required = false, inline = true)
    private List<NFeInfNFeCobrDup> dup = new ArrayList<NFeInfNFeCobrDup>();

    public NFeInfNFeCobr() {}

    public NFeInfNFeCobr(NFeInfNFeCobrFat fat, List<NFeInfNFeCobrDup> dup) {
        this.fat = fat;
        this.dup = dup;
    }

	public NFeInfNFeCobrFat getFat() {
		return fat;
	}

	public void setFat(NFeInfNFeCobrFat fat) {
		this.fat = fat;
	}

	public List<NFeInfNFeCobrDup> getDup() {
		return dup;
	}

	public void setDup(List<NFeInfNFeCobrDup> dup) {
		this.dup = dup;
	}

}
