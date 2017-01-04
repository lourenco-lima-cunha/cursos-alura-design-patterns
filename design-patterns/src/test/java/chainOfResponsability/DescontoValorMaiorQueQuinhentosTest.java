package chainOfResponsability;

import org.junit.Assert;
import org.junit.Test;

public class DescontoValorMaiorQueQuinhentosTest {

	@Test
	public void testaQueGeraDesconto() {
		DescontoValorMaiorQueQuinhentos desconto = new DescontoValorMaiorQueQuinhentos();
		desconto.setProximo(new SemDesconto());
		
		Orcamento orcamento = new Orcamento(
				new Item("Playstation 4", 1000.00));
		
		Assert.assertEquals(70.00, desconto.aplicaDesconto(orcamento), 0.01);
	}
	
}
