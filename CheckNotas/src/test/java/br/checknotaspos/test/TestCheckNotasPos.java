package br.checknotaspos.test;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCheckNotasPos {
	private static WebDriver driver;
	static private String baseUrl;

	@BeforeClass
	public static void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		baseUrl = "https://sicanet.uninorte.com.br";
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(baseUrl + "/");
		WebDriverWait wait1 = new WebDriverWait(driver, 120);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By
				.id("edtLogin"))));
		driver.findElement(By.id("edtLogin")).clear();
		driver.findElement(By.id("edtLogin")).sendKeys(
				Propriedades.getProp("Usuario"));
		driver.findElement(By.id("edtSenha")).clear();
		driver.findElement(By.id("edtSenha")).sendKeys(
				Propriedades.getProp("Senha"));
		driver.findElement(By.id("btSubmit")).click();
		driver.get("https://sicanet.uninorte.com.br/sicanet.index.php?sicanet=secretaria/demonstrativoNotas/sicanet.secretaria.demonstrativosNotas");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By
				.xpath("html/body/table[6]/tbody/tr[2]/td[1]"))));

	}

	@Test
	public void NotaArquitetura() {
		assertEquals(
				"ARQUITETURA ORIENTADA A SERVIÇOS- SOA & WEBSERVIÇES".trim(),
				driver.findElement(
						By.xpath("html/body/table[6]/tbody/tr[2]/td[1]"))
						.getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[2]/td[2]"))
				.getText().trim());
	}

	@Test
	public void NotaBancoDeDados() {
		assertEquals("BANCO DE DADOS PARA SISTEMAS WEB".trim(), driver
				.findElement(By.xpath("//tr[3]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[3]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotaComputacaoNuvens() {
		assertEquals("COMPUTAÇÃO EM NUVENS".trim(),
				driver.findElement(By.xpath("//tr[4]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[4]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotaEngenhariaRequisitos() {
		assertEquals("ENGENHARIA DE REQUISITOS".trim(),
				driver.findElement(By.xpath("//tr[5]/td")).getText().trim());
		assertEquals("9", driver.findElement(By.xpath("//tr[5]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotaFundamentosEngenharia() {
		assertEquals("FUNDAMENTOS DA ENGENHARIA DE SOFTWARE".trim(), driver
				.findElement(By.xpath("//tr[6]/td")).getText().trim());
		assertEquals("9,3", driver.findElement(By.xpath("//tr[6]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasGestaoQualidade() {
		assertEquals("GESTÃO DA QUALIDADE DO SOFTWARE".trim(), driver
				.findElement(By.xpath("//tr[7]/td")).getText().trim());
		assertEquals("10", driver.findElement(By.xpath("//tr[7]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasMetodologiaPesquisa() {
		assertEquals("METODOLOGIA DA PESQUISA CIENTÍFICA".trim(), driver
				.findElement(By.xpath("//tr[8]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[8]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasMetodologiaEnsinoSuperior() {
		assertEquals("METODOLOGIA DO ENSINO SUPERIOR".trim(), driver
				.findElement(By.xpath("//tr[9]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[9]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasModelagemProjetoBanco() {
		assertEquals("MODELAGEM E PROJETO DE BANCO DE DADOS".trim(), driver
				.findElement(By.xpath("//tr[10]/td")).getText().trim());
		assertEquals("9", driver.findElement(By.xpath("//tr[10]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasModelagemProjetoDeSistema() {
		assertEquals("MODELAGEM E PROJETO DE SISTEMA WEB".trim(), driver
				.findElement(By.xpath("//tr[11]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[11]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasProcessoSoftware() {
		assertEquals("PROCESSO DE SOFTWARE".trim(),
				driver.findElement(By.xpath("//tr[12]/td")).getText().trim());
		assertEquals("9", driver.findElement(By.xpath("//tr[12]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasProgramacaoEAmbienteDesenvolvimentoSistemas() {
		assertEquals(
				"PROGRAMAÇÃO E AMBIENTE DE DESENVOLVIMENTO DE SISTEMAS WEB"
						.trim(),
				driver.findElement(By.xpath("//tr[13]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[13]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasProjetoInterfaceHomemComputador() {
		assertEquals("PROJETO DE INTERFACE HOMEM-COMPUTADOR".trim(), driver
				.findElement(By.xpath("//tr[14]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[14]/td[2]"))
				.getText().trim());

	}

	public void NotasProjetoInterfacesSistemaWeb() {
		assertEquals("PROJETO DE INTERFACES PARA SISTEMAS WEB".trim(), driver
				.findElement(By.xpath("//tr[15]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[15]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasProjetoArquiteturaSoftware() {
		assertEquals("PROJETO E ARQUITETURA DE SOFTWARE".trim(), driver
				.findElement(By.xpath("//tr[16]/td")).getText().trim());
		assertEquals("9,5", driver.findElement(By.xpath("//tr[16]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasTesteSoftware() {
		assertEquals("TESTE DE SOFTWARE".trim(),
				driver.findElement(By.xpath("//tr[17]/td")).getText().trim());
		assertEquals("8,5", driver.findElement(By.xpath("//tr[17]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasTestesAutomatizados() {
		assertEquals("TESTES AUTOMATIZADOS".trim(),
				driver.findElement(By.xpath("//tr[18]/td")).getText().trim());
		assertEquals("10", driver.findElement(By.xpath("//tr[18]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasTestesAutomatizados2() {
		assertEquals("TESTES AUTOMATIZADOS II".trim(),
				driver.findElement(By.xpath("//tr[19]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[19]/td[2]"))
				.getText().trim());

	}

	@Test
	public void NotasTestesAplicacoesWeb() {
		assertEquals("TESTES DE APLICAÇÕES WEB".trim(),
				driver.findElement(By.xpath("//tr[20]/td")).getText().trim());
		assertEquals("", driver.findElement(By.xpath("//tr[20]/td[2]"))
				.getText().trim());

	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}
}
