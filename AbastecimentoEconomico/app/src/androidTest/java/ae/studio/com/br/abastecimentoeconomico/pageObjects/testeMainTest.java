package ae.studio.com.br.abastecimentoeconomico.pageObjects;

import org.junit.Rule;
import org.junit.Test;

import android.support.test.rule.ActivityTestRule;

import ae.studio.com.br.abastecimentoeconomico.MainActivity;
import ae.studio.com.br.abastecimentoeconomico.common.ScreenRobot;
import ae.studio.com.br.abastecimentoeconomico.pageObjects.robot.MainRobot;
import static ae.studio.com.br.abastecimentoeconomico.pageObjects.constants.ConstantsMain.*;

/**
 * Created by daiane.macedo on 04/08/18.
 */



public class testeMainTest extends ScreenRobot {
    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public  void CheckElementsOnView(){
        new MainRobot()
                .checkImgCarro()
                .checkTextCampoAlcool()
                .checkTextCampoGasolina()
                .checkBtnVerificar();

    }

    @Test
    public void valorAlcoolMaior(){
        new MainRobot()
                .typeValorAlcool("4.90")
                .typeValorGasolina("4.80")
                .clickOnBtnVerificar()
                .checkMsgResult(MSG_GASOLINA_MELHOR);
    }

    @Test
    public void valorGasolinaMaior(){
        new MainRobot()
                .typeValorAlcool("2.60")
                .typeValorGasolina("4.80")
                .clickOnBtnVerificar()
                .checkMsgResult(MSG_ALCOOL_MELHOR);
    }

    @Test
    public void valorAlcoolEGasolinaIguais(){
        new MainRobot()
                .typeValorAlcool("4.80")
                .typeValorGasolina("4.80")
                .clickOnBtnVerificar()
                .checkMsgResult(MSG_GASOLINA_MELHOR);
    }




}
