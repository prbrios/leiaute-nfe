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

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "NVE")
public class NFeInfNFeDetProdNVE {

    @Text
    private String value;

    public void setText(String v) {
        this.value = v;
    }
    
    public String getValue() {
        return this.value;
    }

    private NFeInfNFeDetProdNVE() {}
    
    public NFeInfNFeDetProdNVE(String v) {
        this.value = v;
    }

}
