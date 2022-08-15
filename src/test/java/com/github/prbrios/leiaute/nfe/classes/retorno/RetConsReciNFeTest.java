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

public class RetConsReciNFeTest {

    public static final String XML = "<retConsReciNFe versao=\"0\"><tpAmb>1</tpAmb><verAplic>2</verAplic><nRec>3</nRec><cStat>4</cStat><xMotivo>5</xMotivo><cUF>6</cUF><dhRecbto>7</dhRecbto><cMsg>8</cMsg><xMsg>9</xMsg></retConsReciNFe>";
    
	@Test
	public void test1() {
		RetConsReciNFe obj = new RetConsReciNFe();
        obj.setVersao("0");
        obj.setTpAmb("1");
        obj.setVerAplic("2");
        obj.setnRec("3");
        obj.setcStat("4");
        obj.setxMotivo("5");
        obj.setcUF("6");
        obj.setDhRecbto("7");
        obj.setcMsg("8");
        obj.setxMsg("9");

		Assert.assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		RetConsReciNFe obj = persister.read(RetConsReciNFe.class, XML);

		Assert.assertEquals("0", obj.getVersao());
        Assert.assertEquals("1", obj.getTpAmb());
        Assert.assertEquals("2", obj.getVerAplic());
        Assert.assertEquals("3", obj.getnRec());
        Assert.assertEquals("4", obj.getcStat());
        Assert.assertEquals("5", obj.getxMotivo());
        Assert.assertEquals("6", obj.getcUF());
        Assert.assertEquals("7", obj.getDhRecbto());
        Assert.assertEquals("8", obj.getcMsg());
        Assert.assertEquals("9", obj.getxMsg());
	}
	
}
