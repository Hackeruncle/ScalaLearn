package com.scala.learn

import scala.util.control.Breaks._

/**
  * Created by jpwu on 2017/4/19.
    http://www.yiibai.com/scala/
    https://yq.aliyun.com/topic/69
    IDEA scala console:
    http://confluence.jetbrains.com/display/IntelliJIDEA/Working+with+Scala+Console

  * 数据类型 Int Double Char String Boolean
  * 变量  var val
  * 控制结构 if while  do...while for
  * break
  */
object day01 {
  def main(args: Array[String]): Unit = {

  }
    //数据类型 Int Double Char String Boolean
    val x1=1
    val x2=0.8
    val x3='a'
    val x4="abc"
    val x5=true
    val x6="\"abc\""

    //对于大量转义字符及换行的字符串可以使用三个双引号
    val stringSample1 = """Welcome to
                                       Scala, "Hello World" """

    //我们可能需要左对齐，可以使用|进行对其，例如：
    val stringSample2 = """Welcome to
                                       |Scala, "Hello World" """

    //两种变量: var（可变的变量）,val(不可变的变量)
    var myVar="abc"
    myVar="bcd"

    val myVal="abc"
    //myVal="bcd"

    //if else
    var x=20;
    if(x>30){
      x=50
      println(x);
    }else{
      x=10
      println(x);
    }

    //while 它会在无限循环可以通过按Ctrl+ C键终止
    while(true){
      println("hello!")
    }

    //do while
    var a=1;
    do{
      println(a)
      a=a+1
    }while(a<20)

    //for  to是包含 until是不包含
    var b1=0;
    for(b1<- 1 to 10){
      println("value:"+b1)
    }
    var b2=0
    for(b2<- 1 until 10){
      println("value:"+b2)
    }

    //break() 方法
    var b3=0
    for(b3<- 1 until 10){
      println("value"+b3)
      if(b3>5){
       break()
      }
    }
    //其实就是breakable的范围大小，在循环内，就是continue，在循环外就是break
    //break
    breakable{
      for(i<-1 to 10){
        if (i==2) break() else println(i)
      }
    }
    //continue
    for(i<-1 to 10){
      breakable{
        if (i==2) break() else println(i)
      }

    }


}
