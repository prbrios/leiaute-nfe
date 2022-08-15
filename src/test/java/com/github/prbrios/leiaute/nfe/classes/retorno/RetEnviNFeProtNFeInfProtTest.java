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
package com.github.prbrios.leiaute.nfe.classes.retorno;

import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class RetEnviNFeProtNFeInfProtTest {

    public static final String XML = "<infProt Id=\"0\"><tpAmb>1</tpAmb><verAplic>2</verAplic><chNFe>3</chNFe><dhRecbto>4</dhRecbto><nProt>5</nProt><digVal>6</digVal><cStat>7</cStat><xMotivo>8</xMotivo><cMsg>9</cMsg><xMsg>10</xMsg></infProt>";

    @Test
    public void test1() {
        RetEnviNFeProtNFeInfProt obj = new RetEnviNFeProtNFeInfProt();
        obj.setId("0");
        obj.setTpAmb("1");
        obj.setVerAplic("2");
        obj.setChNFe("3");
        obj.setDhRecbto("4");
        obj.setnProt("5");
        obj.setDigVal("6");
        obj.setcStat("7");
        obj.setxMotivo("8");
        obj.setcMsg("9");
        obj.setxMsg("10");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        RetEnviNFeProtNFeInfProt obj = persister.read(RetEnviNFeProtNFeInfProt.class, XML);

        Assert.assertEquals("0", obj.getId());
        Assert.assertEquals("1", obj.getTpAmb());
        Assert.assertEquals("2", obj.getVerAplic());
        Assert.assertEquals("3", obj.getChNFe());
        Assert.assertEquals("4", obj.getDhRecbto());
        Assert.assertEquals("5", obj.getnProt());
        Assert.assertEquals("6", obj.getDigVal());
        Assert.assertEquals("7", obj.getcStat());
        Assert.assertEquals("8", obj.getxMotivo());
        Assert.assertEquals("9", obj.getcMsg());
        Assert.assertEquals("10", obj.getxMsg());
    }
}
