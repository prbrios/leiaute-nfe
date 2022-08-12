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


import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetImpostoPISPISAliqTest {
    
    public static final String XML = "<PISAliq><CST>01</CST><vBC>100.00</vBC><pPIS>3.00</pPIS><vPIS>3.00</vPIS></PISAliq>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoPISPISAliq obj = new NFeInfNFeDetImpostoPISPISAliq();
        obj.setCST("01");
        obj.setpPIS("3.00");
        obj.setvBC("100.00");
        obj.setvPIS("3.00");
        
        Assert.assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoPISPISAliq obj = persister.read(NFeInfNFeDetImpostoPISPISAliq.class, XML);
        
        Assert.assertEquals("01", obj.getCST());
        Assert.assertEquals("3.00", obj.getpPIS());
        Assert.assertEquals("100.00", obj.getvBC());
        Assert.assertEquals("3.00", obj.getvPIS());
    }
}
