# AndroidFlowLayout
A flow layout for Android

samples
----

![](http://img02.taobaocdn.com/imgextra/i2/160310864/TB2MH8.bVXXXXa3XXXXXXXXXXXX_!!160310864.png)


dependencies
----

### gralde

```groovy
compile 'com.liangfeizc:flowlayout:1.0.0@aar'
```

### maven

```xml
<dependency>
    <groupId>com.liangfeizc</groupId>
    <artifactId>flowlayout</artifactId>
    <version>1.0.0</version>
    <type>aar</type>
</dependency>
```

usage
----

```xml
<com.liangfeizc.flowlayout.FlowLayout
    android:id="@+id/flow_layout"
    flowlayout:vertical_spacing="10dp"
    flowlayout:horizontal_spacing="10dp"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

tips
---

If you min sdk version is smaller than 16, you can add `<uses-sdk tools:overrideLibrary="com.liangfeizc.flowlayout" />` to your AndroidManifest.xml.
