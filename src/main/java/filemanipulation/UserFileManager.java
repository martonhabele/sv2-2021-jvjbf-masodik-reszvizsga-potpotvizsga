package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserFileManager {
    private List<User> users = new ArrayList<>();

    public void readUsersFromFile(Path path) {
        try {
            List<String> tempUsers = new ArrayList<>();
            tempUsers = Files.readAllLines(path);
            for (String scopedUser : tempUsers) {
                String[] temp = scopedUser.split(" ");
                users.add(new User(temp[0].trim(), temp[1].trim(), temp[2].trim()));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!");
        }
    }

    public void writeMaleHumansToFile(Path path) throws IOException {
        List<String> userToWrite = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            String[] temp = users.get(i).getEmail().split("@");
            if (users.get(i).getUserName().equalsIgnoreCase(temp[0])) {
                userToWrite.add(users.get(i).getUserName());
            }
        }
        Files.write(path, userToWrite);
    }

    public List<User> getUsers() {
        return users;
    }
}