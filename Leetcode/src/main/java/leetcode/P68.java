package leetcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-05-23 16:24
 * @Description:
 */
public class P68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jkp\\Desktop\\test.user_info.sql"));
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jkp\\Desktop\\test.user_info.sql"));
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
