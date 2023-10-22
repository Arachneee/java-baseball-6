package baseball.controller;

import baseball.domain.Player;
import baseball.domain.Referee;
import baseball.domain.Result;
import baseball.view.BaseBallView;

public class RefereeController {

    private static final BaseBallView baseBallView = BaseBallView.create();

    private RefereeController() {
    }

    public static Result umpiredPlayers(Player player, Player opponent) {
        Referee referee = Referee.create();
        Result result = referee.calculateResult(player.getNumbers(), opponent.getNumbers());

        baseBallView.resultGameView(result.toString());

        return result;
    }
}
