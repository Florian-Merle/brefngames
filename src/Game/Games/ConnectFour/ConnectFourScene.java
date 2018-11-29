//package Game.Games.ConnectFour;
//
//import Game.GameScene;
//import Game.Games.ConnectFour.ConnectFourController.ConnectFourController;
//import Game.Games.ConnectFour.ConnectFourModel.ConnectFourModel;
//import Game.Games.ConnectFour.ConnectFourView.ConnectFourView;
//import Player.Player;
//
//public class ConnectFourScene extends GameScene {
//    private final static int DEFAULT_ROW = 6;
//    private final static int DEFAULT_COLUMN = 7;
//
//    public ConnectFourScene(Player[] listPlayers, boolean isTraining) {
//        this.model = new ConnectFourModel(listPlayers, DEFAULT_SIZE);
//        this.view = new ConnectFourView(DEFAULT_SIZE);
//        this.controller = new ConnectFourController((ConnectFourModel) this.model, (ConnectFourView) this.view, DEFAULT_ROW, DEFAULT_COLUMN, isTraining);
//        this.controller.addObserver(this);
//    }
//}
