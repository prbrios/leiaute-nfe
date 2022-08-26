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

public class NFeInfNFeTotalISSQNtotTest {

    public static final String XML = "<ISSQNtot><vServ>0</vServ><vBC>1</vBC><vISS>2</vISS><vPIS>3</vPIS><vCOFINS>4</vCOFINS><dCompet>5</dCompet><vDeducao>6</vDeducao><vOutro>7</vOutro><vDescIncond>8</vDescIncond><vDescCond>9</vDescCond><vISSRet>10</vISSRet><cRegTrib>11</cRegTrib></ISSQNtot>";

    @Test
    public void test1() {
        NFeInfNFeTotalISSQNtot obj = new NFeInfNFeTotalISSQNtot();
        obj.setvServ("0");
        obj.setvBC("1");
        obj.setvISS("2");
        obj.setvPIS("3");
        obj.setvCOFINS("4");
        obj.setdCompet("5");
        obj.setvDeducao("6");
        obj.setvOutro("7");
        obj.setvDescIncond("8");
        obj.setvDescCond("9");
        obj.setvISSRet("10");
        obj.setcRegTrib("11");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTotalISSQNtot obj = persister.read(NFeInfNFeTotalISSQNtot.class, XML);

        assertEquals("0", obj.getvServ());
        assertEquals("1", obj.getvBC());
        assertEquals("2", obj.getvISS());
        assertEquals("3", obj.getvPIS());
        assertEquals("4", obj.getvCOFINS());
        assertEquals("5", obj.getdCompet());
        assertEquals("6", obj.getvDeducao());
        assertEquals("7", obj.getvOutro());
        assertEquals("8", obj.getvDescIncond());
        assertEquals("9", obj.getvDescCond());
        assertEquals("10", obj.getvISSRet());
        assertEquals("11", obj.getcRegTrib());
    }

}
