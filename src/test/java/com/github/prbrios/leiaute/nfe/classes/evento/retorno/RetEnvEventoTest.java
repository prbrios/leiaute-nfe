package com.github.prbrios.leiaute.nfe.classes.evento.retorno;

import org.junit.Assert;
import org.junit.Test;
import org.simpleframework.xml.core.Persister;

public class RetEnvEventoTest {

    public static final String XML = "<retEnvEvento versao=\"0\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><idLote>1</idLote><tpAmb>2</tpAmb><verAplic>3</verAplic><cOrgao>4</cOrgao><cStat>5</cStat><xMotivo>6</xMotivo></retEnvEvento>";

    @Test
    public void test1() {
        RetEnvEvento obj = new RetEnvEvento();
        obj.setVersao("0");
        obj.setIdLote("1");
        obj.setTpAmb("2");
        obj.setVerAplic("3");
        obj.setcOrgao("4");
        obj.setcStat("5");
        obj.setxMotivo("6");

        Assert.assertEquals(XML, obj.toString());
    }

    @Test
    public void test2() throws Exception {
        Persister persister = new Persister();
        RetEnvEvento obj = persister.read(RetEnvEvento.class, XML);

        Assert.assertEquals("0", obj.getVersao());
        Assert.assertEquals("1", obj.getIdLote());
        Assert.assertEquals("2", obj.getTpAmb());
        Assert.assertEquals("3", obj.getVerAplic());
        Assert.assertEquals("4", obj.getcOrgao());
        Assert.assertEquals("5", obj.getcStat());
        Assert.assertEquals("6", obj.getxMotivo());
    }
}
