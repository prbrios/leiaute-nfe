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
package io.github.prbrios.leiaute.nfe.classes.evento.envio;

import io.github.prbrios.leiaute.nfe.classes.evento.envio.EnvEventoEventoInfEventoDetEvento;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class EnvEventoEventoInfEventoDetEventoTest {

    public static final String XML = "<detEvento versao=\"0\"><descEvento>1</descEvento><cOrgaoAutor>2</cOrgaoAutor><tpAutor>3</tpAutor><verAplic>4</verAplic><tpAutorizacao>5</tpAutorizacao><nProt>6</nProt><xJust>7</xJust><xCorrecao>8</xCorrecao><xCondUso>9</xCondUso></detEvento>";

    @Test
    public void test1() {
        EnvEventoEventoInfEventoDetEvento obj = new EnvEventoEventoInfEventoDetEvento();
        obj.setVersao("0");
        obj.setDescEvento("1");
        obj.setcOrgaoAutor("2");
        obj.setTpAutor("3");
        obj.setVerAplic("4");
        obj.setTpAutorizacao("5");
        obj.setnProt("6");
        obj.setxJust("7");
        obj.setxCorrecao("8");
        obj.setxCondUso("9");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        EnvEventoEventoInfEventoDetEvento obj = persister.read(EnvEventoEventoInfEventoDetEvento.class, XML);

        assertEquals("0", obj.getVersao());
        assertEquals("1", obj.getDescEvento());
        assertEquals("2", obj.getcOrgaoAutor());
        assertEquals("3", obj.getTpAutor());
        assertEquals("4", obj.getVerAplic());
        assertEquals("5", obj.getTpAutorizacao());
        assertEquals("6", obj.getnProt());
        assertEquals("7", obj.getxJust());
        assertEquals("8", obj.getxCorrecao());
        assertEquals("9", obj.getxCondUso());
    }

}
