//1.定义类型和方法
def variable = 1
def varable2 = "I am w4lle"

def int x = 1

 //定义函数，参数类型可以不指定
 String testFunction(arg1, arg2) {
 }

 def nonReturnTypeFunc() {
   //最后一行就是返回值
   100
 }

String getString() {
  returm "I am w4lle"
}

def getSomethine() {
  "getSomething return value"  //如果这是最后一行代码，则返回类型为String  
  1000 //如果这是最后一行代码，则返回类型为Integer  
}

//单引号''中的内容严格对应Java中的String，不对$符号进行转义
def singleQuote = 'I am $ dollor' //输出就是I am $ dolloar  

//双引号""的内容则和脚本语言的处理有点像，如果字符中有$号的话，则它会$表达式先求值。  
def doubleQuoteWithoutDollar = "I am one dollar" //输出 I am one dollar  
def count = 1  
def doubleQuoteWithDollar = "I am $count dolloar" //输出I am 1 dolloar  

//三个引号'''xxx'''中的字符串支持随意换行
def multilines = '''begin
  line 1
  line 2
  end '''



//最后，除了每行代码不用加分号外，Groovy中函数调用的时候还可以不加括号。
println("test")
println"test"

//注意，虽然写代码的时候，对于函数调用可以不带括号，但是Groovy经常把属性和函数调用混淆。
//所以，调用函数要不要带括号，我个人意见是如果这个函数是Groovy API或者Gradle API中比较常用的，比如println，就可以不带括号。否则还是带括号。
//getSomething  会报错
getSomething()

def getSomething() {
  "hello"
  }
