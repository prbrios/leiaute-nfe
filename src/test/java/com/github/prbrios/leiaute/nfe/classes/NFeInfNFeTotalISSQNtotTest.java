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

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTotalISSQNtot obj = persister.read(NFeInfNFeTotalISSQNtot.class, XML);

        Assert.assertEquals("0", obj.getvServ());
        Assert.assertEquals("1", obj.getvBC());
        Assert.assertEquals("2", obj.getvISS());
        Assert.assertEquals("3", obj.getvPIS());
        Assert.assertEquals("4", obj.getvCOFINS());
        Assert.assertEquals("5", obj.getdCompet());
        Assert.assertEquals("6", obj.getvDeducao());
        Assert.assertEquals("7", obj.getvOutro());
        Assert.assertEquals("8", obj.getvDescIncond());
        Assert.assertEquals("9", obj.getvDescCond());
        Assert.assertEquals("10", obj.getvISSRet());
        Assert.assertEquals("11", obj.getcRegTrib());
    }

}
