public class TennisGame1 implements TennisGame {

  private Player player1;
  private Player player2;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1 = new Player(player1Name);
    this.player2 = new Player(player2Name);
  }

  public void wonPoint(String playerName) {
    if (playerName.equals(player1.name))
      player1.points++;
    else
      player2.points++;
  }

  public String getScore() {
    String score;

    if (player1.points == player2.points) {
      score = drawScore(player1.points);
    } else if (player1.points >= 4 || player2.points >= 4) {
      score = finalScore(player1.points - player2.points);
    } else {
      score = String.format("%s-%s", pointsToScore(player1.getPoints()), pointsToScore(player2.getPoints()));
    }
    return score;
  }

  private String pointsToScore(int points) {
    switch (points) {
      case 0:
        return "Love";
      case 1:
        return "Fifteen";
      case 2:
        return "Thirty";
      case 3:
        return "Forty";
      default:
        return "";
    }
  }

  private String finalScore(int scoreDifference) {
    switch (scoreDifference) {
      case 1:
        return "Advantage player1";
      case -1:
        return "Advantage player2";
      default:
        return scoreDifference > 0 ? "Win for player1" : "Win for player2";
    }
  }

  private String drawScore(int points) {
    switch (points) {
      case 0:
        return "Love-All";
      case 1:
        return "Fifteen-All";
      case 2:
        return "Thirty-All";
      default:
        return "Deuce";
    }
  }
}
