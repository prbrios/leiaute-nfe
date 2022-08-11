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

@JsonRootName("pis")
@Root(name = "PIS")
public class NFeInfNFeDetImpostoPIS extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisaliq")
    @Element(name = "PISAliq", required = false)
    private NFeInfNFeDetImpostoPISPISAliq PISAliq;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisqtde")
    @Element(name = "PISQtde", required = false)
    private NFeInfNFeDetImpostoPISPISQtde PISQtde;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisnt")
    @Element(name = "PISNT", required = false)
    private NFeInfNFeDetImpostoPISPISNT PISNT;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("pisoutr")
    @Element(name = "PISOutr", required = false)
    private NFeInfNFeDetImpostoPISPISOutr PISOutr;

    public NFeInfNFeDetImpostoPIS() {}

    public NFeInfNFeDetImpostoPIS(NFeInfNFeDetImpostoPISPISAliq PISAliq, NFeInfNFeDetImpostoPISPISQtde PISQtde, NFeInfNFeDetImpostoPISPISNT PISNT, NFeInfNFeDetImpostoPISPISOutr PISOutr) {
        this.PISAliq = PISAliq;
        this.PISQtde = PISQtde;
        this.PISNT = PISNT;
        this.PISOutr = PISOutr;
    }

	public NFeInfNFeDetImpostoPISPISAliq getPISAliq() {
		return PISAliq;
	}

	public void setPISAliq(NFeInfNFeDetImpostoPISPISAliq pISAliq) {
		PISAliq = pISAliq;
	}

	public NFeInfNFeDetImpostoPISPISQtde getPISQtde() {
		return PISQtde;
	}

	public void setPISQtde(NFeInfNFeDetImpostoPISPISQtde pISQtde) {
		PISQtde = pISQtde;
	}

	public NFeInfNFeDetImpostoPISPISNT getPISNT() {
		return PISNT;
	}

	public void setPISNT(NFeInfNFeDetImpostoPISPISNT pISNT) {
		PISNT = pISNT;
	}

	public NFeInfNFeDetImpostoPISPISOutr getPISOutr() {
		return PISOutr;
	}

	public void setPISOutr(NFeInfNFeDetImpostoPISPISOutr pISOutr) {
		PISOutr = pISOutr;
	}

}
