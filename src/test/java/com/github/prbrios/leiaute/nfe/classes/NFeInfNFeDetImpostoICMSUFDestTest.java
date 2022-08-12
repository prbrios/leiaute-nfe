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

public class NFeInfNFeDetImpostoICMSUFDestTest {

    public static final String XML = "<ICMSUFDest><vBCUFDest>0</vBCUFDest><vBCFCPUFDest>1</vBCFCPUFDest><pFCPUFDest>2</pFCPUFDest><pICMSUFDest>3</pICMSUFDest><pICMSInter>4</pICMSInter><pICMSInterPart>5</pICMSInterPart><vFCPUFDest>6</vFCPUFDest><vICMSUFDest>7</vICMSUFDest><vICMSUFRemet>8</vICMSUFRemet></ICMSUFDest>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSUFDest obj = new NFeInfNFeDetImpostoICMSUFDest();
        obj.setvBCUFDest("0");
        obj.setvBCFCPUFDest("1");
        obj.setpFCPUFDest("2");
        obj.setpICMSUFDest("3");
        obj.setpICMSInter("4");
        obj.setpICMSInterPart("5");
        obj.setvFCPUFDest("6");
        obj.setvICMSUFDest("7");
        obj.setvICMSUFRemet("8");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSUFDest obj = persister.read(NFeInfNFeDetImpostoICMSUFDest.class, XML);

        Assert.assertEquals("0", obj.getvBCUFDest());
        Assert.assertEquals("1", obj.getvBCFCPUFDest());
        Assert.assertEquals("2", obj.getpFCPUFDest());
        Assert.assertEquals("3", obj.getpICMSUFDest());
        Assert.assertEquals("4", obj.getpICMSInter());
        Assert.assertEquals("5", obj.getpICMSInterPart());
        Assert.assertEquals("6", obj.getvFCPUFDest());
        Assert.assertEquals("7", obj.getvICMSUFDest());
        Assert.assertEquals("8", obj.getvICMSUFRemet());
    }
}
