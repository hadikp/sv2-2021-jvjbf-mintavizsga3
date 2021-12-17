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
    }

    public void writeMaleHumansToFile(Path path) {
        System.out.println();
    }

    public List<String> getUsers() {
        return new ArrayList(users);
    }

}
