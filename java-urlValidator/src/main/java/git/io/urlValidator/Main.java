package git.io.urlValidator;


import static git.io.urlValidator.Item.Armor.Leather;
import static git.io.urlValidator.Item.Armor.Steel;
import static git.io.urlValidator.Item.Wepon.Bow;

public class Main {
    public static void main(String[] args) {
        User user = new User(Bow, Leather);
        System.out.println("user.myStatus() = " + user.myStatus());

        user = user.chageArmor(Steel);
        System.out.println("Chage Armor = " + user.myStatus());

    }
}
