import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTask{

    public static void main(String[] args) throws IOException{
        while (true) {
            System.out.println("Enter the choice :");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            File f = new File("D:\\program");
            File f1 = new File("D:\\program\\java.txt");
            File f2 = new File("D:\\program\\web.txt");


            switch (n) {
                case 1:
                    if (f1.createNewFile())
                        System.out.println("File successfully created");
                    else
                        System.out.println("File exists");
                    break;

                case 2:
                    if(f1.exists() || f1.isFile()){
                        f1.delete();
                        System.out.println("deleted successfully");
                    }
                    else
                        System.out.println("file not found");
                    break;
                case 3:
                     String file[] = f.list();
                     if(f.exists() || f.isDirectory()){
                        for(int i=0;i<file.length;i++){
                            System.out.println(file[i]+"\n");
                        }
                     }
                    else {
                        System.out.println("no file or directory found");
                    }
                    break;
                case 4:
                    System.out.println(f2.isHidden());
                    break;
                case 5:
                    System.out.println(f1.getParentFile());
                    break;
                default:
                    System.out.println("Enter valid choice");
            }

        }

    }

}

