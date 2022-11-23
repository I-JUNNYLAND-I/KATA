package git.io.urlValidator;

public interface Item {
    Info info();

    interface Wepon extends Item {
        Info info();

        Wepon Sword = () -> new Info(50,20,10);
        Wepon Bow = () -> new Info(30,10,10);
        Wepon None = Info::none;
    }
    interface Armor extends Item {
        Info info();

        Armor Steel = () -> new Info(0,50,30);
        Armor Leather = () -> new Info(0,30,20);
        Armor None = Info::none;
    }
}
