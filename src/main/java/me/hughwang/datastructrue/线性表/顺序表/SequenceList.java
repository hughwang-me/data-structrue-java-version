package me.hughwang.datastructrue.线性表.顺序表;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hughwang
 * @date 2018/8/12 23:52
 *
 * 线性表 顺序表实现
 *
 */
@Slf4j
public class SequenceList implements List{

    private final static int DEFAULT_SIZE = 20;

    private Object[] list;

    private int maxSize;

    private int length;

    @Override
    public Object[] init() {
        list = new Object[DEFAULT_SIZE];
        this.maxSize = DEFAULT_SIZE;
        return list;
    }

    @Override
    public Object[] init(int size) {
        list = new Object[size];
        this.maxSize = size;
        return list;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public void insert(Object obj, int index) {
        if(index < 0 || index > length){
            throw new IllegalArgumentException("插入位置不合法！");
        }
        if(length == maxSize){
            throw new IllegalArgumentException("线性表已满！");
        }
        int j = length - 1;
        for (int i = index ; j >= i; j--){
            list[j + 1] = list[j];
        }
        list[index] = obj;
        length++;
    }

    @Override
    public int find(Object obj) {
        int i;
        for (i = 0; i < length; i++){
            if(list[i] == obj){
                break;
            }
        }
        if(i == length){
            throw new IllegalStateException("线性表中不存在该元素！");
        }
        return i;
    }

    @Override
    public Object find(int index) {
        if(index < 0 || index >= length){
            throw new IllegalArgumentException("查找位置不合法！");
        }
        return list[index];
    }

    @Override
    public void delete(int index) {
        if(index < 0 || index >= length){
            throw new IllegalArgumentException("删除位置不合法！");
        }
        for (int i = index ; i < length - 1;i++){
            list[i] = list[i+1];
        }
        length--;
    }

    @Override
    public boolean isEmpty() {
        if(length == 0){
            return true;
        }
        return false;
    }

    @Override
    public void listElements() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++){
            stringBuilder.append(list[i]);
            log.debug(" index : {} , element : {}" , i , list[i]);
        }
        log.info("线性表：{}" , stringBuilder.toString());
    }


}
