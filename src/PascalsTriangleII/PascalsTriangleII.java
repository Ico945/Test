package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        System.out.print(new PascalsTriangleII().getRow(6));
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<=rowIndex;i++)
        {
            result.add(0,1);
            for(int j = 1;j<result.size()-1;j++)
                result.set(j,result.get(j)+result.get(j+1));
        }
        return result;
    }
}
