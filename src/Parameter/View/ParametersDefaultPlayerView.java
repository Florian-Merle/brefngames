package Parameter.View;

import Scene.Model.ActionEnum;
import Structure.AbstractView;
import Utils.UI.CustomRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParametersDefaultPlayerView extends AbstractView {

    private JButton backButton;

    // First icon player
    private JRadioButton firstIconSuperman;
    private JRadioButton firstIconBatman;
    private JRadioButton firstIconFlash;
    private JRadioButton firstIconAquaman;

    // Second icon player
    private JRadioButton secondIconSuperman;
    private JRadioButton secondIconBatman;
    private JRadioButton secondIconFlash;
    private JRadioButton secondIconAquaman;

    // First color player
    private JRadioButton firstColorPlayerRed;
    private JRadioButton firstColorPlayerBlue;
    private JRadioButton firstColorPlayerGreen;
    private JRadioButton firstColorPlayerYellow;

    // Second color player
    private JRadioButton secondColorPlayerRed;
    private JRadioButton secondColorPlayerBlue;
    private JRadioButton secondColorPlayerGreen;
    private JRadioButton secondColorPlayerYellow;

    private JLabel warningLabel;

    public ParametersDefaultPlayerView() {
        super();
        this.setLayout(new GridLayout(5, 4));

        this.backButton = new JButton("Back");

        this.firstIconSuperman = new CustomRadioButton("Superman_1");
        this.firstIconBatman = new CustomRadioButton("Batman_1");
        this.firstIconFlash = new CustomRadioButton("Flash_1");
        this.firstIconAquaman = new CustomRadioButton("Aquaman_1");

        this.secondIconSuperman = new CustomRadioButton("Superman_2");
        this.secondIconBatman = new CustomRadioButton("Batman_2");
        this.secondIconFlash = new CustomRadioButton("Flash_2");
        this.secondIconAquaman = new CustomRadioButton("Aquaman_2");

        this.firstColorPlayerRed = new CustomRadioButton("Red_1");
        this.firstColorPlayerBlue = new CustomRadioButton("Blue_1");
        this.firstColorPlayerGreen = new CustomRadioButton("Green_1");
        this.firstColorPlayerYellow = new CustomRadioButton("Yellow_1");

        this.secondColorPlayerRed = new CustomRadioButton("Red_2");
        this.secondColorPlayerBlue = new CustomRadioButton("Blue_2");
        this.secondColorPlayerGreen = new CustomRadioButton("Green_2");
        this.secondColorPlayerYellow = new CustomRadioButton("Yellow_2");

        this.warningLabel = new JLabel("");
        this.warningLabel.setForeground(Color.RED);

        ButtonGroup firstIconGroup = new ButtonGroup();
        firstIconGroup.add(this.firstIconSuperman);
        firstIconGroup.add(this.firstIconBatman);
        firstIconGroup.add(this.firstIconFlash);
        firstIconGroup.add(this.firstIconAquaman);

        ButtonGroup secondIconGroup = new ButtonGroup();
        secondIconGroup.add(this.secondIconSuperman);
        secondIconGroup.add(this.secondIconBatman);
        secondIconGroup.add(this.secondIconFlash);
        secondIconGroup.add(this.secondIconAquaman);

        ButtonGroup firstColorGroup = new ButtonGroup();
        firstColorGroup.add(this.firstColorPlayerRed);
        firstColorGroup.add(this.firstColorPlayerBlue);
        firstColorGroup.add(this.firstColorPlayerGreen);
        firstColorGroup.add(this.firstColorPlayerYellow);

        ButtonGroup secondColorGroup = new ButtonGroup();
        secondColorGroup.add(this.secondColorPlayerRed);
        secondColorGroup.add(this.secondColorPlayerBlue);
        secondColorGroup.add(this.secondColorPlayerGreen);
        secondColorGroup.add(this.secondColorPlayerYellow);

        this.initButtonsActionListeners();

        this.add(this.firstIconSuperman);
        this.add(this.firstIconBatman);
        this.add(this.firstIconFlash);
        this.add(this.firstIconAquaman);

        this.add(this.secondIconSuperman);
        this.add(this.secondIconBatman);
        this.add(this.secondIconFlash);
        this.add(this.secondIconAquaman);

        this.add(this.firstColorPlayerRed);
        this.add(this.firstColorPlayerBlue);
        this.add(this.firstColorPlayerGreen);
        this.add(this.firstColorPlayerYellow);

        this.add(this.secondColorPlayerRed);
        this.add(this.secondColorPlayerBlue);
        this.add(this.secondColorPlayerGreen);
        this.add(this.secondColorPlayerYellow);

        this.add(this.backButton);
        this.add(this.warningLabel);
    }

    private void initButtonsActionListeners() {
        this.backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.PARAMETERS_MENU);
            }
        });

        this.firstIconSuperman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.SUPERMAN_1);
            }
        });

        this.firstIconBatman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.BATMAN_1);
            }
        });

        this.firstIconFlash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.FLASH_1);
            }
        });

        this.firstIconAquaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.AQUAMAN_1);
            }
        });

        this.secondIconSuperman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.SUPERMAN_2);
            }
        });

        this.secondIconBatman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.BATMAN_2);
            }
        });

        this.secondIconFlash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.FLASH_2);
            }
        });

        this.secondIconAquaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.AQUAMAN_2);
            }
        });

        this.firstColorPlayerRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_FIRST_PLAYER_RED);
            }
        });

        this.firstColorPlayerBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_FIRST_PLAYER_BLUE);
            }
        });

        this.firstColorPlayerGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_FIRST_PLAYER_GREEN);
            }
        });

        this.firstColorPlayerYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_FIRST_PLAYER_YELLOW);
            }
        });

        this.secondColorPlayerRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_SECOND_PLAYER_RED);
            }
        });

        this.secondColorPlayerBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_SECOND_PLAYER_BLUE);
            }
        });

        this.secondColorPlayerGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_SECOND_PLAYER_GREEN);
            }
        });

        this.secondColorPlayerYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParametersDefaultPlayerView.this.observable.notifyObservers(ActionEnum.COLOR_SECOND_PLAYER_YELLOW);
            }
        });
    }

    // Call by the controller
    public void initIconFirstPlayer(ActionEnum actionEnum) {
        switch (actionEnum) {
            case SUPERMAN_1:
                this.firstIconSuperman.setSelected(true);
                break;
            case BATMAN_1:
                this.firstIconBatman.setSelected(true);
                break;
            case FLASH_1:
                this.firstIconFlash.setSelected(true);
                break;
            case AQUAMAN_1:
                this.firstIconAquaman.setSelected(true);
                break;
            default:
                throw new RuntimeException("The action : " + actionEnum + " is not acceptable here");
        }
    }

    // Call by the controller
    public void initIconSecondPlayer(ActionEnum actionEnum) {
        switch (actionEnum) {
            case SUPERMAN_2:
                this.secondIconSuperman.setSelected(true);
                break;
            case BATMAN_2:
                this.secondIconBatman.setSelected(true);
                break;
            case FLASH_2:
                this.secondIconFlash.setSelected(true);
                break;
            case AQUAMAN_2:
                this.secondIconAquaman.setSelected(true);
                break;
            default:
                throw new RuntimeException("The action : " + actionEnum + " is not acceptable here");
        }
    }

    // Call by the controller
    public void initColorFirstPlayer(ActionEnum actionEnum) {
        switch (actionEnum) {
            case COLOR_FIRST_PLAYER_RED:
                this.firstColorPlayerRed.setSelected(true);
                break;
            case COLOR_FIRST_PLAYER_BLUE:
                this.firstColorPlayerBlue.setSelected(true);
                break;
            case COLOR_FIRST_PLAYER_GREEN:
                this.firstColorPlayerGreen.setSelected(true);
                break;
            case COLOR_FIRST_PLAYER_YELLOW:
                this.firstColorPlayerYellow.setSelected(true);
                break;
            default:
                throw new RuntimeException("The action : " + actionEnum + " is not acceptable here");
        }
    }

    // Call by the controller
    public void initColorSecondPlayer(ActionEnum actionEnum) {
        switch (actionEnum) {
            case COLOR_SECOND_PLAYER_RED:
                this.secondColorPlayerRed.setSelected(true);
                break;
            case COLOR_SECOND_PLAYER_BLUE:
                this.secondColorPlayerBlue.setSelected(true);
                break;
            case COLOR_SECOND_PLAYER_GREEN:
                this.secondColorPlayerGreen.setSelected(true);
                break;
            case COLOR_SECOND_PLAYER_YELLOW:
                this.secondColorPlayerYellow.setSelected(true);
                break;
            default:
                throw new RuntimeException("The action : " + actionEnum + " is not acceptable here");
        }
    }

    /**
     * Set a warning label
     *
     * @param invalidDataObjectText
     */
    public void updateWarningMessage(String invalidDataObjectText) {
        this.warningLabel.setText(invalidDataObjectText);
        this.revalidate();
        this.repaint();
    }
}
