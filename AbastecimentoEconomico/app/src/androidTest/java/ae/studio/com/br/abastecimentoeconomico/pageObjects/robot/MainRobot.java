package ae.studio.com.br.abastecimentoeconomico.pageObjects.robot;

import ae.studio.com.br.abastecimentoeconomico.R;
import ae.studio.com.br.abastecimentoeconomico.common.ScreenRobot;
import static ae.studio.com.br.abastecimentoeconomico.pageObjects.constants.ConstantsMain.*;

/**
 * Created by daiane.macedo on 04/08/18.
 */

public class MainRobot extends ScreenRobot<MainRobot> {

    private static final int CAMPO_ALCOOL = R.id.alcool;
    private static final int CAMPO_GASOLINA = R.id.gasolina;
    private static final int BTN_VERIFICAR = R.id.btn;
    private static final int IMG_CARRO = R.id.imageView2;
    private static final int LABEL_ALCOOL = R.id.textView2;
    private static final int LABEL_GASOLINA = R.id.textView3;
    private static final int CAMPO_RESULTADO = R.id.resultado;


    public MainRobot checkTextCampoAlcool(){
        checkViewHasText(LABEL_ALCOOL, TXT_PRECO_ALCOOL);
        return this;
    }

    public MainRobot checkTextCampoGasolina(){
        checkViewHasText(LABEL_GASOLINA,TXT_PRECO_GASOLINA);
        return this;
    }

    public MainRobot checkBtnVerificar(){
        checkViewHasText(BTN_VERIFICAR, TXT_BTN_VERIFICAR);
        checkIsClickable(BTN_VERIFICAR);
        return this;
    }

    public MainRobot checkImgCarro(){
        checkIsDisplayed(IMG_CARRO);
        return this;
    }

    public MainRobot typeValorAlcool(String valorAlcool){
        enterTextIntoView(CAMPO_ALCOOL,valorAlcool);
        closeKeyboard();
        return this;
    }

    public MainRobot typeValorGasolina(String valorGasolina){
        enterTextIntoView(CAMPO_GASOLINA,valorGasolina);
        closeKeyboard();
        return this;
    }

    public MainRobot clickOnBtnVerificar() {
        clickOnView(BTN_VERIFICAR);
        return this;
    }

    public MainRobot checkMsgResult(String msg){
        checkViewHasText(CAMPO_RESULTADO, msg);
        return  this;
    }




}
