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

public class NFeInfNFeEmitTest {

    public static final String XML = "<emit><CNPJ>0</CNPJ><CPF>1</CPF><xNome>2</xNome><xFant>3</xFant><IE>4</IE><IEST>5</IEST><IM>6</IM><CNAE>7</CNAE><CRT>8</CRT></emit>";
    
    @Test
    public void test1() {
        NFeInfNFeEmit obj = new NFeInfNFeEmit();
        obj.setCNPJ("0");
        obj.setCPF("1");
        obj.setxNome("2");
        obj.setxFant("3");
        obj.setIE("4");
        obj.setIEST("5");
        obj.setIM("6");
        obj.setCNAE("7");
        obj.setCRT("8");
        
        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeEmit obj = persister.read(NFeInfNFeEmit.class, XML);
        
        assertEquals("0", obj.getCNPJ());
        assertEquals("1", obj.getCPF());
        assertEquals("2", obj.getxNome());
        assertEquals("3", obj.getxFant());
        assertEquals("4", obj.getIE());
        assertEquals("5", obj.getIEST());
        assertEquals("6", obj.getIM());
        assertEquals("7", obj.getCNAE());
        assertEquals("8", obj.getCRT());
    }

}
