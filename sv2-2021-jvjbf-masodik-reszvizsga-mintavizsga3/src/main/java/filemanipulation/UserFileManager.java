package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserFileManager {

    private List<User> users = new ArrayList<>();

    public void readUsersFromFile(Path path) {
        List<String> readFile = new ArrayList<>();
        try {
            readFile = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
        users = makeUser(readFile);
    }

    private List<User>  makeUser(List<String> readFile) {
        List<User> result = new ArrayList<>();
        for (String st: readFile) {
            String[] stSplit = st.split(" ");

            result.add(new User(stSplit[0], stSplit[1], stSplit[2]));
        }
        return result;
    }

    public void writeMaleHumansToFile(Path path) {
        makeCapital();
    }

    private void makeCapital() {
        for (User u: users) {
            System.out.println(u.getEmail());
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
