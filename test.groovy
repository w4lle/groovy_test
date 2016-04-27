import com.w4lle.groovy.Test
import groovy.transform.Field

println "hello world!!"
def test = new Test("w4lle", "is handsome")
test.print()

//groovy.lang.MissingPropertyException: No such property: x for class: test
//这样定义只是在编译后的run方法中的局部变量，成员方法不能引用
//def x = 1 
//int x = 1

//该文件中的全局变量，其他groovy脚本文件不可以引用
//x = 1
//真正的全局变量，所有脚本文件都可以引用
@Field x = 1
def printx(){
  println x
}

printx()
