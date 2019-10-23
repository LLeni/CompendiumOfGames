package sample;

public enum Genres {
    FPS("FPS"), ShootThemUp("Shoot 'em up"), Roguelike("Roguelike"), Roguelite("Roguelite"), RPG("RPG"), ActionRPG("ActionRPG"),
    Platformer("Platformer"), Metroidvania("Metroidvania"), Simulator("Simulator"), Race("Race"), MMORPG("MMORPG"), RTS("RTS"), Strategy("Strategy"),
    Puzzle("Puzzle");

    String name;
    Genres(String name){
        this.name = name;
    }
}
