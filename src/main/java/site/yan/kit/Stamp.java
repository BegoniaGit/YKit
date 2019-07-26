package site.yan.kit;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 * 信息输出戳
 * @Author zhaoxubin2016@live.com
 * @Date 10:13 19/07/10
 **/
public class Stamp {

    //控制台颜色常量
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd hh:mm:ss:SSSS");

    //获取当前系统时间
    public static String currentTime() {
        return simpleDateFormat.format(new Date());
    }


    //记录输出
    public static void log(String msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(String msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(String msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);

    }


    //记录输出
    public static void log(boolean msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(boolean msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(boolean msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);

    }

    //记录输出
    public static void log(double msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(double msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(double msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);

    }


    //记录输出
    public static void log(int msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(int msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(int msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);

    }


    //记录输出
    public static void log(char msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(char msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(char msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);

    }

    //记录输出
    public static void log(float msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(float msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(float msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);
    }

    //记录输出
    public static void log(Object msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_GREEN +
                "   INFO      " + ANSI_RESET + msg);
    }

    //错误输出
    public static void err(Object msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_RED +
                "   ERROR     " + ANSI_RESET + msg);
    }

    //警告输出
    public static void war(Object msg) {
        System.out.println(ANSI_RESET + currentTime() + ANSI_YELLOW +
                "   WARNING   " + ANSI_RESET + msg);
    }

}
