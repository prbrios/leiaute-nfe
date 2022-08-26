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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDestTest {

    public static final String XML = "<dest><CNPJ>0</CNPJ><CPF>1</CPF><idEstrangeiro>2</idEstrangeiro><xNome>3</xNome><indIEDest>4</indIEDest><IE>5</IE><ISUF>6</ISUF><IM>7</IM><email>8</email></dest>";

    @Test
    public void test1() {
        NFeInfNFeDest obj = new NFeInfNFeDest();
        obj.setCNPJ("0");
        obj.setCPF("1");
        obj.setIdEstrangeiro("2");
        obj.setxNome("3");
        obj.setIndIEDest("4");
        obj.setIE("5");
        obj.setISUF("6");
        obj.setIM("7");
        obj.setEmail("8");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDest obj = persister.read(NFeInfNFeDest.class, XML);

        assertEquals("0", obj.getCNPJ());
        assertEquals("1", obj.getCPF());
        assertEquals("2", obj.getIdEstrangeiro());
        assertEquals("3", obj.getxNome());
        assertEquals("4", obj.getIndIEDest());
        assertEquals("5", obj.getIE());
        assertEquals("6", obj.getISUF());
        assertEquals("7", obj.getIM());
        assertEquals("8", obj.getEmail());
    }
}
