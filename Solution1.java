/*
Given a 2D array, print it in spiral form. See the following examples.

Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 


Input:
        1   2   3   4  5   6
        7   8   9  10  11  12
        13  14  15 16  17  18
Output: 
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11

*/

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> returnList = new ArrayList<Integer>();
        int startRowIndex = 0;
        int endRowIndex = matrix.length-1;
        int startColIndex = 0;
        int endColIndex = matrix[0].length-1;
        int count = 1;
        int total = matrix.length*matrix[0].length;
        
        while (startRowIndex <= endRowIndex && startColIndex <= endColIndex && total >= count){
            //System.out.println("while");
            for (int i = startColIndex; i <= endColIndex && count <= total ; i++){
                //System.out.println(count + " " + matrix[startRowIndex][i]);
                returnList.add(matrix[startRowIndex][i]);
                count++; 
            }
            startRowIndex++;
            
            for (int i = startRowIndex; i <= endRowIndex && count <= total; i++){
                //System.out.println(count + " " + matrix[i][endColIndex]);
                count++;
                returnList.add(matrix[i][endColIndex]);
            }
            endColIndex--;
            
            for (int i = endColIndex; i >= startColIndex && count <= total ; i--){
                //System.out.println(count + " " + matrix[endRowIndex][i]);
                count++;
                returnList.add(matrix[endRowIndex][i]);
            }
            endRowIndex--;
            
            for (int i = endRowIndex; i >= startRowIndex && count <= total ; i--){
                //System.out.println(count + " " + matrix[i][startColIndex]);
                count++;
                returnList.add(matrix[i][startColIndex]);
            }
            startColIndex++;
        
        }
        return returnList;
    }
}
