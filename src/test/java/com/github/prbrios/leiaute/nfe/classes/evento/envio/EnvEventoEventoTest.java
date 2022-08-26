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

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class EnvEventoEventoTest {

    public static final String XML = "<evento versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"/>";
    
	@Test
	public void test1() {
		EnvEventoEvento obj = new EnvEventoEvento();
        obj.setVersao("0");
		assertEquals(XML, obj.toString());
	}

	@Test
	public void test2() throws Exception {
		Persister persister = new Persister();
		EnvEventoEvento obj = persister.read(EnvEventoEvento.class, XML);

		assertEquals("0", obj.getVersao());
	}

}
