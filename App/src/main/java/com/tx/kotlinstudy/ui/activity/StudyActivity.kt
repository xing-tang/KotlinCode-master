package com.tx.kotlinstudy.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tx.kotlinstudy.R
import kotlinx.android.synthetic.main.activity_study.*

class StudyActivity : AppCompatActivity() {

    //Boolean类型
    val aBoolean: Boolean = true//true
    val anotherBoolean: Boolean = false//false
    //Double类型
    val aDouble: Double = 3.0//3.0
    val anotherDouble: Double = 3.1415926//3.1415926
    val maxDouble: Double = Double.MAX_VALUE//1.7976931348623157E308（2的63次方减1）
    val minDouble: Double = -Double.MAX_VALUE//-1.7976931348623157E308（负2的63次方减1）
    //Float类型
    val aFloat: Float = 2.0F//2.0
    val anotherFloat: Float = 1E3f//1000.0（10的3次方）
    val maxFloat: Float = Float.MAX_VALUE//3.4028235E38（2的31次方减1）
    val minFloat: Float = -Float.MAX_VALUE//-3.4028235E38（负2的31次方减1）
    //Long类型
    val aLong: Long = 123456789//123456789
    val anotherLong: Long = 123//123
    val maxLong: Long = Long.MAX_VALUE//9223372036854775807（2的63次方减1）
    val minLong: Long = Long.MIN_VALUE//-9223372036854775807（负2的63次方减1）
    //Int类型
    val aInt: Int = 8//8
    val anotherInt: Int = 0xFF//255
    val moreInt: Int = 0b00000011//3
    val maxInt: Int = Int.MAX_VALUE//2147483647（2的31次方减1）
    val minInt: Int = Int.MIN_VALUE//-2147483648（负2的31次方减1）
    //Short类型
    val aShort: Short = 123//123
    val maxShort: Short = Short.MAX_VALUE//32767（2的15次方减1）
    val minShort: Short = Short.MIN_VALUE//-32767（负2的15次方减1）
    //Byte类型
    val aByte: Byte = 127//127
    val maxByte: Byte = Byte.MAX_VALUE//127（2的7次方减1）
    val minByte: Byte = Byte.MIN_VALUE//-128（负2的7次方）
    //Char类型
    val aChar: Char = 'a'
    val bChar: Char = '中'
    val cChar: Char = '0'
    //基本类型转换
    var tInt: Int = 1
    var tLong: Long = tInt.toLong()
    //String类型
    var aString: String = "HelloWorld"
    var fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))
    //比较字符串
    var aCompare: Boolean = aString == fromChars//true，相当于java中的equals()方法，比较的是值是否一致
    var bCompare: Boolean = aString === fromChars//false，相当于java中的==方法，比较的是对象是否一致

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        output()
        classAndObject()
    }

    private fun initView() {
        mBooleanTv.text = "aBoolean=$aBoolean;anotherBoolean=$anotherBoolean"
        mDoubleTv.text = "aDouble=$aDouble;anotherDouble=$anotherDouble;maxDouble=$maxDouble;minDouble=$minDouble"
        mFloatTv.text = "aFloat=$aFloat;anotherFloat=$anotherFloat;maxFloat=$maxFloat;minFloat=$minFloat"
        mLongTv.text = "aLong=$aLong;anotherLong=$anotherLong;maxLong=$maxLong;minLong=$minLong"
        mIntTv.text = "aInt=$aInt;anotherInt=$anotherInt;moreInt=$moreInt;maxInt=$maxInt;minInt=$minInt"
        mShortTv.text = "aShort=$aShort;maxShort=$maxShort;minShort=$minShort"
        mByteTv.text = "aByte=$aByte;maxByte=$ maxByte;minByte=$minByte"
        mCharTv.text = "aChar=" + aChar + ";bChar=" + bChar + ";cChar=" + cChar
        mTransitionTv.text = "tInt=$tInt;tLong=$tLong"
        mStringTv.text = "aString=$aString;fromChars=$fromChars"
        mCompareTv.text = "aCompare=$aCompare;bCompare=$bCompare"
    }

    private fun output() {
        println("接下来我们要输出：" + aString)//接下来我们要输出：HelloWorld
        var arg1: Int = 0;
        var arg2: Int = 1;
        println("" + arg1 + "+" + arg2 + "=" + (arg1 + arg2))//0+1=1
        println("$arg1+$arg2=${arg1 + arg2}")//0+1=1
        //打印 Hello "Trump"
        var sayHello = "Hello \"Trump\""
        println(sayHello)//Hello "Trump"
        //打印变量 $1000
        var salary: Int = 1000;
        println("$$salary")//$1000
        //打印 $SayKotlin
        println("\$SayKotlin")//$SayKotlin
        //原始字符串，其内部是识别转义字符，唯一能识别的只有$符号
        //想要$不起效果，用空格隔开
        var rawString: String = """
            \t
            \n
            $salary
            $ salary
\\\\\\\\\\\\\t
        """
        /**
         *          \t
         *          \n
         *          1000
         *          $ salary
         * \\\\\\\\\\\\\t
         */
        println(rawString)
        //获取字符串长度
        println(rawString.length)//92
    }


    class boy(name: String, age: String, hobby: String) : people(name, age, hobby)//对象
    class girl(name: String, age: String, hobby: String) : people(name, age, hobby)//对象
    open class people(var name: String, var age: String, var hobby: String) {//类
    init {
        println("new 了一个${this.javaClass.simpleName}，ta的姓名：$name,年龄：$age，业余兴趣：$hobby")
    }
    }

    private fun classAndObject() {
        var aBoy: boy = boy("赵云", "21", "一枪在手天下我有")
        //输出结果为：new 了一个boy，ta的姓名：赵云,年龄：21，业余兴趣：一枪在手天下我有
        var aGirl: girl = girl("妲己", "19", "请尽情吩咐妲己,主人")
        //输出结果为：new 了一个girl，ta的姓名：妲己,年龄：19，业余兴趣：请尽情吩咐妲己,主人
    }

}
