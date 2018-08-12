package me.hughwang.datastructrue.线性表.顺序表;

/**
 * 线性表 顺序表实现的 接口
 */
public interface List {

    /**
     * 初始化一个线性表
     * @return
     */
    Object[] init();

    /**
     * 获取线性表长度
     * @param list
     * @return
     */
    int length(Object[] list);

    /**
     * 将元素插入线性表
     * @param list
     * @param obj
     */
    void insert(Object[] list , Object obj);

    /**
     * 在线性表中查找某个元素的位置
     * @param list
     * @param obj
     * @return
     */
    int findObj(Object[] list , Object obj);

    /**
     * 在线性表中查找某个位置的元素
     * @param list
     * @param obj
     * @return
     */
    Object findIndex(Object[] list , Object obj);

    /**
     * 删除线性表中某个位置的元素
     * @param list
     * @param index
     */
    void delete(Object[] list , int index);

}
