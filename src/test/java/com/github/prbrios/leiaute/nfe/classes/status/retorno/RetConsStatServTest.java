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
package com.github.prbrios.leiaute.nfe.classes.status.retorno;

import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class RetConsStatServTest {
	
	public static final String XML = "<retConsStatServ versao=\"0\"><tpAmb>1</tpAmb><verAplic>2</verAplic><cStat>3</cStat><xMotivo>4</xMotivo><cUF>5</cUF><dhRecbto>6</dhRecbto><dhRetorno>7</dhRetorno><xObs>8</xObs><tMed>9</tMed></retConsStatServ>";

	@Test
	public void test1() {
		RetConsStatServ obj = new RetConsStatServ();
        obj.setVersao("0");
        obj.setTpAmb("1");
        obj.setVerAplic("2");
        obj.setcStat("3");
        obj.setxMotivo("4");
        obj.setcUF("5");
        obj.setDhRecbto("6");
        obj.setDhRetorno("7");
        obj.setxObs("8");
        obj.settMed("9");

		Assert.assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		RetConsStatServ obj = persister.read(RetConsStatServ.class, XML);

		Assert.assertEquals("0", obj.getVersao());
        Assert.assertEquals("1", obj.getTpAmb());
        Assert.assertEquals("2", obj.getVerAplic());
        Assert.assertEquals("3", obj.getcStat());
        Assert.assertEquals("4", obj.getxMotivo());
        Assert.assertEquals("5", obj.getcUF());
        Assert.assertEquals("6", obj.getDhRecbto());
        Assert.assertEquals("7", obj.getDhRetorno());
        Assert.assertEquals("8", obj.getxObs());
        Assert.assertEquals("9", obj.gettMed());
	}

}
