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
package io.github.prbrios.leiaute.nfe.classes.retorno;

import io.github.prbrios.leiaute.nfe.classes.retorno.RetConsReciNFe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
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

		assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		RetConsReciNFe obj = persister.read(RetConsReciNFe.class, XML);

		assertEquals("0", obj.getVersao());
        assertEquals("1", obj.getTpAmb());
        assertEquals("2", obj.getVerAplic());
        assertEquals("3", obj.getnRec());
        assertEquals("4", obj.getcStat());
        assertEquals("5", obj.getxMotivo());
        assertEquals("6", obj.getcUF());
        assertEquals("7", obj.getDhRecbto());
        assertEquals("8", obj.getcMsg());
        assertEquals("9", obj.getxMsg());
	}
	
}
