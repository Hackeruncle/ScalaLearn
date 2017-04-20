package com.scala.learn

import java.util.concurrent.atomic.DoubleAccumulator

/**
  * Created by jpwu on 2017/4/20.
  *
  * 函数
  */
object day02 {

  def main(args: Array[String]): Unit = {

  }
  //定义函数:返回值
  def addInt(a:Int,b:Int):Int={
    var sum=0
    sum=a+b
    return sum
  }
  addInt(1,2)

  //定义函数：无返回值，则为过程
  def printMe():Unit={
    println("no return value,the same as void")
  }
  printMe()

 //函数按名次调用
  def time()={
    println("getting time")
    System.nanoTime()
  }

  def delayed( t: => Long )={
    println("in delayed method")
    print ("param:"+t)
  }

  delayed(time())

  //函数使用命名参数
  def printInt(a:Int,b:Int):Unit={
    println("a:"+a)
    println("b:"+b)
  }
  printInt(1,2)
  printInt(b=2,a=1)

  //递归函数
  def factorial(n:BigInt) : BigInt={
    var s:BigInt=0
    if(n<=1){
      s=1
    }else{
      s=n*factorial(n-1)
    }
    return s
  }

  for(i<- 1 to 10){
    println("Factorial of "+i+" := "+factorial(i))
  }

  //使用可变参数
  def printStrings(args:String*)={
    var i=0
    for(arg<- args){
      println("arg value["+i+"]="+arg)
      i=i+1
    }
  }
  printStrings("a","b","c")


  //默认参数值
  def addInt2(a:Int=1,b:Int=2): Int={
    return a+b

  }
  addInt2()
  addInt2(4,5)

//高级函数
  def apply(f:Int => String,v:Int)=f(v)
  def layout[A](x:A)="["+x.toString+"]"
  println(apply(layout,10))

//匿名函数
  var inc=(x:Int)=>x+1
  var x=inc(1)+1

  var mul=(x:Int,y:Int)=>x*y
  println(mul(1,2))

  //无参数定义匿名函数
  var userDir=()=>{System.getProperty("user.dir")}
  println(userDir)

  //柯里函数 接受多个参数成一条链的函数，名次取一个参数
  def strcat1(s1:String)(s2:String)=s1+s2
  def strcat2(s1:String)=(s2:String)=>s1+s2
  def strcat3(s1:String)(s2:String)={
    s1+s2
  }
  strcat1("foo")("ccc")

  //嵌套函数
  def fact1(i:Int):Int= {
    def fact2(i: Int, accumulator: Int): Int = {
      if (i <= 1) {
        accumulator
      } else {
        println("a")
        fact2(i - 1, i * accumulator)
      }
    }
    fact2(i,1)
  }
  //4: 4*3*2*1
  println(fact1(4))



  println(fact1(0))
  println(fact1(1))
  println(fact1(2))
  println(fact1(3))





}
