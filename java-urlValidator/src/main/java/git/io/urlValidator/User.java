package git.io.urlValidator;

import git.io.urlValidator.Item.Armor;
import git.io.urlValidator.Item.Wepon;

import static git.io.urlValidator.Info.combine;
import static java.lang.String.format;

public class User {
    private final Wepon wepon;
    private final Armor armor;

    public User(Wepon wepon, Armor armor) {
        this.wepon = wepon;
        this.armor = armor;
    }

    public Info myStatus(){
        return combine(wepon.info(),
                armor.info()
        );
    }
    public User chageWepon(Wepon wepon){
        return new User(wepon,this.armor);
    }
    public User chageArmor(Armor armor){
        return new User(this.wepon,armor);
    }
}
