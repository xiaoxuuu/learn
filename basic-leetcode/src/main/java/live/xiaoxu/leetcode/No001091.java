package live.xiaoxu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p><a href="https://leetcode.cn/problems/shortest-path-in-binary-matrix/">1091. 二进制矩阵中的最短路径</a></p>
 *
 * @author 小徐
 * @since 2023/5/26 11:19
 */
public class No001091 {

    /**
     * <p>起点终点为 1 则返回 -1</p>
     * <p></p>
     *
     * @param grid 矩阵
     * @return 最短深度
     */
    public int shortestPathBinaryMatrix(int[][] grid) {

        // 周围方块搜索优先级
        int[][] search = {{1, 1}, {1, 0}, {0, 1}, {-1, 1}, {1, -1}, {-1, 0}, {0, -1}, {-1, -1}};

        // 路径起点和结尾存在 1
        int length = grid.length;
        if (grid[0][0] == 1 || grid[length - 1][length - 1] == 1) {
            return -1;
        }
        if (length == 1) {
            return 1;
        }
        // 搜索队列
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        // 走过的标记为 1
        grid[0][0] = 1;
        // 深度
        int depth = 1;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                // 取出第一个数据并将其从队列移除
                int[] poll = queue.poll();
                // 搜索此方块周围方块
                for (int[] ints : search) {
                    int x = poll[0] + ints[0];
                    int y = poll[1] + ints[1];
                    if (x < 0 || x > length - 1 || y < 0 || y > length - 1 || grid[x][y] != 0) {
                        continue;
                    }
                    if (x == length - 1 && y == length - 1) {
                        return depth;
                    }
                    queue.add(new int[]{x, y});
                    // 走过的标记为 1
                    grid[x][y] = 1;
                }
            }
        }
        return -1;
    }
}