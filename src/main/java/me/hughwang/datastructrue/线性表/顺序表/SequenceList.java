package me.hughwang.datastructrue.线性表.顺序表;

/**
 * @author hughwang
 * @date 2018/8/12 23:52
 *
 * 线性表 顺序表实现
 *
 */

public class SequenceList implements List{

    private Object[] list;

    @Override
    public Object[] init() {
        return new Object[0];
    }

    @Override
    public int length(Object[] list) {
        return 0;
    }

    @Override
    public void insert(Object[] list, Object obj) {

    }

    @Override
    public int findObj(Object[] list, Object obj) {
        return 0;
    }

    @Override
    public Object findIndex(Object[] list, Object obj) {
        return null;
    }

    @Override
    public void delete(Object[] list, int index) {

    }
}
