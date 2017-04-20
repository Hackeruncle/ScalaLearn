package com.scala.learn

/**
  * Created by jpwu on 2017/4/20.
  *
  * 类
  */
class day04(val xc:Int,val yc:Int) {
  var x=xc
  var y=yc
  def sum(dx:Int,dy:Int): Unit ={
    println(x+dx)
    println(y+dy)

  }

}

object test{

  def main(args: Array[String]): Unit = {
    val s= new day04(10,20)
    s.sum(10,10)
  }
}


