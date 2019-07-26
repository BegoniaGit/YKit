<H1>YKit</H1>
<p align="center">
  <img alt="GitHub release" src="https://img.shields.io/badge/java-%3E%3D1.8-blue">
<a href="https://github.com/BegoniaGit/YKit/blob/master/LICENSE"><img alt="GitHub license" src="https://img.shields.io/github/license/BegoniaGit/YKit"></a>
</p>

## 说明文档
> 打印戳 Stamp  可代替System.out.print()
1. 打印一个字符串
```java
Stamp.log("一枝红艳露凝香");

//output
07-26 10:18:21:0893   INFO      一枝红艳露凝香
```
一共有三种模式：
- Stamp.log() 输出 INFO[绿色]
- Stamp.err() 输出 WAR[黄色]
- Stamp.log() 输出 ERR[红色]


> Papers 文件写入与读取封装  简单的文件写入和读取不再需要书写繁杂的IO流操作代码
1. 写入文本
```java

//创建一个Papers对象
Papers papers=new Papers("C:\\Users\\Think\\Desktop\\log.txt", Papers.Method.WRITE);

//写后换行
papers.writeLn("云想衣裳花想容，春风拂槛露华浓。");
//写后不换行
papers.write("若非群玉山头见，曾向瑶台月下逢。");

//写完最后必须执行此句一次性写向文件
papers.writeStop();

```
2. 读取文本
```java
Papers papers = new Papers("C:\\Users\\Think\\Desktop\\log.txt", Papers.Method.READ);

//按行读取
String result = papers.readLine();

//按行读最后必须关闭流
papers.readStop();

Stamp.log(result);

```
也可以使用papers.readAll()全部读取，也会自动关闭流


