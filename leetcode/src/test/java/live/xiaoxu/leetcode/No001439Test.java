package live.xiaoxu.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No001439Test {

    @Test
    void kthSmallest() {

        No001439_hard n1439 = new No001439_hard();

        int[][] intArray12 = {
                {1, 10, 10},
                {1, 4, 5},
                {2, 3, 6}};
        Assertions.assertEquals(16, n1439.kthSmallest(intArray12, 14));

        Assertions.assertEquals(9, n1439.kthSmallest(new int[][]{{1, 10, 10}, {1, 4, 5}, {2, 3, 6}}, 7));
        Assertions.assertEquals(7, n1439.kthSmallest(new int[][]{{1, 3, 11}, {2, 4, 6}}, 5));
        Assertions.assertEquals(17, n1439.kthSmallest(new int[][]{{1, 3, 11}, {2, 4, 6}}, 9));
        Assertions.assertEquals(12, n1439.kthSmallest(new int[][]{{1, 1, 10}, {2, 2, 9}}, 7));

        int[][] intArray0 = {{5, 12, 29, 40, 85, 96, 99}, {37, 37, 40, 45, 72, 86, 91}, {4, 43, 50, 63, 76, 93, 100},
                {45, 56, 69, 90, 91, 93, 94}, {4, 6, 24, 51, 60, 76, 88}, {1, 14, 29, 52, 62, 95, 96}, {19, 47, 49, 54, 66, 68, 72},
                {24, 25, 59, 60, 82, 92, 96}, {10, 25, 29, 38, 56, 91, 96}, {12, 29, 36, 65, 69, 79, 98}};
        Assertions.assertEquals(177, n1439.kthSmallest(intArray0, 50));

        int[][] intArray1 = {{28, 28, 63, 108, 119, 173, 178, 179, 187, 246, 373, 440, 470, 501, 551, 592, 763, 832, 913},
                {111, 131, 148, 220, 225, 255, 270, 363, 428, 478, 602, 633, 657, 666, 682, 775, 810, 906, 948},
                {14, 101, 263, 279, 311, 313, 316, 316, 393, 397, 423, 483, 539, 763, 772, 830, 911, 963, 966},
                {19, 30, 163, 178, 251, 257, 264, 268, 531, 606, 735, 820, 821, 824, 828, 858, 924, 986, 989},
                {54, 56, 149, 184, 205, 274, 407, 423, 489, 508, 565, 582, 689, 722, 826, 950, 961, 987, 992},
                {3, 4, 52, 84, 108, 241, 351, 357, 370, 544, 665, 679, 750, 785, 813, 876, 878, 881, 955},
                {58, 75, 85, 91, 189, 324, 338, 504, 518, 593, 606, 663, 663, 665, 722, 754, 838, 842, 920},
                {7, 8, 53, 74, 134, 137, 157, 231, 296, 540, 558, 559, 680, 719, 757, 786, 886, 925, 942},
                {71, 89, 108, 181, 217, 545, 561, 598, 604, 701, 795, 828, 891, 894, 909, 924, 952, 959, 993},
                {135, 176, 185, 195, 208, 217, 252, 310, 324, 368, 533, 572, 611, 642, 650, 719, 772, 926, 942},
                {43, 54, 63, 104, 155, 204, 224, 250, 336, 392, 506, 536, 545, 718, 732, 854, 909, 947, 967},
                {33, 37, 239, 292, 333, 356, 431, 473, 478, 595, 651, 657, 707, 730, 763, 783, 849, 881, 916},
                {6, 18, 21, 141, 191, 197, 282, 320, 361, 398, 413, 461, 477, 503, 541, 600, 636, 681, 873},
                {63, 115, 156, 227, 270, 297, 303, 324, 493, 524, 567, 703, 795, 812, 899, 904, 926, 928, 940},
                {53, 60, 75, 249, 259, 344, 415, 419, 421, 432, 528, 662, 693, 731, 738, 766, 849, 872, 901},
                {32, 65, 137, 179, 238, 243, 259, 278, 302, 507, 682, 707, 718, 750, 757, 783, 820, 841, 957},
                {94, 164, 166, 198, 230, 255, 302, 461, 585, 613, 615, 628, 630, 757, 773, 857, 877, 984, 991},
                {58, 78, 84, 87, 91, 262, 281, 348, 367, 389, 532, 533, 671, 748, 791, 811, 837, 977, 979},
                {112, 165, 281, 330, 331, 519, 532, 543, 548, 602, 615, 673, 795, 818, 851, 867, 884, 908, 977},
                {14, 47, 58, 139, 178, 182, 247, 247, 414, 429, 454, 461, 530, 552, 618, 642, 801, 830, 997},
                {12, 39, 105, 147, 163, 229, 263, 401, 456, 499, 592, 616, 708, 712, 744, 753, 881, 888, 925},
                {20, 235, 264, 277, 291, 367, 386, 390, 482, 488, 585, 605, 736, 756, 872, 883, 917, 923, 957}};
        Assertions.assertEquals(1052, n1439.kthSmallest(intArray1, 68));
    }
}