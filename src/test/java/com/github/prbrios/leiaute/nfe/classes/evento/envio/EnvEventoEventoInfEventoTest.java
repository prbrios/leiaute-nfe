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
package com.github.prbrios.leiaute.nfe.classes.evento.envio;

import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class EnvEventoEventoInfEventoTest {

    public static final String XML = "<infEvento Id=\"0\"><cOrgao>1</cOrgao><tpAmb>2</tpAmb><CNPJ>3</CNPJ><CPF>4</CPF><chNFe>5</chNFe><dhEvento>6</dhEvento><tpEvento>7</tpEvento><nSeqEvento>8</nSeqEvento><verEvento>9</verEvento></infEvento>";

	@Test
	public void test1() {
		EnvEventoEventoInfEvento obj = new EnvEventoEventoInfEvento();
        obj.setId("0");
        obj.setcOrgao("1");
        obj.setTpAmb("2");
        obj.setCNPJ("3");
        obj.setCPF("4");
        obj.setChNFe("5");
        obj.setDhEvento("6");
        obj.setTpEvento("7");
        obj.setnSeqEvento("8");
        obj.setVerEvento("9");

		Assert.assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		EnvEventoEventoInfEvento obj = persister.read(EnvEventoEventoInfEvento.class, XML);

		Assert.assertEquals("1", obj.getcOrgao());
        Assert.assertEquals("2", obj.getTpAmb());
        Assert.assertEquals("3", obj.getCNPJ());
        Assert.assertEquals("4", obj.getCPF());
        Assert.assertEquals("5", obj.getChNFe());
        Assert.assertEquals("6", obj.getDhEvento());
        Assert.assertEquals("7", obj.getTpEvento());
        Assert.assertEquals("8", obj.getnSeqEvento());
        Assert.assertEquals("9", obj.getVerEvento());
	}
    
    
}
