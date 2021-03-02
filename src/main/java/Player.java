import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Player {
  public String name;
  public int points;

  Player(String name) {
    this.name = name;
    this.points = 0;
  }
}
