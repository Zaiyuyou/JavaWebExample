# 欢迎使用在与有的开源作业库
***
## 库简介：
本库是一个分享关于JavaWeb课程实践内容的项目
***
## 食用方式：

~~~
*打开 src 文件夹即可食用*
"src/main/java" 里面是java文件
"src/main/webapp" 就是你知道的那个webapp文件夹
~~~

以com.example.HelloServlet为例<br>
如果你直接在 IDEA 中使用 Run/Debug<br>
跳转到的的并不是你在 web.xml 中配置的HelloServlet的页面路径<br>
而是 index.jsp 所在的根页面: http://localhost:8080/Gradle___com_example___JavaWebExample_1_0_SNAPSHOT_war <br>
如果需要访问在 web.xml 中配置好的页面路径，可以直接在这个根路径后面添加相对路径即可访问指定页面