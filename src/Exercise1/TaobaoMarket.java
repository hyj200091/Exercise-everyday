package Exercise1;

/**
 * 创建淘宝类 继承抽象类Market
 * @侯粤嘉 2019年3月10号
 */
public class  TaobaoMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name + "网购" +goods);
    }
}
