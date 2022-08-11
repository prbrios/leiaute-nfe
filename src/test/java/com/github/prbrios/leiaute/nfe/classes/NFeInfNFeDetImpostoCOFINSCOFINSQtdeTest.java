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

public class NFeInfNFeDetImpostoCOFINSCOFINSQtdeTest {
    
    public static final String XML = "<COFINSQtde><CST>01</CST><qBCProd>1</qBCProd><vAliqProd>7.00</vAliqProd><vCOFINS>3.00</vCOFINS></COFINSQtde>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoCOFINSCOFINSQtde obj = new NFeInfNFeDetImpostoCOFINSCOFINSQtde();
        obj.setCST("01");
        obj.setqBCProd("1");
        obj.setvAliqProd("7.00");
        obj.setvCOFINS("3.00");
        
        Assert.assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        Persister persister = new Persister();
        NFeInfNFeDetImpostoCOFINSCOFINSQtde obj = persister.read(NFeInfNFeDetImpostoCOFINSCOFINSQtde.class, XML);
        
        Assert.assertEquals("01", obj.getCST());
        Assert.assertEquals("1", obj.getqBCProd());
        Assert.assertEquals("7.00", obj.getvAliqProd());
        Assert.assertEquals("3.00", obj.getvCOFINS());
    }
}
