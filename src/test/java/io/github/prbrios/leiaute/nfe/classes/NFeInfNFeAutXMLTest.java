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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeAutXML;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeAutXMLTest {

    public static final String XML = "<autXML><CNPJ>00000000000000</CNPJ><CPF>00000000000</CPF></autXML>";

    @Test
    public void test1() {
        NFeInfNFeAutXML obj = new NFeInfNFeAutXML();
        obj.setCNPJ("00000000000000");
        obj.setCPF("00000000000");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeAutXML obj = persister.read(NFeInfNFeAutXML.class, XML);

        assertEquals("00000000000000", obj.getCNPJ());
        assertEquals("00000000000", obj.getCPF());
    }
}
