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
package com.github.prbrios.leiaute.nfe.classes;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetProdDetExportExportIndTest {

    public static final String XML = "<exportInd><nRE>0</nRE><chNFe>1</chNFe><qExport>2</qExport></exportInd>";

    @Test
    public void test1() {
        NFeInfNFeDetProdDetExportExportInd obj = new NFeInfNFeDetProdDetExportExportInd();
        obj.setnRE("0");
        obj.setChNFe("1");
        obj.setqExport("2");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {

        Persister persister = new Persister();
        NFeInfNFeDetProdDetExportExportInd obj = persister.read(NFeInfNFeDetProdDetExportExportInd.class, XML);

        assertEquals("0", obj.getnRE());
        assertEquals("1", obj.getChNFe());
        assertEquals("2", obj.getqExport());

    }

}
