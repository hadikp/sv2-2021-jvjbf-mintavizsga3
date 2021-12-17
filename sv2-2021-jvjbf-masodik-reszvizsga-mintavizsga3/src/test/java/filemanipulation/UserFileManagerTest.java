package filemanipulation;

import static org.junit.jupiter.api.Assertions.*;

class UserFileManagerTest {

    @TempDir
    File tempFolder;

    @Test
    public void createFileManager() {
        UserFileManager ufm = new UserFileManager();

        assertEquals(0, ufm.getUsers().size());

    }


    @Test
    public void readFileTest() {
        UserFileManager ufm = new UserFileManager();

        ufm.readUsersFromFile(Paths.get("src/test/resources/userinfo.csv"));

        assertEquals(6, ufm.getUsers().size());
        assertEquals("anOther", ufm.getUsers().get(2).getUserName());

    }

    @Test
    public void readFileWithWrongPathTest() {
        UserFileManager ufm = new UserFileManager();

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> ufm.readUsersFromFile((Paths.get("src/test/resources/users.csv"))));

        assertEquals("Can't read file!", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }

    @Test
    public void writeFileTest() throws IOException {
        UserFileManager ufm = new UserFileManager();
        Path path = tempFolder.toPath().resolve("searched_users.csv");

        ufm.readUsersFromFile((Paths.get("src/test/resources/userinfo.csv")));

        ufm.writeMaleHumansToFile(path);

        List<String> result = Files.readAllLines(path);

        assertEquals(4, result.size());
        assertEquals("anOther", result.get(2));

    }

}