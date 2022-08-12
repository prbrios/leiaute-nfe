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

import org.junit.Assert;
import org.junit.Test;
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

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoISSQN obj = persister.read(NFeInfNFeDetImpostoISSQN.class, XML);

        Assert.assertEquals("0", obj.getvBC());
        Assert.assertEquals("1", obj.getvAliq());
        Assert.assertEquals("2", obj.getvISSQN());
        Assert.assertEquals("3", obj.getcMunFG());
        Assert.assertEquals("4", obj.getcListServ());
        Assert.assertEquals("5", obj.getvDeducao());
        Assert.assertEquals("6", obj.getvOutro());
        Assert.assertEquals("7", obj.getvDescIncond());
        Assert.assertEquals("8", obj.getvDescCond());
        Assert.assertEquals("9", obj.getvISSRet());
        Assert.assertEquals("10", obj.getIndISS());
        Assert.assertEquals("11", obj.getcServico());
        Assert.assertEquals("12", obj.getcMun());
        Assert.assertEquals("13", obj.getcPais());
        Assert.assertEquals("14", obj.getnProcesso());
        Assert.assertEquals("15", obj.getIndIncentivo());
    }
}
