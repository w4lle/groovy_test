//基本数据类型

def int x = 1
println x.getClass().getCanonicalName()

//  Collection
/*
List：链表，其底层对应Java中的List接口，一般用ArrayList作为真正的实现类。
Map：键-值表，其底层对应Java中的LinkedHashMap。
Range：范围，它其实是List的一种拓展。
*/

//List
def playList() {
  def aList = [5, 'String', true] //List由[]定义，其元素可以是任何对象
  //变量存取：可以直接通过索引存取，而且不用担心索引越界。如果索引超过当前链表长度，List会自动  
  //往该索引添加元素
  
  assert aList[1] == 'String'
  assert aList[5] == null
  aList[100] = 100
  assert aList[100] == 100
  println aList.size //101
}
playList()


//Map
def playMap() {
  //变量定义：Map变量由[:]定义
  def aMap = ['key1':'value', 'key2':true] 
  //key必须是字符串, key也可以不被 ''包起来
  def aNewMap = [key1:"value", key2:true]
  
  //不过Key要是不使用引号包起来的话，也会带来一定混淆，比如  
  def key1="wowo"  
  def aConfusedMap=[key1:"who am i?"]  
  //aConfuseMap中的key1到底是"key1"还是变量key1的值“wowo”？显然，答案是字符串"key1"。如果要是"wowo"的话，则aConfusedMap的定义必须设置成：  
  def aNewConfusedMap=[(key1):"who am i?"]  
  //Map中元素的存取更加方便，它支持多种方法：  
  println aMap.key2    //这种表达方法好像key就是aMap的一个成员变量一样  
  println aMap['key1'] //这种表达方法更传统一点  
  aMap.anotherkey = "i am map"  //为map添加新元素  
  println aMap['anotherkey']
  println aMap
}

playMap()


//Range
def playRange() {
  def aRange = 1..5 //12345
  def aRangeWithoutEnd = 1..<5 //1234
  println aRange.from
  println aRange.to
  println aRangeWithoutEnd.getTo()
  //Closure
  aRange.each{
    println it
  }
  println('------------')
  for(n in aRange)
    println n
}
playRange()
