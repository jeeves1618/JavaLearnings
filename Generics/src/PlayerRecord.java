public class PlayerRecord <T extends Player>{

    private T player;

    public PlayerRecord(T player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "PlayerRecord{" +
                "Player=" + player.playerName() +
                "Country=" + player.country() +
                "Playing Position=" + player.playerPosition() +
                '}';
    }
}
