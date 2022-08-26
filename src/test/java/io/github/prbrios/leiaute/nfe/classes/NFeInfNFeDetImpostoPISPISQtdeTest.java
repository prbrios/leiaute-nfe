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



import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoPISPISQtde;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoPISPISQtdeTest {
    
    public static final String XML = "<PISQtde><CST>01</CST><qBCProd>1</qBCProd><vAliqProd>7.00</vAliqProd><vPIS>3.00</vPIS></PISQtde>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoPISPISQtde obj = new NFeInfNFeDetImpostoPISPISQtde();
        obj.setCST("01");
        obj.setqBCProd("1");
        obj.setvAliqProd("7.00");
        obj.setvPIS("3.00");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoPISPISQtde obj = persister.read(NFeInfNFeDetImpostoPISPISQtde.class, XML);
        
        assertEquals("01", obj.getCST());
        assertEquals("1", obj.getqBCProd());
        assertEquals("7.00", obj.getvAliqProd());
        assertEquals("3.00", obj.getvPIS());
    }
}
