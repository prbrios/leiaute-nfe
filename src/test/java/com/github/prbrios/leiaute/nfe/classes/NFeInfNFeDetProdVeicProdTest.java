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

public class NFeInfNFeDetProdVeicProdTest {

    public static final String XML = "<veicProd><tpOp>0</tpOp><chassi>1</chassi><cCor>2</cCor><xCor>3</xCor><pot>4</pot><cilin>5</cilin><pesoL>6</pesoL><pesoB>7</pesoB><nSerie>8</nSerie><tpComb>9</tpComb><nMotor>10</nMotor><CMT>11</CMT><dist>12</dist><anoMod>13</anoMod><anoFab>14</anoFab><tpPint>15</tpPint><tpVeic>16</tpVeic><espVeic>17</espVeic><VIN>18</VIN><condVeic>19</condVeic><cMod>20</cMod><cCorDENATRAN>21</cCorDENATRAN><lota>22</lota><tpRest>23</tpRest></veicProd>";

    @Test
    public void test1() {
        NFeInfNFeDetProdVeicProd obj = new NFeInfNFeDetProdVeicProd();
        obj.setTpOp("0");
        obj.setChassi("1");
        obj.setcCor("2");
        obj.setxCor("3");
        obj.setPot("4");
        obj.setCilin("5");
        obj.setPesoL("6");
        obj.setPesoB("7");
        obj.setnSerie("8");
        obj.setTpComb("9");
        obj.setnMotor("10");
        obj.setCMT("11");
        obj.setDist("12");
        obj.setAnoMod("13");
        obj.setAnoFab("14");
        obj.setTpPint("15");
        obj.setTpVeic("16");
        obj.setEspVeic("17");
        obj.setVIN("18");
        obj.setCondVeic("19");
        obj.setcMod("20");
        obj.setcCorDENATRAN("21");
        obj.setLota("22");
        obj.setTpRest("23");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        NFeInfNFeDetProdVeicProd obj = persister.read(NFeInfNFeDetProdVeicProd.class, XML);

        assertEquals("0", obj.getTpOp());
        assertEquals("1", obj.getChassi());
        assertEquals("2", obj.getcCor());
        assertEquals("3", obj.getxCor());
        assertEquals("4", obj.getPot());
        assertEquals("5", obj.getCilin());
        assertEquals("6", obj.getPesoL());
        assertEquals("7", obj.getPesoB());
        assertEquals("8", obj.getnSerie());
        assertEquals("9", obj.getTpComb());
        assertEquals("10", obj.getnMotor());
        assertEquals("11", obj.getCMT());
        assertEquals("12", obj.getDist());
        assertEquals("13", obj.getAnoMod());
        assertEquals("14", obj.getAnoFab());
        assertEquals("15", obj.getTpPint());
        assertEquals("16", obj.getTpVeic());
        assertEquals("17", obj.getEspVeic());
        assertEquals("18", obj.getVIN());
        assertEquals("19", obj.getCondVeic());
        assertEquals("20", obj.getcMod());
        assertEquals("21", obj.getcCorDENATRAN());
        assertEquals("22", obj.getLota());
        assertEquals("23", obj.getTpRest());
    }

}
