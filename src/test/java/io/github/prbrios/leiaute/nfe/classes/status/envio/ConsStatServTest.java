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
package io.github.prbrios.leiaute.nfe.classes.status.envio;


import io.github.prbrios.leiaute.nfe.classes.status.envio.ConsStatServ;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class ConsStatServTest {

    public static final String XML = "<consStatServ versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>1</tpAmb><cUF>2</cUF><xServ>3</xServ></consStatServ>";

    @Test
    public void test1() {
        ConsStatServ obj = new ConsStatServ();
        obj.setVersao("0");
        obj.setTpAmb("1");
        obj.setcUF("2");
        obj.setxServ("3");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        ConsStatServ obj = persister.read(ConsStatServ.class, XML);

        assertEquals("0", obj.getVersao());
        assertEquals("1", obj.getTpAmb());
        assertEquals("2", obj.getcUF());
        assertEquals("3", obj.getxServ());
    }

}
