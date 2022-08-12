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

public class NFeInfNFeDetImpostoICMSICMS70Test {

    public static final String XML = "<ICMS70><orig>0</orig><CST>1</CST><modBC>2</modBC><pRedBC>3</pRedBC><vBC>4</vBC><pICMS>5</pICMS><vICMS>6</vICMS><vBCFCP>7</vBCFCP><pFCP>8</pFCP><vFCP>9</vFCP><modBCST>10</modBCST><pMVAST>11</pMVAST><pRedBCST>12</pRedBCST><vBCST>13</vBCST><pICMSST>14</pICMSST><vICMSST>15</vICMSST><vBCFCPST>16</vBCFCPST><pFCPST>17</pFCPST><vFCPST>18</vFCPST><vICMSDeson>19</vICMSDeson><motDesICMS>20</motDesICMS><vICMSSTDeson>21</vICMSSTDeson><motDesICMSST>22</motDesICMSST></ICMS70>";

    @Test
    public void test1() {
        NFeInfNFeDetImpostoICMSICMS70 obj = new NFeInfNFeDetImpostoICMSICMS70();
        obj.setOrig("0");
        obj.setCST("1");
        obj.setModBC("2");
        obj.setpRedBC("3");
        obj.setvBC("4");
        obj.setpICMS("5");
        obj.setvICMS("6");
        obj.setvBCFCP("7");
        obj.setpFCP("8");
        obj.setvFCP("9");
        obj.setModBCST("10");
        obj.setpMVAST("11");
        obj.setpRedBCST("12");
        obj.setvBCST("13");
        obj.setpICMSST("14");
        obj.setvICMSST("15");
        obj.setvBCFCPST("16");
        obj.setpFCPST("17");
        obj.setvFCPST("18");
        obj.setvICMSDeson("19");
        obj.setMotDesICMS("20");
        obj.setvICMSSTDeson("21");
        obj.setMotDesICMSST("22");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetImpostoICMSICMS70 obj = persister.read(NFeInfNFeDetImpostoICMSICMS70.class, XML);

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
        Assert.assertEquals("10", obj.getModBCST());
        Assert.assertEquals("11", obj.getpMVAST());
        Assert.assertEquals("12", obj.getpRedBCST());
        Assert.assertEquals("13", obj.getvBCST());
        Assert.assertEquals("14", obj.getpICMSST());
        Assert.assertEquals("15", obj.getvICMSST());
        Assert.assertEquals("16", obj.getvBCFCPST());
        Assert.assertEquals("17", obj.getpFCPST());
        Assert.assertEquals("18", obj.getvFCPST());
        Assert.assertEquals("19", obj.getvICMSDeson());
        Assert.assertEquals("20", obj.getMotDesICMS());
        Assert.assertEquals("21", obj.getvICMSSTDeson());
        Assert.assertEquals("22", obj.getMotDesICMSST());

    }
}
