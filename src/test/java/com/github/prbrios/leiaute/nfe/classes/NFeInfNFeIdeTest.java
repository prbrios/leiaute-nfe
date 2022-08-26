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


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class NFeInfNFeIdeTest {

    public static final String XML = "<ide><cUF>0</cUF><cNF>1</cNF><natOp>2</natOp><mod>3</mod><serie>4</serie><nNF>5</nNF><dhEmi>6</dhEmi><dhSaiEnt>7</dhSaiEnt><tpNF>8</tpNF><idDest>9</idDest><cMunFG>10</cMunFG><tpImp>11</tpImp><tpEmis>12</tpEmis><cDV>13</cDV><tpAmb>14</tpAmb><finNFe>15</finNFe><indFinal>16</indFinal><indPres>17</indPres><indIntermed>18</indIntermed><procEmi>19</procEmi><verProc>20</verProc><dhCont>21</dhCont><xJust>22</xJust></ide>";

    @Test
    public void test1() {
        NFeInfNFeIde obj = new NFeInfNFeIde();
        obj.setcUF("0");
        obj.setcNF("1");
        obj.setNatOp("2");
        obj.setMod("3");
        obj.setSerie("4");
        obj.setnNF("5");
        obj.setDhEmi("6");
        obj.setDhSaiEnt("7");
        obj.setTpNF("8");
        obj.setIdDest("9");
        obj.setcMunFG("10");
        obj.setTpImp("11");
        obj.setTpEmis("12");
        obj.setcDV("13");
        obj.setTpAmb("14");
        obj.setFinNFe("15");
        obj.setIndFinal("16");
        obj.setIndPres("17");
        obj.setIndIntermed("18");
        obj.setProcEmi("19");
        obj.setVerProc("20");
        obj.setDhCont("21");
        obj.setxJust("22");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeIde obj = persister.read(NFeInfNFeIde.class, XML);

        assertEquals("0", obj.getcUF());
        assertEquals("1", obj.getcNF());
        assertEquals("2", obj.getNatOp());
        assertEquals("3", obj.getMod());
        assertEquals("4", obj.getSerie());
        assertEquals("5", obj.getnNF());
        assertEquals("6", obj.getDhEmi());
        assertEquals("7", obj.getDhSaiEnt());
        assertEquals("8", obj.getTpNF());
        assertEquals("9", obj.getIdDest());
        assertEquals("10", obj.getcMunFG());
        assertEquals("11", obj.getTpImp());
        assertEquals("12", obj.getTpEmis());
        assertEquals("13", obj.getcDV());
        assertEquals("14", obj.getTpAmb());
        assertEquals("15", obj.getFinNFe());
        assertEquals("16", obj.getIndFinal());
        assertEquals("17", obj.getIndPres());
        assertEquals("18", obj.getIndIntermed());
        assertEquals("19", obj.getProcEmi());
        assertEquals("20", obj.getVerProc());
        assertEquals("21", obj.getDhCont());
        assertEquals("22", obj.getxJust());
    }

}
