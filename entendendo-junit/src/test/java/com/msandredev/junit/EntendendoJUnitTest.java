package com.msandredev.junit;

import org.junit.*;

public class EntendendoJUnitTest {

    @BeforeClass
    public static void iniciarTestes() {
        System.out.println("iniciar testes...");
    }

    @AfterClass
    public static void encerrarTestes() {
        System.out.println("encerrar testes...");
    }

    @Before
    public void iniciarTest() {
        System.out.println("iniciar cada teste...");
    }

    @After
    public void encerrarTest() {
        System.out.println("encerrar cada teste...");
    }

    @Test
    public void testandoAlgoComAcersões() {
        String nome = String.format("%s", "André");

        Assert.assertEquals("André", nome);
    }

    @Test
    public void testandoOutraCoisaComAcersões() {
        String s = String.format("%s", "");

        Assert.assertTrue(s.isEmpty());
    }


    @Test
    public void testandoAlgo() {
        System.out.println("testando algo...");
    }

    @Test
    public void testandoOutraCoisa() {
        System.out.println("testando outra coisa...");
    }
}
