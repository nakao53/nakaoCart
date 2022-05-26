package order;

import goods.Goods;

/**
 * @author Nakao Mizuki
 * Date: 2022/05/26
 */
public class OrderDetail {
    private Goods _goods;
    private int _quantity;

    public boolean equals(Object o){
        boolean checked = false;
        if (this == o) {
            checked = true;
        }
        if (o instanceof Goods){
            Goods tmp = (Goods) o;
            if(_goods.getName().equals(tmp.getName())){
                checked = true;
            }
        }
        return checked;
    }

    public Goods getGoods() {
        return _goods;
    }

    public void setGoods(Goods goods) {
        _goods = goods;
    }

    public int getQuantity() {
        return _quantity;
    }

    public void setQuantity(int quantity) {
        _quantity = quantity;
    }
}
