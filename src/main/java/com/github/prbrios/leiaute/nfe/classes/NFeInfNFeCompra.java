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

@JsonRootName("compra")
@Root(name = "compra")
public class NFeInfNFeCompra extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xnemp")
    @Element(name = "xNEmp", required = false)
    private String xNEmp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xped")
    @Element(name = "xPed", required = false)
    private String xPed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xcont")
    @Element(name = "xCont", required = false)
    private String xCont;

    public NFeInfNFeCompra() {}

    public NFeInfNFeCompra(String xNEmp, String xPed, String xCont) {
        this.xNEmp = xNEmp;
        this.xPed = xPed;
        this.xCont = xCont;
    }

	public String getxNEmp() {
		return xNEmp;
	}

	public void setxNEmp(String xNEmp) {
		this.xNEmp = xNEmp;
	}

	public String getxPed() {
		return xPed;
	}

	public void setxPed(String xPed) {
		this.xPed = xPed;
	}

	public String getxCont() {
		return xCont;
	}

	public void setxCont(String xCont) {
		this.xCont = xCont;
	}

}
