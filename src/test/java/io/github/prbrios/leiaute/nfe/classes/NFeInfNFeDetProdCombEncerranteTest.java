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
package io.github.prbrios.leiaute.nfe.classes;


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetProdCombEncerrante;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetProdCombEncerranteTest {

    public static final String XML = "<encerrante><nBico>0</nBico><nBomba>1</nBomba><nTanque>2</nTanque><vEncIni>3</vEncIni><vEncFin>4</vEncFin></encerrante>";

    @Test
    public void test1() {

        NFeInfNFeDetProdCombEncerrante obj = new NFeInfNFeDetProdCombEncerrante();
        obj.setnBico("0");
        obj.setnBomba("1");
        obj.setnTanque("2");
        obj.setvEncIni("3");
        obj.setvEncFin("4");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetProdCombEncerrante obj = persister.read(NFeInfNFeDetProdCombEncerrante.class, XML);

        assertEquals("0", obj.getnBico());
        assertEquals("1", obj.getnBomba());
        assertEquals("2", obj.getnTanque());
        assertEquals("3", obj.getvEncIni());
        assertEquals("4", obj.getvEncFin());
    }
}
