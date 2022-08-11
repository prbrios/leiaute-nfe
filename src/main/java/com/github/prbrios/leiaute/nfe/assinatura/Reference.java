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
package com.github.prbrios.leiaute.nfe.assinatura;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;

public class Reference {

    @Attribute(name = "URI", required = false)
    private String uri;

    @Path("Transforms")
    @ElementList(entry = "Transform", inline = true, required = false)
    private List<Transform> transform;

    @Element(name = "DigestMethod", required = false)
    private DigestMethod digestMethod;

    @Element(name = "DigestValue", required = false)
    private String digestValue;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public List<Transform> getTransform() {
		return transform;
	}

	public void setTransform(List<Transform> transform) {
		this.transform = transform;
	}

	public DigestMethod getDigestMethod() {
		return digestMethod;
	}

	public void setDigestMethod(DigestMethod digestMethod) {
		this.digestMethod = digestMethod;
	}

	public String getDigestValue() {
		return digestValue;
	}

	public void setDigestValue(String digestValue) {
		this.digestValue = digestValue;
	}

}