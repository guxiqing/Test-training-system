# 课程设计目的
#   标准化试题训练系统——开发文档
##   一、课程设计目的
-----------
    1、加深对《Java语言与面向对象技术》课程基础知识的理解，掌握Java语言面向对象程序设计的开发方法和步骤;
    2、 提高学生科技论文写作能力,规范完成课程设计报告。

# 设计要求
##   二、设计要求
-------

    设计GUI界面的标准化试题训练系统。具体要求如下:

    为了达到反复训练的目的，用户提交试卷后可以继续让程序再出一套试卷。

# 数据模型

##   三、数据模型
--------
    根据系统设计要求在数据模型部分设计了Excel表，编写了有关的类。
    
    创建Excel工作簿。


        TeacherOne类:实现Teacher接口，其实例负责阅卷。数据模型部分涉及的主要类的UML图如图所示。

    ## Excel 工作簿
##   四、Excel 工作簿

        Excel工作簿在存储数据方面有着广泛的应用(它不是数据库)，其中的Sheet 表的结和数据库中的表类似。
        JDBC没有提供操作Excel 工作簿的API.为了操作Excel工作簿，需要额外下载操作Excel的API。

            该默认图像的名字固定为havenot.jpg.另外，程序还需要-一个名字是renew.jpg的图像，
            当用户重新选择试卷时用该图像友好地提示用户,因此必须将havenotjpg和renew.jpg 图像保存到“图像管理”文件夹中(图像的外观可自己指定)。
            havenot.jpg 和renew.jpg 图像如图所示。
##   五、GUI程序
        按照要求将源文件中的包语句将相关的源文件保存到以下目录中：D:\ch5\view\进行编译操作
        根据代码的结构需要把“题库”的文件夹（存放 Excel工作簿）以及“图像管理”文件夹（存放所需要的图像文件）
        存放在D：下，即保持和ch5是同级
        运行AppWindow类
##   六、程序发布

###   1 、清单文件
   编写以下清单文件（用记事本保存时需要将保存类型选择为“所有文件（*.*）”）:  
   ch5.mf  
   Manifest-Version:1.0  
   Main-Class:ch1.gui.AppWindow  
   Created-By:1.8  
   将ch5.mf保存到D\:,即保存在包名所代表的目录的上一层目录中。  
###   2 、用批处理文件发布程序  
   在命令行中使用jar命令得到JAR文件：    
  D:\>jar cfm TestTrain.jar ch5.mf ch5/data/*.class ch5iew/*.class ch5/gui/*.class 

  其中，参数c表示要生成一个新的JRA文件，f表示要生成的JAR文件的名字，m表示清单文件的名字。
  如果没有任何错误提示，在D:\下将产生一个名字是TestTrain.jar的文件。    
  编写以下train.bat，用记事本保存该文件时需要将保存类型选择为“所有文件(*.*)”。  
  train.bat  
  path.\jre\bin  
  pause  
  javaw -jar TestTrain.jar    
  将文件保存到自己命名的某个文件夹中，例如名字是2000的文件夹中。然后将TestTrain、“题库”和“图像管理”文件夹以及JRE复制到2000文件夹中。在2000文件夹中   再保存一个软件运行说明书，提示双击train.bat即可运行程序。  
  可以将2000文件夹作为软件发布，也可以用压缩工具将2000文件夹下所有的文件压缩成.zip或.jar发布。用户解压后双击animalGame.bat即可运行。  
  如果客户的计算机上有JRE，可以不把JRE复制到2000文件夹中，同时去除。bat文件中的“path.\jre\bin”内容。
