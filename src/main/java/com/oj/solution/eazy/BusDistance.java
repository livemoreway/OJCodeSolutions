package com.oj.solution.eazy;

/**
 * Author: zz
 * Date: 2020/5/11
 * Description:
 * 环形公交路线上有 n 个站，按次序从 0 到 n - 1 进行编号。我们已知每一对相邻公交站之间的距离，distance[i] 表示编号为 i 的车站和编号为 (i + 1) % n 的车站之间的距离。
 *
 * 环线上的公交车都可以按顺时针和逆时针的方向行驶。
 *
 * 返回乘客从出发点 start 到目的地 destination 之间的最短距离。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distance-between-bus-stops
 *
 * 输入：distance = [1,2,3,4], start = 0, destination = 2
 * 输出：3
 * 解释：公交站 0 和 2 之间的距离是 3 或 7，最小值是 3。
 */
public class BusDistance {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int totalA = 0;
        int totalB = 0;
        if(start > destination) {
            int b = 0;
            b = destination;
            destination = start;
            start = b;
        }
        for(int i = 0;i < distance.length; i++) {
            if(i >= start && i < destination) {
                totalA += distance[i];
            } else{
                totalB += distance[i];
            }
        }
        return totalA > totalB ? totalB:totalA;
    }
}
