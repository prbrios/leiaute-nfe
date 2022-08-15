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
        
        Assert.assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeEmit obj = persister.read(NFeInfNFeEmit.class, XML);
        
        Assert.assertEquals("0", obj.getCNPJ());
        Assert.assertEquals("1", obj.getCPF());
        Assert.assertEquals("2", obj.getxNome());
        Assert.assertEquals("3", obj.getxFant());
        Assert.assertEquals("4", obj.getIE());
        Assert.assertEquals("5", obj.getIEST());
        Assert.assertEquals("6", obj.getIM());
        Assert.assertEquals("7", obj.getCNAE());
        Assert.assertEquals("8", obj.getCRT());
    }

}
