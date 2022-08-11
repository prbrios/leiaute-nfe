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

@JsonRootName("deduc")
@Root(name = "deduc")
public class NFeInfNFeCanaDeduc extends Base {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("xded")
    @Element(name = "xDed", required = false)
    private String xDed;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("vded")
    @Element(name = "vDed", required = false)
    private String vDed;

    public NFeInfNFeCanaDeduc() {}

    public NFeInfNFeCanaDeduc(String xDed, String vDed) {
        this.xDed = xDed;
        this.vDed = vDed;
    }

	public String getxDed() {
		return xDed;
	}

	public void setxDed(String xDed) {
		this.xDed = xDed;
	}

	public String getvDed() {
		return vDed;
	}

	public void setvDed(String vDed) {
		this.vDed = vDed;
	}
    
}
