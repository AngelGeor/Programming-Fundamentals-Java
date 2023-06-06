package TextProcessing_Ex;

import java.util.Scanner;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullPathFile = scanner.nextLine();

        //C:\Internal\training-internal\Template.pptx
        //Split po "\"
        //1 pulnoto ime na file-a

        String[] pathParts = fullPathFile.split("\\\\");
        String fullName = pathParts[pathParts.length - 1];

        String fileName = fullName.split("\\.")[0];
        String extension = fullName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
