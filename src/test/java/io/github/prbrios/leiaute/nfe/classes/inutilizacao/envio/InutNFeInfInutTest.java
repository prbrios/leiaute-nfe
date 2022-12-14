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
package io.github.prbrios.leiaute.nfe.classes.inutilizacao.envio;

import io.github.prbrios.leiaute.nfe.classes.inutilizacao.envio.InutNFeInfInut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class InutNFeInfInutTest {

    public static final String XML = "<infInut Id=\"0\"><tpAmb>1</tpAmb><xServ>2</xServ><cUF>3</cUF><ano>4</ano><CNPJ>5</CNPJ><mod>6</mod><serie>7</serie><nNFIni>8</nNFIni><nNFFin>9</nNFFin><xJust>10</xJust></infInut>";
    
	@Test
	public void test1() {
		InutNFeInfInut obj = new InutNFeInfInut();
        obj.setId("0");
        obj.setTpAmb("1");
        obj.setxServ("2");
        obj.setcUF("3");
        obj.setAno("4");
        obj.setCNPJ("5");
        obj.setMod("6");
        obj.setSerie("7");
        obj.setnNFIni("8");
        obj.setnNFFin("9");
        obj.setxJust("10");

		assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		InutNFeInfInut obj = persister.read(InutNFeInfInut.class, XML);

        assertEquals("0", obj.getId());
        assertEquals("1", obj.getTpAmb());
        assertEquals("2", obj.getxServ());
        assertEquals("3", obj.getcUF());
        assertEquals("4", obj.getAno());
        assertEquals("5", obj.getCNPJ());
        assertEquals("6", obj.getMod());
        assertEquals("7", obj.getSerie());
        assertEquals("8", obj.getnNFIni());
        assertEquals("9", obj.getnNFFin());
        assertEquals("10", obj.getxJust());
	}

}
