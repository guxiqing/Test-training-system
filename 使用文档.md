# 使用要求

## 设计GUI界面的标准化试题训练系统。  
具体要求如下： Microsoft Excel ① 使用 工作簿存放标准化试题，形成题库。   
② 程序每次从题库随机抽取若干道题目形成一张试卷，用户可以依次做试卷上的题目， 允许用户向前、向后翻阅试卷上的题目。  
③ 用户每次做完一个题目必须确定该题目的答案，否则无效。 15   
④ 有计时功能，比如指定一张试卷限用时 分钟，时间一到用户再无法答题，提示用 户提交试卷。  
gui部分设计的类uml关系图如下所示  



![image](https://github.com/guxiqing/Test-training-system/blob/master/uml%E5%85%B3%E7%B3%BB%E5%9B%BE.png)  
## 视图相关的类  
Testpaperview类是jpanel类的子类，实例提供了试卷的试图，用户可以在该视图看见试卷的内容并进行答题  
根据试卷的时间进行计时
如下图所示  

![image](https://github.com/guxiqing/Test-training-system/blob/master/%E6%B5%8B%E8%AF%95.png)  
显示图像对话框ShowImageDialog类如下  :


![image](https://github.com/guxiqing/Test-training-system/blob/master/%E5%9B%BE%E5%83%8F%E5%AF%B9%E8%AF%9D%E6%A1%86.png)  

# 程序发布  
用户使用jar.exe命令制作jar文件发布软件

程序运行的效果图入下所示。  

![image](https://github.com/guxiqing/Test-training-system/blob/master/%E5%BC%80%E5%8F%91%E7%A8%8B%E5%BA%8F.png)  
