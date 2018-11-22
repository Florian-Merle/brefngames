package Parameter.Controller;

import Parameter.Model.ParameterEnum;
import Parameter.Model.Parameters;
import Parameter.Model.ParametersThemeSoundModel;
import Parameter.Parameters.ColorParameter;
import Parameter.Parameters.Configurable;
import Parameter.View.ParametersThemeSoundView;
import Scene.Controller.AbstractSceneController;
import Scene.Model.ActionEnum;
import Structure.AbstractModel;
import Structure.AbstractView;

import java.util.Map;
import java.util.Observable;

public class ParametersThemeSoundController extends AbstractSceneController {

    public ParametersThemeSoundController(AbstractModel model, AbstractView view) {
        super(model, view);
        this.initView();
    }

    @Override
    public void update(Observable o, Object arg) {
        switch ((ActionEnum) arg) {
            // Sound cases
            case SOUND_ON:
                ((ParametersThemeSoundModel) this.model).setSound(true);
                break;
            case SOUND_OFF:
                ((ParametersThemeSoundModel) this.model).setSound(false);
                break;

            // First color cases
            case FIRST_COLOR_RED:
                ((ParametersThemeSoundModel) this.model).setFirstColor(ActionEnum.FIRST_COLOR_RED.toString());
                break;
            case FIRST_COLOR_BLUE:
                ((ParametersThemeSoundModel) this.model).setFirstColor(ActionEnum.FIRST_COLOR_BLUE.toString());
                break;
            case FIRST_COLOR_GREEN:
                ((ParametersThemeSoundModel) this.model).setFirstColor(ActionEnum.FIRST_COLOR_GREEN.toString());
                break;
            case FIRST_COLOR_YELLOW:
                ((ParametersThemeSoundModel) this.model).setFirstColor(ActionEnum.FIRST_COLOR_YELLOW.toString());
                break;

            // Second color cases
            case SECOND_COLOR_WHITE:
                ((ParametersThemeSoundModel) this.model).setSecondColor(ActionEnum.SECOND_COLOR_WHITE.toString());
                break;
            case SECOND_COLOR_LIGHT_GRAY:
                ((ParametersThemeSoundModel) this.model).setSecondColor(ActionEnum.SECOND_COLOR_LIGHT_GRAY.toString());
                break;
            case SECOND_COLOR_DARK_GRAY:
                ((ParametersThemeSoundModel) this.model).setSecondColor(ActionEnum.SECOND_COLOR_DARK_GRAY.toString());
                break;
            case SECOND_COLOR_BLACK:
                ((ParametersThemeSoundModel) this.model).setSecondColor(ActionEnum.SECOND_COLOR_BLACK.toString());
                break;
            case PARAMETERS_MENU:
                Parameters.save(((ParametersThemeSoundModel) this.model).getConfigurations());
                this.setChanged();
                this.notifyObservers(arg);
                break;
            default:
                throw new RuntimeException("The action : " + arg + " is not acceptable here");
        }
    }

    private void initView() {
        Map<ParameterEnum, Configurable> conf = ((ParametersThemeSoundModel) this.model).getConfigurations();
        this.initSoundView(conf);
        this.initFirstColorView(conf);
        this.initSecondColorView(conf);
    }

    private void initSoundView(Map<ParameterEnum, Configurable> conf) {
        boolean isOn = (boolean) conf.get(ParameterEnum.SOUND).getValue();

        if (isOn) {
            ((ParametersThemeSoundView) this.view).initSoundButtons(ActionEnum.SOUND_ON);
        } else {
            ((ParametersThemeSoundView) this.view).initSoundButtons(ActionEnum.SOUND_OFF);
        }
    }

    private void initFirstColorView(Map<ParameterEnum, Configurable> conf) {
        String firstColor = ((ColorParameter) conf.get(ParameterEnum.THEME_FIRST_COLOR)).getStringColor();
        ((ParametersThemeSoundView) this.view).initFirstColorButtons(ActionEnum.valueOf(firstColor));
    }

    private void initSecondColorView(Map<ParameterEnum, Configurable> conf) {
        String secondColor = ((ColorParameter) conf.get(ParameterEnum.THEME_SECOND_COLOR)).getStringColor();
        ((ParametersThemeSoundView) this.view).initSecondColorButtons(ActionEnum.valueOf(secondColor));
    }

}
