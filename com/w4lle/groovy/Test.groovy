package com.w4lle.groovy


class Test{
  String name
  String title

  Test(name,title){
    this.name = name
    this.title = title
  }

  def print(){
    println name + " " + title
  }
}
