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

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeDetProdTest {

    public static final String XML = "<prod><cProd>0</cProd><cEAN>1</cEAN><cBarra>2</cBarra><xProd>3</xProd><NCM>4</NCM><NVE>n1</NVE><NVE>n2</NVE><NVE>n3</NVE><CEST>5</CEST><indEscala>6</indEscala><CNPJFab>7</CNPJFab><cBenef>8</cBenef><EXTIPI>9</EXTIPI><CFOP>10</CFOP><uCom>11</uCom><qCom>12</qCom><vUnCom>13</vUnCom><vProd>14</vProd><cEANTrib>15</cEANTrib><cBarraTrib>16</cBarraTrib><uTrib>17</uTrib><qTrib>18</qTrib><vUnTrib>19</vUnTrib><vFrete>20</vFrete><vSeg>21</vSeg><vDesc>22</vDesc><vOutro>23</vOutro><indTot>24</indTot><xPed>25</xPed><nItemPed>26</nItemPed><nFCI>27</nFCI><nRECOPI>28</nRECOPI></prod>";

    @Test
    public void test1() {
        
        List<NFeInfNFeDetProdNVE> nve= new ArrayList<NFeInfNFeDetProdNVE>();
        nve.add(new NFeInfNFeDetProdNVE("n1"));
        nve.add(new NFeInfNFeDetProdNVE("n2"));
        nve.add(new NFeInfNFeDetProdNVE("n3"));
        
        NFeInfNFeDetProd obj = new NFeInfNFeDetProd();
        obj.setcProd("0");
        obj.setcEAN("1");
        obj.setcBarra("2");
        obj.setxProd("3");
        obj.setNCM("4");
        obj.setNVE(nve);
        obj.setCEST("5");
        obj.setIndEscala("6");
        obj.setCNPJFab("7");
        obj.setcBenef("8");
        obj.setEXTIPI("9");
        obj.setCFOP("10");
        obj.setuCom("11");
        obj.setqCom("12");
        obj.setvUnCom("13");
        obj.setvProd("14");
        obj.setcEANTrib("15");
        obj.setcBarraTrib("16");
        obj.setuTrib("17");
        obj.setqTrib("18");
        obj.setvUnTrib("19");
        obj.setvFrete("20");
        obj.setvSeg("21");
        obj.setvDesc("22");
        obj.setvOutro("23");
        obj.setIndTot("24");
        obj.setxPed("25");
        obj.setnItemPed("26");
        obj.setnFCI("27");
        obj.setnRECOPI("28");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetProd obj = persister.read(NFeInfNFeDetProd.class, XML);

        Assert.assertEquals("0", obj.getcProd());
        Assert.assertEquals("1", obj.getcEAN());
        Assert.assertEquals("2", obj.getcBarra());
        Assert.assertEquals("3", obj.getxProd());
        Assert.assertEquals("4", obj.getNCM());
        Assert.assertEquals(3, obj.getNVE().size());
        Assert.assertEquals("5", obj.getCEST());
        Assert.assertEquals("6", obj.getIndEscala());
        Assert.assertEquals("7", obj.getCNPJFab());
        Assert.assertEquals("8", obj.getcBenef());
        Assert.assertEquals("9", obj.getEXTIPI());
        Assert.assertEquals("10", obj.getCFOP());
        Assert.assertEquals("11", obj.getuCom());
        Assert.assertEquals("12", obj.getqCom());
        Assert.assertEquals("13", obj.getvUnCom());
        Assert.assertEquals("14", obj.getvProd());
        Assert.assertEquals("15", obj.getcEANTrib());
        Assert.assertEquals("16", obj.getcBarraTrib());
        Assert.assertEquals("17", obj.getuTrib());
        Assert.assertEquals("18", obj.getqTrib());
        Assert.assertEquals("19", obj.getvUnTrib());
        Assert.assertEquals("20", obj.getvFrete());
        Assert.assertEquals("21", obj.getvSeg());
        Assert.assertEquals("22", obj.getvDesc());
        Assert.assertEquals("23", obj.getvOutro());
        Assert.assertEquals("24", obj.getIndTot());
        Assert.assertEquals("25", obj.getxPed());
        Assert.assertEquals("26", obj.getnItemPed());
        Assert.assertEquals("27", obj.getnFCI());
        Assert.assertEquals("28", obj.getnRECOPI());
    }
}
