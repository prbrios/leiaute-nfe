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

public class NFeInfNFeDetImpostoISSQNTest {

    public static final String XML = "<ISSQN><vBC>0</vBC><vAliq>1</vAliq><vISSQN>2</vISSQN><cMunFG>3</cMunFG><cListServ>4</cListServ><vDeducao>5</vDeducao><vOutro>6</vOutro><vDescIncond>7</vDescIncond><vDescCond>8</vDescCond><vISSRet>9</vISSRet><indISS>10</indISS><cServico>11</cServico><cMun>12</cMun><cPais>13</cPais><nProcesso>14</nProcesso><indIncentivo>15</indIncentivo></ISSQN>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoISSQN obj = new NFeInfNFeDetImpostoISSQN();
        obj.setvBC("0");
        obj.setvAliq("1");
        obj.setvISSQN("2");
        obj.setcMunFG("3");
        obj.setcListServ("4");
        obj.setvDeducao("5");
        obj.setvOutro("6");
        obj.setvDescIncond("7");
        obj.setvDescCond("8");
        obj.setvISSRet("9");
        obj.setIndISS("10");
        obj.setcServico("11");
        obj.setcMun("12");
        obj.setcPais("13");
        obj.setnProcesso("14");
        obj.setIndIncentivo("15");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoISSQN obj = persister.read(NFeInfNFeDetImpostoISSQN.class, XML);

        assertEquals("0", obj.getvBC());
        assertEquals("1", obj.getvAliq());
        assertEquals("2", obj.getvISSQN());
        assertEquals("3", obj.getcMunFG());
        assertEquals("4", obj.getcListServ());
        assertEquals("5", obj.getvDeducao());
        assertEquals("6", obj.getvOutro());
        assertEquals("7", obj.getvDescIncond());
        assertEquals("8", obj.getvDescCond());
        assertEquals("9", obj.getvISSRet());
        assertEquals("10", obj.getIndISS());
        assertEquals("11", obj.getcServico());
        assertEquals("12", obj.getcMun());
        assertEquals("13", obj.getcPais());
        assertEquals("14", obj.getnProcesso());
        assertEquals("15", obj.getIndIncentivo());
    }
}
