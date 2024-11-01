import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    private List<UserModel> users;
    public UserViewModel(){
        users = new ArrayList<>();
    }
    public void adduser(String name){
        UserModel user = new UserModel(name);
        users.add(user);
    }

    public List<UserModel> getUserNames() {
        return users;
    }
}