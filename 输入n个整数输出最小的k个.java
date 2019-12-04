public class Main {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!=null) {
            int n = Integer.parseInt(str.split(" ")[0]);
            int k = Integer.parseInt(str.split(" ")[1]);
              
            String line = br.readLine();
            String[] chArr = line.split(" ");
  
            int[] intArr = new int[n];
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(chArr[i]);
            }
            Arrays.sort(intArr);
            for (int i = 0; i < k ; i++) {
                if(i==k-1)
                    System.out.println(intArr[i]);
                else
                    System.out.print(intArr[i]+" ");
            }
        }
    }
}
