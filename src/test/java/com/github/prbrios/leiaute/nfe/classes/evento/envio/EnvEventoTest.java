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

public class EnvEventoTest {

    public static final String XML = "<envEvento versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><idLote>1</idLote></envEvento>";
    
	@Test
	public void test1() {
		EnvEvento obj = new EnvEvento();
        obj.setVersao("0");
        obj.setIdLote("1");
        
		Assert.assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		EnvEvento obj = persister.read(EnvEvento.class, XML);

		Assert.assertEquals("0", obj.getVersao());
        Assert.assertEquals("1", obj.getIdLote());
	}

}
