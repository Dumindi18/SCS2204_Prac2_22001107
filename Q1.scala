object evaluateExpression{
    def main(args: Array[String]): Unit = {
        var k, i, j = 2;
        var m, n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        var result1 = k + 12 * m;
        var result2 = m / j;
        var result3 = n % j;
        var result4 = m / j * j;
        var result5 = f + 10 * 5 +g;
        var result6 = {i += 1; i * n};

        println(s"k + 12 * m = ${result1}");
        println(s"m / j = ${result2}");
        println(s"n % j = ${result3}");
        println(s"m / j * j = ${result4}");
        println(s"f + 10 * 5 +g = ${result5}");
        println(s"{i += 1; i * n} = ${result6}");
    }
}