package demos;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-04-05 21:12
 * @Description:
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][][] cube = new int[n][n][n];
//        int max = 0;
//        int x=0, y=0, z=0;
//        for(int i = 0; i < n*n*n; i++){
//            int x1 = sc.nextInt();
//            int y1 = sc.nextInt();
//            int z1 = sc.nextInt();
//            int e = sc.nextInt();
//            if(e > max){
//                x = x1;
//                y = y1;
//                z = z1;
//            }
//            cube[x1][y1][z1] = e;
//        }
        System.out.println(1&1&2&2&3&6);
//        int[][][] cube = {{{1,2,3},{4,5,6}, {7,8,9}},{{10,11,12},{13,14,13}, {12,11,10}},{{9,8,7},{6,5,4}, {3,2,1}}};
//        System.out.println(visit(cube, 1, 1, 1));
    }

    //找出从立方某位置开始最大路径
    private static int maxEng = 0;
    public static int visit(int[][][] cube, int x, int y, int z) {
        int xLen = cube.length;
        int yLen = cube[0].length;
        int zLen = cube[0][0].length;
        boolean[][][] visited = new boolean[xLen][yLen][zLen];
        //visitedHelper(cube, visited, x, y, z, cube[x][y][z]);
        visited[x][y][z] = true;
        if(!canotVisit(cube, visited, x+1, y, z)){
            visitedHelper(cube, visited, x+1, y, z, cube[x][y][z]);
        }
        if(!canotVisit(cube, visited, x-1, y, z)){
            visitedHelper(cube, visited, x-1, y, z, cube[x][y][z]);
        }
        if(!canotVisit(cube, visited, x, y+1, z)){
            visitedHelper(cube, visited, x, y+1, z, cube[x][y][z]);
        }
        if(!canotVisit(cube, visited, x, y-1, z)){
            visitedHelper(cube, visited, x, y-1, z, cube[x][y][z]);
        }
        if(!canotVisit(cube, visited, x, y, z+1)){
            visitedHelper(cube, visited, x, y, z+1, cube[x][y][z]);
        }
        if(!canotVisit(cube, visited, x, y, z-1)){
            visitedHelper(cube, visited, x, y, z-1, cube[x][y][z]);
        }

        return maxEng;
    }

    private static void visitedHelper(int[][][] cube, boolean[][][] visited, int x, int y, int z, int currentEng) {
        currentEng += cube[x][y][z];
        if(canotVisit(cube, visited, x+1, y, z) && canotVisit(cube, visited, x-1, y, z)
                &&canotVisit(cube, visited, x, y+1, z) && canotVisit(cube, visited, x, y-1, z)
                && canotVisit(cube, visited, x, y, z+1) && canotVisit(cube, visited, x, y, z-1)){
            if(currentEng > maxEng) {
                maxEng = currentEng;
            }
            return;
        }
        visited[x][y][z] = true;
        if(!canotVisit(cube, visited, x+1, y, z) && cube[x][y][z] > cube[x+1][y][z]){
            visitedHelper(cube, visited, x+1, y, z, currentEng);
        }
        if(!canotVisit(cube, visited, x-1, y, z) && cube[x][y][z] > cube[x-1][y][z]){
            visitedHelper(cube, visited, x-1, y, z, currentEng);
        }
        if(!canotVisit(cube, visited, x, y+1, z) && cube[x][y][z] > cube[x][y+1][z]){
            visitedHelper(cube, visited, x, y+1, z, currentEng);
        }
        if(!canotVisit(cube, visited, x, y-1, z) && cube[x][y][z] > cube[x][y-1][z]){
            visitedHelper(cube, visited, x, y-1, z, currentEng);
        }
        if(!canotVisit(cube, visited, x, y, z+1) && cube[x][y][z] > cube[x][y][z+1]){
            visitedHelper(cube, visited, x, y, z+1, currentEng);
        }
        if(!canotVisit(cube, visited, x, y, z-1) && cube[x][y][z] > cube[x][y][z-1]){
            visitedHelper(cube, visited, x, y, z-1, currentEng);
        }
        //currentEng -= cube[x][y][z];
        visited[x][y][z] = false;
    }

    private static  boolean canotVisit(int[][][] cube, boolean[][][] visited, int x, int y, int z) {

        int xLen = cube.length;
        int yLen = cube[0].length;
        int zLen = cube[0][0].length;
        if(x >= xLen || x < 0 || y >= yLen || y < 0 || z >= zLen || z < 0 ){
            return true;
        }
        if(visited[x][y][z]){
            return true;
        }
        return false;
    }
}
