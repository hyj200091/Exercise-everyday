package Exercise1;

/**
 * 创建WallMarket类 继承抽象类Market
 *  @侯粤嘉 2019年3月10号
 */

public class WallMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name + "实体店购买" + goods);
    }
}
