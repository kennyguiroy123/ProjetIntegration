package ProjetIntegration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@RunWith(Parameterized.class)
public class CalculsTest {
	
	//@BeforeEach
    void setUp() throws Exception 
	{
		assertTrue( true );// Instanciations communes à tous les tests, initalisations         
    }        

    @AfterEach
    void tearDown() throws Exception 
	{
    	assertTrue( true );  // Eventuel nettoyage/réinitialisation après chaque test

    }

	// méthode fournissant les données de test
    /*static Stream<Arguments> chargerJeuDeTest() throws Throwable {
		
            return Stream.of(				
                Arguments.of(2,2,4),
                Arguments.of(6,6,36),
                Arguments.of(3,2,3)
            );
    }*/

    
	// Pour l'affichage des résultats
    @ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	// Pour définir la méthode fournissant les données de test
    @MethodSource("chargerJeuDeTest")
    void testMultiplier(int firstNumber, int secondNumber, int expectedResult) {
            Calculs monCal = new Calculs(firstNumber, secondNumber);
            assertEquals(expectedResult, monCal.multiplier());
    }

}
