package site.yan.kit;

import java.io.*;

/**
 * 字符文件操作
 *
 * @Author zhaoxubin2016@live.com
 * @Date 14:08 19/07/19
 **/
public class Papers {

    protected File file;
    protected FileReader fileReader;
    protected FileWriter fileWriter;

    protected BufferedReader bufferedReader;
    protected StringBuilder fileText;

    protected Method method;

    protected enum Method {
        WRITE,
        READ,
    }

    //初始画流
    protected void init() {

        try {
            switch (method) {
                case WRITE:
                    fileWriter = new FileWriter(file);
                    break;
                case READ:
                    fileReader = new FileReader(file);
                    break;
                default:
                    throw new Exception("File operation mode parameter error");
            }
            fileText = new StringBuilder();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Papers(File file, Method method) {

        this.file = file;
        this.method = method;
        init();
    }


    public Papers(String path, Method method) {
        file = new File(path);
        this.method = method;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        init();
    }

    //写入且换行
    public void writeln(String rowText) {

        fileText.append(rowText + "\n");
    }


    //写入
    public void write(String text) {

        fileText.append(text);
    }


    //按行读取
    public String readLine() {

        if (bufferedReader == null)
            bufferedReader = new BufferedReader(fileReader);

        String text = "";
        try {
            text = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }


    //读取所有字符
    public String readAll() {

        StringBuilder stringBuilder = new StringBuilder();
        String temp = "";
        while (!"".equals(temp = readLine()))
            stringBuilder.append(temp);
        readStop();
        return stringBuilder.toString();
    }


    //停止写入流
    public void writeStop() {

        String text = fileText.toString();
        try {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        close();
    }

    //停止读入流
    public void readStop() {
        close();
    }

    //关闭流
    protected void close() {

        try {
            if (fileReader != null)
                fileReader.close();
            if (fileWriter != null)
                fileWriter.close();
            if (bufferedReader != null)
                bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
