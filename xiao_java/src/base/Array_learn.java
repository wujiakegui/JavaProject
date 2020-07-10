package base;


public class Array_learn {
    public static void main(String[] args) {
        // 数组定义，一维数组
        // 第一种  数组的定义  定义一个存储3个整数的容器
        int[] arr1 = new int[3];
        // 第二种  数组的定义
        int[] arr2 = new int[]{-2, 7, 6, -9, 4, 3, 3};
        // 第三种  数组的定义
        int[] arr3 = {2, 7, 6, 9, 4, 3, 3};

        // 数组定义，二维数组
        // 第一种  数组的定义
        int[][] arr4 = new int[3][5];
        // 第二种  数组的定义
        int[][] arr5 = new int[][]{{-2, 7, 6}, {-9, 4, 3, 3}};
        // 第三种  数组的定义
        int[][] arr6 = {{-2, 7, 6}, {-9, 4, 3, 3}};

        // 打印数组
        printArray(arr2);
        //获取数组中的最大值
        int max = getArrayMax(arr2);
        System.out.println(max);
        //获取数组中的最小值
        int min = getArrayMin(arr2);
        System.out.println(min);
        // 数组的排序之冒泡排序
        bubbleSort(arr2);
        printArray(arr2);
        // 数组的排序之插入排序
        insertSort(arr2);
        printArray(arr2);
        // 数组的排序之选择排序
        selectSort(arr2);
        printArray(arr2);
        // 数组的查找之折半查找
        // 因为折半查找要求数组必须有序，所以先进行排序
        selectSort(arr2);
        int m = halfSearch(arr2, 7);
        System.out.println(m);    // 返回查找的数组下标，如果没有找到返回-1
    }

    // 打印数组
    public static void printArray(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + "\t");
        }
        System.out.println();
    }

    // 获取数组中的最大值
    public static int getArrayMax(int[] y) {
        int max = y[0];
        for (int i = 0; i < y.length; i++) {
            if (y[i] > max) {
                max = y[i];
            }
        }
        return max;
    }

    //获取数组中的最小值
    public static int getArrayMin(int[] y) {
        int min = y[0];
        for (int i = 0; i < y.length; i++) {
            if (y[i] < min) {
                min = y[i];
            }
        }
        return min;
    }

    // 数组的排序之冒泡排序
    public static void bubbleSort(int[] y) {
        /**
         冒泡排序
         比较相邻的元素。如果第一个比第二个大，就交换他们两个。 [1]
         对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 [1]
         针对所有的元素重复以上的步骤，除了最后一个。 [1]
         持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
         **/
        int temp = 0;
        // 外层循环，它决定一共走几趟
        for (int i = 0; i < y.length - 1; ++i) {
            //内层循环，它决定每趟走一次
            for (int j = 0; j < y.length - i - 1; ++j) {
                //如果后一个大于前一个  	换位
                if (y[j + 1] < y[j]) {
                    temp = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                }
            }
        }
    }

    // 数组的排序之插入排序
    public static void insertSort(int y[]) {
        int i, j;
        for (i = 1; i < y.length; i++) {
            int temp = y[i];
            for (j = i; j > 0 && temp < y[j - 1]; j--) {
                y[j] = y[j - 1];
            }
            y[j] = temp;
        }
    }

    // 数组的排序之选择排序
    public static void selectSort(int y[]) {
        int temp = 0;
        for (int i = 0; i < y.length - 1; i++) {
            // 认为目前的数就是最小的, 记录最小数的下标
            int minIndex = i;
            for (int j = i + 1; j < y.length; j++) {
                if (y[minIndex] > y[j]) {
                    // 修改最小值的下标
                    minIndex = j;
                }
            }
            // 当退出for就找到这次的最小值
            if (i != minIndex) {
                temp = y[i];
                y[i] = y[minIndex];
                y[minIndex] = temp;
            }
        }
    }

    // 数组的查找之折半查找
    public static int halfSearch(int[] arr, int target) {
        //定义三个变量分别记录最大、最小、中间的查找范围索引值
        int max = arr.length - 1;
        int min = 0;
        int mid = (max + min) / 2;
        while (true) {
            if (target < arr[mid]) {        //如果目标元素小于中点元素
                max = mid - 1;            //max向mid前移动
            } else if (target > arr[mid]) { //如果目标元素大于中点元素
                min = mid + 1;            //min向mid后移动
            } else {
                return mid;                //找到目标元素
            }
            //没有找到的情况
            if (max < min) {
                return -1;
            }
            //重新计算中间索引值
            mid = (max + min) / 2;
        }
    }
}
