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

public class NFeInfNFeDetImpostoICMSICMS20Test {
    
    public static final String XML = "<ICMS20><orig>0</orig><CST>1</CST><modBC>2</modBC><pRedBC>3</pRedBC><vBC>4</vBC><pICMS>5</pICMS><vICMS>6</vICMS><vBCFCP>7</vBCFCP><pFCP>8</pFCP><vFCP>9</vFCP><vICMSDeson>10</vICMSDeson><motDesICMS>11</motDesICMS></ICMS20>";
    
    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS20 obj = new NFeInfNFeDetImpostoICMSICMS20();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setModBC("2");
        obj.setvBC("4");
        obj.setpICMS("5");
        obj.setvICMS("6");
        obj.setvBCFCP("7");
        obj.setpFCP("8");
        obj.setvFCP("9");
        obj.setMotDesICMS("11");
        obj.setpRedBC("3");
        obj.setvICMSDeson("10");
        
        Assert.assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception{
        
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS20 obj = persister.read(NFeInfNFeDetImpostoICMSICMS20.class, XML);
        
        Assert.assertEquals("0", obj.getOrig());
        Assert.assertEquals("1", obj.getCST());
        Assert.assertEquals("2", obj.getModBC());
        Assert.assertEquals("3", obj.getpRedBC());
        Assert.assertEquals("4", obj.getvBC());
        Assert.assertEquals("5", obj.getpICMS());
        Assert.assertEquals("6", obj.getvICMS());
        Assert.assertEquals("7", obj.getvBCFCP());
        Assert.assertEquals("8", obj.getpFCP());
        Assert.assertEquals("9", obj.getvFCP());
        Assert.assertEquals("10", obj.getvICMSDeson());
        Assert.assertEquals("11", obj.getMotDesICMS());
    }
}
