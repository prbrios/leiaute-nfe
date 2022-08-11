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

import org.simpleframework.xml.Element;

public class SignedInfo {
	
    @SuppressWarnings("unused")
	private static final long serialVersionUID = -5878065134465400530L;

    @Element(name = "CanonicalizationMethod", required = false)
    private CanonicalizationMethod canonicalizationMethod;

    @Element(name = "SignatureMethod", required = false)
    private SignatureMethod signatureMethod;

    @Element(name = "Reference", required = false)
    private Reference reference;

    public CanonicalizationMethod getCanonicalizationMethod() {
        return this.canonicalizationMethod;
    }

    public void setCanonicalizationMethod(final CanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public SignatureMethod getSignatureMethod() {
        return this.signatureMethod;
    }

    public void setSignatureMethod(final SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public Reference getReference() {
        return this.reference;
    }

    public void setReference(final Reference reference) {
        this.reference = reference;
    }

}