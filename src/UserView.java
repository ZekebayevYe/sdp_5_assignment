import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    private List<UserModel> users;
    private Scanner sc;

    public UserView() {
        users = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            int option = menu();

            switch (option) {
                case 1:
                    String name = getUsername();
                    addUser(name);
                    System.out.println("User added!");
                    break;
                case 2:
                    showUserList();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public int menu() {
        System.out.println("1. add user");
        System.out.println("2. show users");
        System.out.println("3. exit");
        System.out.println("choose:");
        return sc.nextInt();
    }

    public String getUsername() {
        System.out.println("enter name:");
        sc.nextLine();
        return sc.nextLine();
    }

    public void addUser(String name) {
        UserModel user = new UserModel(name);
        users.add(user);
    }

    public void showUserList() {
        System.out.println("userlist:");
        for (UserModel user : users) {
            System.out.println("- name: " + user.getname());
        }
    }
}
