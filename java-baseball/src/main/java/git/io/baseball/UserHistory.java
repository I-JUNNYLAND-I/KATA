package git.io.baseball;

import java.util.ArrayList;
import java.util.List;

public class UserHistory {
    private final List<User> histories;

    public UserHistory() {
        this.histories = new ArrayList<>();
    }

    public User roll(Integer numbers, Integer batting){
        User user = new User(numbers, batting,this);
        histories.add(user);
        return user;
    }
    public User rollBack(){
        final User before = histories.get(histories.size()-1);
        histories.remove(before);
        return before;
    }
    public User now(){
        return histories.get(histories.size()-1);
    }
}
