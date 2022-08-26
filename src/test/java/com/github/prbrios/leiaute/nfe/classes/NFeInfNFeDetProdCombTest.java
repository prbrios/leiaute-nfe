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

public class NFeInfNFeDetProdCombTest {

    public static final String XML = "<comb><cProdANP>0</cProdANP><descANP>1</descANP><pGLP>2</pGLP><pGNn>3</pGNn><pGNi>4</pGNi><vPart>5</vPart><CODIF>6</CODIF><qTemp>7</qTemp><UFCons>8</UFCons></comb>";

    @Test
    public void test1() {

        NFeInfNFeDetProdComb obj = new NFeInfNFeDetProdComb();
        obj.setcProdANP("0");
        obj.setDescANP("1");
        obj.setpGLP("2");
        obj.setpGNn("3");
        obj.setpGNi("4");
        obj.setvPart("5");
        obj.setCODIF("6");
        obj.setqTemp("7");
        obj.setUFCons("8");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetProdComb obj = persister.read(NFeInfNFeDetProdComb.class, XML);

        assertEquals("0", obj.getcProdANP());
        assertEquals("1", obj.getDescANP());
        assertEquals("2", obj.getpGLP());
        assertEquals("3", obj.getpGNn());
        assertEquals("4", obj.getpGNi());
        assertEquals("5", obj.getvPart());
        assertEquals("6", obj.getCODIF());
        assertEquals("7", obj.getqTemp());
        assertEquals("8", obj.getUFCons());

    }
}
