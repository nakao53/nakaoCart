package order;

import goods.Goods;

import java.util.ArrayList;

/**
 * @author Nakao Mizuki
 * Date: 2022/05/26
 */
public class Cart {
    private ArrayList<OrderDetail> _list = new ArrayList<>();
    private int total;

    public void add(OrderDetail detail){
        _list.add(detail);
    }

    public ArrayList<OrderDetail> getList() {
        return _list;
    }

    public void setList(ArrayList<OrderDetail> list) {
        _list = list;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
