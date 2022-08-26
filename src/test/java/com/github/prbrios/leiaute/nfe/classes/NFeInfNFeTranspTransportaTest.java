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


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeTranspTransportaTest {

    public static final String XML = "<transporta><CNPJ>0</CNPJ><CPF>1</CPF><xNome>2</xNome><IE>3</IE><xEnder>4</xEnder><xMun>5</xMun><UF>6</UF></transporta>";

    @Test
    public void test1() {
        NFeInfNFeTranspTransporta obj = new NFeInfNFeTranspTransporta();
        obj.setCNPJ("0");
        obj.setCPF("1");
        obj.setxNome("2");
        obj.setIE("3");
        obj.setxEnder("4");
        obj.setxMun("5");
        obj.setUF("6");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTranspTransporta obj = persister.read(NFeInfNFeTranspTransporta.class, XML);

        assertEquals("0", obj.getCNPJ());
        assertEquals("1", obj.getCPF());
        assertEquals("2", obj.getxNome());
        assertEquals("3", obj.getIE());
        assertEquals("4", obj.getxEnder());
        assertEquals("5", obj.getxMun());
        assertEquals("6", obj.getUF());
    }

}
