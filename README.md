# AndroidFlowLayout
Android 流式布局。

### 本应用的示例

![image](https://github.com/iWay7/AndroidFlowLayout/blob/master/sample.gif)   

### 简单的集成方式

#### 第一步：在你的项目 build.gradle 添加 maven 库：
```
allprojects {
    repositories {
        ...
        maven { url 'https://www.jitpack.io' }
    }
}
```

#### 第二步：在你的模块 build.gradle 添加依赖库：
```
dependencies {
    ...
    api 'com.github.iWay7:AndroidHelpers:1.0.4'
}
```

#### 然后就可以开心的使用啦：
##### 在布局文件中声明一个 FlowLayout 视图，以 addView(...) 方式添加视图：
```
<site.iway.androidhelpers.FlowLayout
    android:id="@+id/flow_layout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="8dp"
    app:horizontalSpacing="8dp"
    app:lineAlignment="bottomBottom"
    app:verticalSpacing="8dp" />
```

##### 或者直接类似于这样编写在 xml 之中：
```
<site.iway.androidhelpers.FlowLayout
    android:id="@+id/flow_layout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="8dp"
    app:horizontalSpacing="8dp"
    app:lineAlignment="bottomBottom"
    app:verticalSpacing="8dp" >
    
    <View
        android:layout_width="50dp"
        android:layout_height="60dp"
        android:background="@color/red"/>

    <View
        android:layout_width="30dp"
        android:layout_height="50dp"
        android:background="@color/green"/>

    <View
        android:layout_width="40dp"
        android:layout_height="60dp"
        android:background="@color/blue"/>
    
</site.iway.androidhelpers.FlowLayout>
```

##### 目前支持以下属性：
```
app:horizontalSpacing 配置水平方向上 View 的间距
app:lineAlignment 配置一行子视图垂直方向上的对其方式
app:verticalSpacing 配置行间距
app:enableTouchSelect 配置是否启用触摸选择模式，该模式改变子视图的 selected 属性
app:multipleSelectMode 配置触摸选择模式为 true 多选，或者 false 为单选
```