# 关于文言文编程语言的变量

> 类型

|类型|解释|字面量例子|
|---|---|---|
|`數`|`number`类型，数字类型，可以是浮点型或者整型|`三千二百零一`，`二〇二〇`|
|`言`|`string`类型，是字符串类型，可以是空字符串|`『予观夫巴陵胜状』`，`「「君子好逑」」`
|`爻`|`boolean`类型，是布尔类型，只有两个值|`陰`，`陽`|
|`列`|`array`类型，是数组类型|`...`|
|`物`|`object`类型，定义对象|`...`|
|`元`|`auto type`,可以反推类型|`...`|

> 声明变量的表达式

通用表达式:

吾有\[N\]\[type\]。曰\[value1\]。曰\[value2\]...曰\[valueN\]。名之曰\[name1\]曰\[name2\]....\[nameN\]

###### 通用例子 

1. 數 言 爻
    * 今/吾有一數/言/爻，曰三/「「问天地好在」」/陰，名之曰「甲」
    * 吾有三數。曰一。曰三。曰五。名之曰「甲」曰「乙」曰「丙」。
2. 元
    * 今/吾有一元，曰三/「「问天地好在」」/陰，名之曰「甲」
3. 列
    * 今/吾有一列，曰「甲」。充「甲」以四。以二。
4. 物
    * 今/吾有一物。名之曰「甲」。其物如是。物之「「乙」」者。數曰三。物之「「丙」」者。言曰「「丁」」。是謂「甲」之物也

PS: 今关键字在javascript编译器中是编译为var name = this.name = value,java版编译器暂时没有做处理

###### 简化写法

有\[type\]\[value\]。名之曰\[name\]

有數五十。名之曰「大衍」。

> 替换

昔之\[before\]，今\[after\]是也/矣

译作: before = after

PS: `也`一般作为`若非`和`若....者`的结束标志，如果不结束代码块，请使用`矣`

> 其他

您可以可以在初始化的时候使用其他变量，如

吾有一數，曰「甲」，名之曰「乙」

译作: var 乙 = 甲;



