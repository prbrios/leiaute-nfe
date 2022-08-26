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



import io.github.prbrios.leiaute.nfe.classes.NFeInfNFeDetImpostoICMSICMS40;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoICMSICMS40Test {
    
    public static final String XML = "<ICMS40><orig>0</orig><CST>1</CST><vICMSDeson>2</vICMSDeson><motDesICMS>3</motDesICMS></ICMS40>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS40 obj = new NFeInfNFeDetImpostoICMSICMS40();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setvICMSDeson("2");
        obj.setMotDesICMS("3");

        assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS40 obj = persister.read(NFeInfNFeDetImpostoICMSICMS40.class, XML);
        
        assertEquals("0", obj.getOrig());
        assertEquals("1", obj.getCST());
        assertEquals("2", obj.getvICMSDeson());
        assertEquals("3", obj.getMotDesICMS());
        
    }
}
