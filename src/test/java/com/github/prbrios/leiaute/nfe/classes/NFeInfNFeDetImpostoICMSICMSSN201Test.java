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

public class NFeInfNFeDetImpostoICMSICMSSN201Test {

    public static final String XML = "<ICMSSN201><orig>0</orig><CSOSN>1</CSOSN><modBCST>2</modBCST><pMVAST>3</pMVAST><pRedBCST>4</pRedBCST><vBCST>5</vBCST><pICMSST>6</pICMSST><vICMSST>7</vICMSST><vBCFCPST>8</vBCFCPST><pFCPST>9</pFCPST><vFCPST>10</vFCPST><pCredSN>11</pCredSN><vCredICMSSN>12</vCredICMSSN></ICMSSN201>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMSSN201 obj = new NFeInfNFeDetImpostoICMSICMSSN201();
        obj.setOrig("0");
        obj.setCSOSN("1");
        obj.setModBCST("2");
        obj.setpMVAST("3");
        obj.setpRedBCST("4");
        obj.setvBCST("5");
        obj.setpICMSST("6");
        obj.setvICMSST("7");
        obj.setvBCFCPST("8");
        obj.setpFCPST("9");
        obj.setvFCPST("10");
        obj.setpCredSN("11");
        obj.setvCredICMSSN("12");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMSSN201 obj = persister.read(NFeInfNFeDetImpostoICMSICMSSN201.class, XML);

        Assert.assertEquals("0", obj.getOrig());
        Assert.assertEquals("1", obj.getCSOSN());
        Assert.assertEquals("2", obj.getModBCST());
        Assert.assertEquals("3", obj.getpMVAST());
        Assert.assertEquals("4", obj.getpRedBCST());
        Assert.assertEquals("5", obj.getvBCST());
        Assert.assertEquals("6", obj.getpICMSST());
        Assert.assertEquals("7", obj.getvICMSST());
        Assert.assertEquals("8", obj.getvBCFCPST());
        Assert.assertEquals("9", obj.getpFCPST());
        Assert.assertEquals("10", obj.getvFCPST());
        Assert.assertEquals("11", obj.getpCredSN());
        Assert.assertEquals("12", obj.getvCredICMSSN());

    }
}
