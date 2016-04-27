def xparser = new XmlSlurper()
def targetFile = new File('test.xml')

def gPathResult = xparser.parse(targetFile)

//现在我要访问id=4的book元素。
//下面这种搞法，gpathResult代表根元素response。通过e1.e2.e3这种
//格式就能访问到各级子元素....
def book4 = gPathResult.value.books.book[3]

def author = book4.author
assert author.text() == 'Manuel De Cervantes'
author.@id == '4'
author['@id'] == '4'
//属性一般是字符串，可通过toInteger转换成整数
author.@id.toInteger() == 4

/**
 * 再看个例子。
  我在使用Gradle的时候有个需求，就是获取AndroidManifest.xml版本号（versionName）。有了GPath，一行代码搞定，请看：
 */
 def androidManifest = new XmlSlurper().parse("AndroidManifest.xml")
 println androidManifest['@android:versionName']
 //或者
 println androidManifest.@'android:versionName'

println androidManifest.@'android:versionCode'
