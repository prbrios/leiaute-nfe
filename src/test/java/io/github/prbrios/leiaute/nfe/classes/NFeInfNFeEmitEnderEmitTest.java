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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeEmitEnderEmit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeEmitEnderEmitTest {

    public static final String XML = "<enderEmit><xLgr>0</xLgr><nro>1</nro><xCpl>2</xCpl><xBairro>3</xBairro><cMun>4</cMun><xMun>5</xMun><UF>6</UF><CEP>7</CEP><cPais>8</cPais><xPais>9</xPais><fone>10</fone></enderEmit>";

    @Test
    public void test1() {
        NFeInfNFeEmitEnderEmit obj = new NFeInfNFeEmitEnderEmit();
        obj.setxLgr("0");
        obj.setNro("1");
        obj.setxCpl("2");
        obj.setxBairro("3");
        obj.setcMun("4");
        obj.setxMun("5");
        obj.setUF("6");
        obj.setCEP("7");
        obj.setcPais("8");
        obj.setxPais("9");
        obj.setFone("10");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeEmitEnderEmit obj = persister.read(NFeInfNFeEmitEnderEmit.class, XML);

        assertEquals("0", obj.getxLgr());
        assertEquals("1", obj.getNro());
        assertEquals("2", obj.getxCpl());
        assertEquals("3", obj.getxBairro());
        assertEquals("4", obj.getcMun());
        assertEquals("5", obj.getxMun());
        assertEquals("6", obj.getUF());
        assertEquals("7", obj.getCEP());
        assertEquals("8", obj.getcPais());
        assertEquals("9", obj.getxPais());
        assertEquals("10", obj.getFone());
    }

}
