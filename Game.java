import java.util.*;
import java.io.*;
public class Game
{
    String[][] filled;
    /*
     * for(int i= length-4;i<length;i++){
         * if(filled[i][column]==1){
             * for(int j= i-1; >=length-4;j--){
                 * filled[j][column]=1;
             * } 
             * break;
         * } 
     * }
     */
    int size;
    ArrayList<Integer>[] rows;
    ArrayList<Integer>[] columns;
    public Game()//int size)
    {
        this.size = 15;
        filled = new String[size][size];
        rows = new ArrayList[size];
        columns = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            rows[i] = new ArrayList<Integer>();
            columns[i] = new ArrayList<Integer>();
        }
        for(String[] i : filled){
            int k=0;
            for(String j : i){
                i[k]="0";
                k++;
            }
        }
    }
    
    public void calcR(int row){
        int x=0;
        for(int i=0;i<rows[row].size();i++){
            x += rows[row].get(i);
        }
        x += rows[row].size()-1;
        int z = size-x;
        for(int i=0; i<rows[row].size();i++){
            if (z<rows[row].get(i)){
                System.out.println("Length of area: " + (rows[row].get(i)-z));
                int loc = i;
                for(int j=0;j<=i;j++){
                    loc += rows[row].get(j);
                }
                if((rows[row].get(i)-z)!=1){
                    System.out.println("Area from " + (loc-(rows[row].get(i)-z)) + " to " + loc);
                }
                for(int j=(loc-(rows[row].get(i)-z));j<loc;j++){
                  filled[row][j]="1";
                }
            }
        }
        System.out.println(Arrays.toString(filled[row]));
    }

    public void calcC(int column){
        int x=0;
        for(int i=0;i<columns[column].size();i++){
            x += columns[column].get(i);
        }
        x += columns[column].size()-1;
        int z = size-x;
        for(int i=0; i<columns[column].size();i++){
            if (z<columns[column].get(i)){
                System.out.println("Length of area: " + (columns[column].get(i)-z));
                int loc = i;
                for(int j=0;j<=i;j++){
                    loc += columns[column].get(j);
                }
                if((columns[column].get(i)-z)!=1){
                    System.out.println("Area from " + (loc-(columns[column].get(i)-z)) + " to " + loc);
                }
                for(int j=(loc-(columns[column].get(i)-z));j<loc;j++){
                  filled[j][column]="1";
                }
            }
        }
        for (int i=0;i<size;i++){ {
            System.out.print(filled[i][column]);
        }
        }
    }
   
    public void calcCS(int column){
        int x=0;
        for(int i=0;i<columns[column].size();i++){
            x += columns[column].get(i);
        }
        x += columns[column].size()-1;
        int z = size-x;
        for(int i=0; i<columns[column].size();i++){
            if (z<columns[column].get(i)){
                int loc = i;
                for(int j=0;j<=i;j++){
                    loc += columns[column].get(j);
                }
                for(int j=(loc-(columns[column].get(i)-z));j<loc;j++){
                  filled[j][column]="1";
                }
            }
        }
    }

    public void calcRS(int row){
        int x=0;
        for(int i=0;i<rows[row].size();i++){
            x += rows[row].get(i);
        }
        x += rows[row].size()-1;
        int z = size-x;
        for(int i=0; i<rows[row].size();i++){
            if (z<rows[row].get(i)){
                int loc = i;
                for(int j=0;j<=i;j++){
                    loc += rows[row].get(j);
                }
                for(int j=(loc-(rows[row].get(i)-z));j<loc;j++){
                  filled[row][j]="1";
                }
            }
        }
    }
    
    public void getfilled(){
        int i=0;
        for(String[] row : filled){
            for(int j=0; j<rows[i].size();j++){
                System.out.print(rows[i].get(j)+" ");
                if(rows[i].size()==1){
                    if(rows[i].get(0)>9){
                        System.out.print("   ");
                    }else{
                        System.out.print("    ");
                    }
                }else if(rows[i].size()==2){
                    System.out.print(" ");
                }else if(rows[i].size()==3){}
            }
            System.out.println(Arrays.toString(row));
            i++;
        }
    }
    
    public void getRow(int row){
        for(int i=0;i<rows[row].size();i++){
            System.out.println(rows[row].get(i));
        }
    }
    
    public void setRow(int a, int row){
        rows[row].clear();
        rows[row].add(a);
    }
    
    public void setRow(int a, int b, int row){
        rows[row].clear();
        rows[row].add(a);
        rows[row].add(b);
    }
    
    public void setRow(int a, int b, int c, int row){
        rows[row].clear();
        rows[row].add(a);
        rows[row].add(b);
        rows[row].add(c);
    }
    
    public void setRow(int a, int b, int c, int d, int row){
        rows[row].clear();
        rows[row].add(a);
        rows[row].add(b);
        rows[row].add(c);
        rows[row].add(d);
    }
    
    public void setRow(int a, int b, int c, int d, int e, int row){
        rows[row].clear();
        rows[row].add(a);
        rows[row].add(b);
        rows[row].add(c);
        rows[row].add(d);
        rows[row].add(e);
    }
    
    public void setRow(int a, int b, int c, int d, int e, int f, int row){
        rows[row].clear();
        rows[row].add(a);
        rows[row].add(b);
        rows[row].add(c);
        rows[row].add(d);
        rows[row].add(e);
        rows[row].add(f);
    }
    
    public void clearRow(int row){
        rows[row].clear();
    }
    
    public void clearAll(){
        for(int i=0;i<size; i++){
            rows[i].clear();
        }
    }

    public void setColumn(int a, int column){
        columns[column].clear();
        columns[column].add(a);
    }

    public void setColumn(int a, int b, int column){
        columns[column].clear();
        columns[column].add(a);
        columns[column].add(b);
    }

    public void setColumn(int a, int b, int c, int column){
        columns[column].clear();
        columns[column].add(a);
        columns[column].add(b);
        columns[column].add(c);
    }

    public void setColumn(int a, int b, int c, int d, int column){
        columns[column].clear();
        columns[column].add(a);
        columns[column].add(b);
        columns[column].add(c);
        columns[column].add(d);
    }

    public void setColumn(int a, int b, int c, int d, int e, int column){
        columns[column].clear();
        columns[column].add(a);
        columns[column].add(b);
        columns[column].add(c);
        columns[column].add(d);
        columns[column].add(e);
    }

    public void setColumn(int a, int b, int c, int d, int e, int f, int column){
        columns[column].clear();
        columns[column].add(a);
        columns[column].add(b);
        columns[column].add(c);
        columns[column].add(d);
        columns[column].add(e);
        columns[column].add(f);
    }

    public void clearColumn(int column){
        columns[column].clear();
    }
}
/*int n = 3;
  
        // Here aList is an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer> > aList = 
                  new ArrayList<ArrayList<Integer> >(n);
  
        // Create n lists one by one and append to the 
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        aList.add(a1);
  
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        aList.add(a2);
  
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        aList.add(a3);
  
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }
*/