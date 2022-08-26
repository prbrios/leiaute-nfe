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


import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoPISST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;


public class NFeInfNFeDetImpostoPISSTTest {

    public static final String XML = "<PISST><vBC>0</vBC><pPIS>1</pPIS><qBCProd>2</qBCProd><vAliqProd>3</vAliqProd><vPIS>4</vPIS><indSomaPISST>5</indSomaPISST></PISST>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoPISST obj = new NFeInfNFeDetImpostoPISST();
        obj.setvBC("0");
        obj.setpPIS("1");
        obj.setqBCProd("2");
        obj.setvAliqProd("3");
        obj.setvPIS("4");
        obj.setIndSomaPISST("5");

        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception {
        
        Persister persister = new Persister();
        NFeInfNFeDetImpostoPISST obj = persister.read(NFeInfNFeDetImpostoPISST.class, XML);
        
        assertEquals("0", obj.getvBC());
        assertEquals("1", obj.getpPIS());
        assertEquals("2", obj.getqBCProd());
        assertEquals("3", obj.getvAliqProd());
        assertEquals("4", obj.getvPIS());
        assertEquals("5", obj.getIndSomaPISST());
        
    }

}
