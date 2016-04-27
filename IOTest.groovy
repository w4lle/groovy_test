/**
 * IO操作
 */
def srcFile = new File('test.groovy')
println "print test.groovy"
srcFile.eachLine{
    println it
}
srcFile.getBytes()//文件内容一次性读出，返回类型为byte[]

targetFile = new File('copyTest.groovy')
targetFile.withOutputStream{ os ->
        srcFile.withInputStream{ ins ->
            //利用OutputStream的<<操作符重载，完成从inputstream到OutputStream
            //的输出
            os << ins
        }
}
println "print copyTest.groovy"
targetFile.eachLine{
    println it
}

