package WriteToFile;

import UserPackacge.User;

import java.io.*;
import java.util.ArrayList;

public class WriteToFile {
    private String path;
    private final String separator = File.separator;

    WriteToFile() {
        this.path = "." + separator + "Datafile";
    }

    WriteToFile(String path) {

        try {
            if (path == null) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException err) {
            System.out.printf("Path == null ");
            System.exit(0);
        }
        this.path = path;
    }

    public void writeToFile(ArrayList<User> users) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            for (int i = 0; i < users.size(); i++) {
                String str = users.get(i).toString();
                byte[] strToBytes = str.getBytes();
                outputStream.write(strToBytes);
            }
            outputStream.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public void printPath() {
        System.out.println(this.path);
    }
}

class Test {
    public static void main(String[] argv) {
        WriteToFile writeFile = new WriteToFile();

        User user1 = new User("Ivan", "Ivanov", "Ivanovich", "Medme", "pass");
        User user2 = new User("Ivan1", "Ivanov1", "Ivanovich1", "Medme1", "pass1");

        ArrayList<User> usersArr = new ArrayList<>();

        usersArr.add(user1);
        usersArr.add(user2);

        writeFile.printPath();
        writeFile.writeToFile(usersArr);
    }
}