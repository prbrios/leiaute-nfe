package com.github.prbrios.leiaute.nfe.classes.evento.retorno;

import org.junit.Assert;
import org.junit.Test;
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

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        RetEnvEventoRetEventoInfEvento obj = persister.read(RetEnvEventoRetEventoInfEvento.class, XML);

        Assert.assertEquals("0", obj.getId());
        Assert.assertEquals("1", obj.getTpAmb());
        Assert.assertEquals("2", obj.getVerAplic());
        Assert.assertEquals("3", obj.getcOrgao());
        Assert.assertEquals("4", obj.getcStat());
        Assert.assertEquals("5", obj.getxMotivo());
        Assert.assertEquals("6", obj.getChNFe());
        Assert.assertEquals("7", obj.getTpEvento());
        Assert.assertEquals("8", obj.getxEvento());
        Assert.assertEquals("9", obj.getnSeqEvento());
        Assert.assertEquals("10", obj.getcOrgaoAutor());
        Assert.assertEquals("11", obj.getCNPJDest());
        Assert.assertEquals("12", obj.getCPFDest());
        Assert.assertEquals("13", obj.getEmailDest());
        Assert.assertEquals("14", obj.getDhRegEvento());
        Assert.assertEquals("15", obj.getnProt());
    }
}
