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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeTotalRetTrib;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeTotalRetTribTest {

    public static final String XML = "<retTrib><vRetPIS>0</vRetPIS><vRetCOFINS>1</vRetCOFINS><vRetCSLL>2</vRetCSLL><vBCIRRF>3</vBCIRRF><vIRRF>4</vIRRF><vBCRetPrev>5</vBCRetPrev><vRetPrev>6</vRetPrev></retTrib>";

    @Test
    public void test1() {
        NFeInfNFeTotalRetTrib obj = new NFeInfNFeTotalRetTrib();
        obj.setvRetPIS("0");
        obj.setvRetCOFINS("1");
        obj.setvRetCSLL("2");
        obj.setvBCIRRF("3");
        obj.setvIRRF("4");
        obj.setvBCRetPrev("5");
        obj.setvRetPrev("6");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTotalRetTrib obj = persister.read(NFeInfNFeTotalRetTrib.class, XML);

        assertEquals("0", obj.getvRetPIS());
        assertEquals("1", obj.getvRetCOFINS());
        assertEquals("2", obj.getvRetCSLL());
        assertEquals("3", obj.getvBCIRRF());
        assertEquals("4", obj.getvIRRF());
        assertEquals("5", obj.getvBCRetPrev());
        assertEquals("6", obj.getvRetPrev());
    }

}
