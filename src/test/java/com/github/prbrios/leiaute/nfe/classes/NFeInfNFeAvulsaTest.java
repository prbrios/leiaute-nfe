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

public class NFeInfNFeAvulsaTest {

    public static final String XML = "<avulsa><CNPJ>0</CNPJ><xOrgao>1</xOrgao><matr>2</matr><xAgente>3</xAgente><fone>4</fone><UF>5</UF><nDAR>6</nDAR><dEmi>7</dEmi><vDAR>8</vDAR><repEmi>9</repEmi><dPag>10</dPag></avulsa>";

    @Test
    public void test1() {
        NFeInfNFeAvulsa obj = new NFeInfNFeAvulsa();
        obj.setCNPJ("0");
        obj.setxOrgao("1");
        obj.setMatr("2");
        obj.setxAgente("3");
        obj.setFone("4");
        obj.setUF("5");
        obj.setnDAR("6");
        obj.setdEmi("7");
        obj.setvDAR("8");
        obj.setRepEmi("9");
        obj.setdPag("10");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeAvulsa obj = persister.read(NFeInfNFeAvulsa.class, XML);

        assertEquals("0", obj.getCNPJ());
        assertEquals("1", obj.getxOrgao());
        assertEquals("2", obj.getMatr());
        assertEquals("3", obj.getxAgente());
        assertEquals("4", obj.getFone());
        assertEquals("5", obj.getUF());
        assertEquals("6", obj.getnDAR());
        assertEquals("7", obj.getdEmi());
        assertEquals("8", obj.getvDAR());
        assertEquals("9", obj.getRepEmi());
        assertEquals("10", obj.getdPag());
    }
}
