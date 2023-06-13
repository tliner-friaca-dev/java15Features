package br.com.java15Features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TextBlocksTests {

	@Test
	void switchExpressions_retornaFinalDeSemanaxxxxxxxxxxxxxxxxxx_quandoSucesso() {

		var resultado = """
						<html>
							<body>
								<p>Text Blocks!!!</p>
							</body>
						</html>
						""";


		assertEquals(String.valueOf("""
									<html> 
										<body>
											<p>Text Blocks!!!</p>
										</body>
									</html>
									"""), resultado);

	}

}
