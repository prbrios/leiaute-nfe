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

import io.github.prbrios.leiaute.nfe.classes.retorno.RetEnviNFe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class RetEnviNFeTest {

    private static final String XML = "<retEnviNFe versao=\"0\"><tpAmb>1</tpAmb><verAplic>2</verAplic><cStat>3</cStat><xMotivo>4</xMotivo><cUF>5</cUF><dhRecbto>6</dhRecbto></retEnviNFe>";

    @Test
    public void test1() {
        RetEnviNFe obj = new RetEnviNFe();
        obj.setVersao("0");
        obj.setTpAmb("1");
        obj.setVerAplic("2");
        obj.setcStat("3");
        obj.setxMotivo("4");
        obj.setcUF("5");
        obj.setDhRecbto("6");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        RetEnviNFe obj = persister.read(RetEnviNFe.class, XML);

        assertEquals("0", obj.getVersao());
        assertEquals("1", obj.getTpAmb());
        assertEquals("2", obj.getVerAplic());
        assertEquals("3", obj.getcStat());
        assertEquals("4", obj.getxMotivo());
        assertEquals("5", obj.getcUF());
        assertEquals("6", obj.getDhRecbto());
    }
}
