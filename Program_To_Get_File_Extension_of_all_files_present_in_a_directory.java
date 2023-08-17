import java.io.File;

class Main {

  public static void main(String[] args) {
    File directory = new File("Directory");

    File[] files = directory.listFiles();
    System.out.println("Files\t\t\tExtension");

    for(File file : files) {
      String fileName = file.toString();

      int index = fileName.lastIndexOf('.');
      if(index > 0) {
        String extension = fileName.substring(index + 1);
        System.out.println(fileName + "\t" + extension);
      }
    }
  }


}
