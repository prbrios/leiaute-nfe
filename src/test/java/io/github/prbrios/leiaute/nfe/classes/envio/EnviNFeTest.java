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
package io.github.prbrios.leiaute.nfe.classes.envio;

import io.github.prbrios.leiaute.nfe.classes.envio.EnviNFe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class EnviNFeTest {

    public static final String XML = "<enviNFe versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><idLote>1</idLote><indSinc>2</indSinc></enviNFe>";

    @Test
    public void test1() {
        EnviNFe obj = new EnviNFe();
        obj.setVersao("0");
        obj.setIdLote("1");
        obj.setIndSinc("2");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        EnviNFe obj = persister.read(EnviNFe.class, XML);

        assertEquals("0", obj.getVersao());
        assertEquals("1", obj.getIdLote());
        assertEquals("2", obj.getIndSinc());
    }

}
