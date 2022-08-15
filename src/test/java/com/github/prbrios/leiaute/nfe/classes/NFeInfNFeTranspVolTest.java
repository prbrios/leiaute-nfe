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

public class NFeInfNFeTranspVolTest {

    public static final String XML = "<vol><qVol>0</qVol><esp>1</esp><marca>2</marca><nVol>3</nVol><pesoL>4</pesoL><pesoB>5</pesoB></vol>";
    
    @Test
    public void test1() {
        NFeInfNFeTranspVol obj = new NFeInfNFeTranspVol();
        obj.setqVol("0");
        obj.setEsp("1");
        obj.setMarca("2");
        obj.setnVol("3");
        obj.setPesoL("4");
        obj.setPesoB("5");

        Assert.assertEquals(XML, obj.toString());
    }
    
    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeTranspVol obj = persister.read(NFeInfNFeTranspVol.class, XML);
        
        Assert.assertEquals("0", obj.getqVol());
        Assert.assertEquals("1", obj.getEsp());
        Assert.assertEquals("2", obj.getMarca());
        Assert.assertEquals("3", obj.getnVol());
        Assert.assertEquals("4", obj.getPesoL());
        Assert.assertEquals("5", obj.getPesoB());
    }

}
