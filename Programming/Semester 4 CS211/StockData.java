package Stocks;
 
public class StockData{
     public static void main(String[] args){
         FileIO io = new FileIO();
         String[] original = io.load("C:\\Users\\Conor\\Documents\\CS211\\StockData.txt");
         
         int numrows=original.length-1;
         int numcols=original[0].split("\t").length-1;
         
         String name [] = new String[numcols];
         for(int i=0;i<numcols;i++)
         {
             name[i]=original[0].split("\t")[i+1];
         }
         
         String date [] = new String[numrows];
         for(int i=0;i<numrows;i++)
         {
             date[i]=original[i+1].substring(0, original[i+1].indexOf("\t"));
         }
         
         double lowest=Double.parseDouble(original[0+1].split("\t")[0+1]);
         double highest=Double.parseDouble(original[0+1].split("\t")[0+1]);
         int pos [] = {0,0};
         int pos2 [] = {0,0};
         
         double[][] array = new double[numrows][numcols];
         for(int i=0;i<numrows;i++){
             for(int j=0;j<numcols;j++){
       
                 array[i][j]=Double.parseDouble(original[i+1].split("\t")[j+1]);
                 if(array[i][j]<lowest)
                 {
                     lowest=array[i][j];
                     pos[0]=i;
                     pos[1]=j;
                 }
                 else if(array[i][j]>highest)
                 {
                     highest=array[i][j];
                     pos2[0]=i;
                     pos2[1]=j;
                 }
             }
         }
         
         System.out.println("The company with the lowest drawdown is "+name[pos[1]] +" with "+lowest+" percent between the date of "+date[pos[0]+1]+" and "+date[pos[0]]+".");
         System.out.println("The company with the highest drawdown is "+name[pos2[1]] +" with "+highest+" percent between the date of "+date[pos2[0]+1]+" and "+date[pos2[0]]+".");
     }
}