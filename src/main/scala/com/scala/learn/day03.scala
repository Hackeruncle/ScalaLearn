package com.scala.learn

/**
  * Created by jpwu on 2017/4/20.
  * 字符串的函数 http://www.yiibai.com/scala/scala_strings.html
  * 格式化字符串
  * 数组   要导入Array._包
  * 集合
  */
object day03 {
  def main(args: Array[String]): Unit = {

  }
  //字符串的函数
  var s="Abc"
  println(s.toLowerCase())
  println(s.concat("123"))

  //格式化字符串
  var floatVar = 12.456
  var intVar = 2000
  var stringVar = "Hello, Scala!"
  var fs = printf("The value of the float variable is " +
    "%f, while the value of the integer " +
    "variable is %d, and the string " +
    "is %s", floatVar, intVar, stringVar)
  println(fs)


  //数组定义
  var z1 = new Array[String](3)
  var z2:Array[String] = new Array[String](3)
  var z3=Array("a","b","c")
  z1(0)="a"
  println(z1(0))

  //多维数组
  import Array._
  var myMatrix = ofDim[Int](3,3)

  //联接数组
  import Array._
  var myList1 = Array(1,2,3)
  var myList2 = Array(4,5,6)
  var myList3 = concat(myList1,myList2)
  for(x <- myList3){
    println(x)
  }

  //具有范围的数组
  import Array._
  var myList4= range(1,10)
  var myList5= range(1,10,2)


  //集合
  val x1= List(1,2,3,4)
  println(x1.head)
  println(x1.tail)
  println(x1.isEmpty)
  println(x1.reverse)

  val x2= Set(1,2,3,4)
  val x3=Map("one"->1,"two"->2)
  x3.get("one")
  x3.get("11")

  val x4=(10,"scala")
  val x5:Option[Int]= Some(5)



 //元组 元组可以容纳不同类型的对象，但它们也是不可改变的。
  val t=(1,"abc")
  println(t._1)
  println(t._2)
  println(t.toString())
  println(t.swap)


  //Tuple.productIterator()方法来遍历一个元组的所有元素
  t.productIterator.foreach{
    i => println("value:"+i)
  }



  //scala getOrElse的坑 http://m.blog.csdn.net/article/details?id=52441277
  //Some[A] some是一定有值的, some.get获取值，如果没有值， 会报异常. Predef.NoSuchElementException   if the option is empty.
  val a = Some(2)
  println(a.get)

  //getOrElse()来访问值或使用默认值
  val get1 = a.getOrElse(4)
  val get2 = a.getOrElse("abc")

  //迭代器
  val it = Iterator(1,2,3)
  while(it.hasNext){
    println(it.next())
  }


  val ita = Iterator(20,40,2,50,69, 90)
  val itb = Iterator(20,40,2,50,69, 90)
  println("Maximum valued element " + ita.max )
  println("Minimum valued element " + itb.min )

}

