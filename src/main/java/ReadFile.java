import java.util.HashMap;
import java.util.Map;

public class ReadFile {
/*    private static Scanner x;
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "Samples.txt";
        String searchName = "test";
    }

public static void readTerm(String searchName, String filePath){
    boolean found = false;
    String ID = ""; String name= "";

    try {
        x= new Scanner(new File(filePath));
        x.useDelimiter("[,\n]");
        while(x.hasNext() && !found)
        {
            ID = x.next();
            name = x.next();

            if(name.equals(searchName))
            {
                found = true;
            }
        }
    }
    catch (Exception e)
    {
        System.out.println("name not found");
    }

}
        }*/

    /*public static void main(String[] args) throws FileNotFoundException {
        String searchName = "test";

        Scanner scanner = new Scanner(new File("C:\\GitHub\\readFile\\Sample.txt"));
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "|");
            try {
                //scanner.close();
                if (scanner.equals(searchName)) {
                    System.out.println("The file contains" + searchName);
                }
            }

        }*/

    public static void main(String[] args) {
        String csvFile = "";
        try {
            csvFile = args[0];
        } catch (Exception e) {
            System.out.println("Please provide the name of the file");
            System.exit(0);
        }
        String line = "";
        String csvSplitBy = ",";

        Map<String, Integer> NameOccrence = new HashMap<String, Integer>();
/*        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            int count = 1;
            while ((line = br.readLine()) != null)


        }*/

    }
}





