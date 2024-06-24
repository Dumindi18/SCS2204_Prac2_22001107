object Q2expressions{
    def main(args: Array[String]): Unit = {
        var a = 2;
        var b = 3;
        var c = 4;
        var d = 5;
        var k = 4.3f;

        b -= 1;
        d -= 1;
        var result1 = b * a + c * d;
        println(result1);

        a += 1;
        println(a);

        var result2 = (-2) * ( d - k ) + c
        println(result2);

        c += 1;
        println(c);

        a += 1;
        c += 1;
        c = c * a;
        println(c);
    }
}