package com.scala.learn

/**
  * Created by jpwu on 2017/4/20.
  *
  * 模式匹配
  * 正则
  * 异常处理
  */
object day05 {

  //模式匹配
  def matchTest(x:Int):String= x match {
    case 1=> "a"
    case 2=> "b"
    case _=> "many"
  }

  println(matchTest(3))

  //正则
  val pattern="s".r
  val str="scala is xxsx"
  println(pattern findFirstIn str)
  println((pattern findAllIn  str).mkString(","))

  //异常
  try{
   val a= 1/0
  }catch {
    case ex: Exception=>{
      println("error:" + ex.getMessage)
    }
  }finally {
    println("exiting finally...")
  }

}
