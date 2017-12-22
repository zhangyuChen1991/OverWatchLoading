###OWLoading
---
>**OverWatchLoading,模仿守望先锋的加载动画效果**

**效果**

守望先锋效果:

![image](https://github.com/zhangyuChen1991/some_sources/blob/master/ow_show_1.gif)

demo效果:

![image](https://github.com/zhangyuChen1991/some_sources/blob/master/ow_loading_show_img1.gif)

**使用**
>这个小项目已经将loading浓缩成一个自定义view：OWLoadingView，只需要在需要的布局中正常引用指定宽高即可。
你可以下载这个项目，将该自定义view直接拷贝到你的项目中使用。

**API**
>* startAnim()　开始动画;
>* stopAnim()　中止动画;
>* setColor(int color)　设置填充的颜色;
>* setAutoStartAnim(boolean autoStartAnim)  设置是否自动开启动画;

**相关原理解析**
>效果实现的流程及原理分析请参考[这里](http://blog.csdn.net/chen_zhang_yu/article/details/53396801)

