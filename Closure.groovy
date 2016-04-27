//闭包
//定义方式
//1 def xxx = {paramters -> code}
//2 def xxx = {无参数纯code}
def aClosure = {
  Stringparam1, int param2 ->
  println "this is code, $param2"
}

aClosure.call("this is string", 100)
aClosure ("this is String" , 1000)

//如果闭包没定义参数的话，则隐含有一个参数，这个参数名字叫it，和this的作用类似。it代表闭包的参数。
def greeting = {println "hello, $it"}

//assert greeting('test') == "hello, test"
greeting.call('test')

//无参的闭包
def noParamClosure = { -> true}
//noParamClosure("test") //报错


//省略括号
//方法的最后一个参数是闭包,调用时可以省略括

def callAMethod(){
   def aClosure = { it -> println it }
   aMethod(10, aClosure);
   aMethod(10, { it -> println it })
   aMethod(10) { println it }
   aMethod(23, aClosure);
   //省略括号
   bMethod{ 
     println"bMethod" 
     }
}

def aMethod(int i, closure){
   println"Here is the output of passed closure:"
   closure(i)
}

def bMethod(closure){
    println"test Closure without param"
    closure()
}

callAMethod()

def testClosure(String s, closure){
  //...
  println "test is the output of passed closure"
  closure(s)//调用闭包
}

testClosure("testClosure", { println it })

def defaultIt() {
  3.times {
    println it
  }
}
defaultIt()
