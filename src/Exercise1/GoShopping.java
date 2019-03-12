package Exercise1;

/**
 * 定义Goshopping类  分别使用WallMarket类和taobaoMarket类
 * 2019年3月10号
 */

public class GoShopping {
    public static void main(String[] args) {
        //使用派生类对象创建抽象类对象
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼";
        market.shop();
        //使用派生类对象创建抽象类对象
        market  = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍";
        market.shop();
    }
}
