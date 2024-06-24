object theater{
    def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20;

    def revenue(price: Int): Int = attendees(price) * price;

    def cost(price: Int): Int = 500 + attendees(price)

    def profit(price: Int): Int = revenue(price) - cost(price);

    def main(args: Array[String]): Unit = {
        println(s"Profit for a rs.5 ticket is ${profit(5)}");
        println(s"Profit for a rs.10 ticket is ${profit(10)}");
        println(s"Profit for a rs.15 ticket is ${profit(15)}");
        println(s"Profit for a rs.20 ticket is ${profit(20)}");
    }
}