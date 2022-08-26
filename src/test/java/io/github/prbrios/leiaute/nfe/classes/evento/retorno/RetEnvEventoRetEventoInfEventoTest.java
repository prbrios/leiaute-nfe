package io.github.prbrios.leiaute.nfe.classes.evento.retorno;

import io.github.prbrios.leiaute.nfe.classes.evento.retorno.RetEnvEventoRetEventoInfEvento;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

public class RetEnvEventoRetEventoInfEventoTest {

    public static final String XML = "<infEvento Id=\"0\"><tpAmb>1</tpAmb><verAplic>2</verAplic><cOrgao>3</cOrgao><cStat>4</cStat><xMotivo>5</xMotivo><chNFe>6</chNFe><tpEvento>7</tpEvento><xEvento>8</xEvento><nSeqEvento>9</nSeqEvento><cOrgaoAutor>10</cOrgaoAutor><CNPJDest>11</CNPJDest><CPFDest>12</CPFDest><emailDest>13</emailDest><dhRegEvento>14</dhRegEvento><nProt>15</nProt></infEvento>";

    @Test
    public void test1() {
        RetEnvEventoRetEventoInfEvento obj = new RetEnvEventoRetEventoInfEvento();
        obj.setId("0");
        obj.setTpAmb("1");
        obj.setVerAplic("2");
        obj.setcOrgao("3");
        obj.setcStat("4");
        obj.setxMotivo("5");
        obj.setChNFe("6");
        obj.setTpEvento("7");
        obj.setxEvento("8");
        obj.setnSeqEvento("9");
        obj.setcOrgaoAutor("10");
        obj.setCNPJDest("11");
        obj.setCPFDest("12");
        obj.setEmailDest("13");
        obj.setDhRegEvento("14");
        obj.setnProt("15");

        assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        RetEnvEventoRetEventoInfEvento obj = persister.read(RetEnvEventoRetEventoInfEvento.class, XML);

        assertEquals("0", obj.getId());
        assertEquals("1", obj.getTpAmb());
        assertEquals("2", obj.getVerAplic());
        assertEquals("3", obj.getcOrgao());
        assertEquals("4", obj.getcStat());
        assertEquals("5", obj.getxMotivo());
        assertEquals("6", obj.getChNFe());
        assertEquals("7", obj.getTpEvento());
        assertEquals("8", obj.getxEvento());
        assertEquals("9", obj.getnSeqEvento());
        assertEquals("10", obj.getcOrgaoAutor());
        assertEquals("11", obj.getCNPJDest());
        assertEquals("12", obj.getCPFDest());
        assertEquals("13", obj.getEmailDest());
        assertEquals("14", obj.getDhRegEvento());
        assertEquals("15", obj.getnProt());
    }
}
