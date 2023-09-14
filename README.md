# 欢迎使用在与有的开源作业库
***
## 库简介：
本库是一个分享关于JavaWeb课程实践内容的项目
***
## 食用方式：


打开 src 文件夹即可食用<br>
"src/main/java" 里面是java文件<br>
"src/main/webapp" 就是你知道的那个webapp文件夹<br>

**如果需要运行和测试，则运行java文件即可，第一次运行需要编辑IDEA的"运行/调试 配置"**<br>
**在 "运行/调试 配置" 界面 内点击左上角的 "+" 添加 Tomcat 本地服务器**<br>
**点击之后先不要着急应用配置，还需要点击右下角的 "修复" 按钮，并且配置运行工件(war或者war_exploded都可以)**<br>
<br>
**给IDEA添加和配置 Tomcat 的方式请自行百度**<br>

***
## web目录须知
**以com.example.HelloServlet为例**<br>
如果你直接在 IDEA 中使用 Run/Debug<br>
跳转到的的并不是你在 web.xml 中配置的HelloServlet的页面路径<br>
而是 index.jsp 所在的根页面<br>
<br>
***具体是哪个页面与你运行时配置Tomcat模式有关，如果是war模式就是第一个，如果是war_exploded模式就是第二个，不过运行之后会自动跳转到根页面，所以不用担心*** <br>
~~~
http://localhost:8080/Gradle___com_example___JavaWebExample_1_0_SNAPSHOT_war/ 
http://localhost:8080/Gradle___com_example___JavaWebExample_1_0_SNAPSHOT_war__exploded_/ 
~~~
如果需要访问在 web.xml 中配置好的页面路径，可以直接在这个根路径后面添加相对路径即可访问指定页面