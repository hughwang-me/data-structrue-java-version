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
     * 初始化一个线性表
     * @return
     */
    Object[] init(int size);

    /**
     * 获取线性表长度
     * @return
     */
    int length();

    /**
     * 将元素插入线性表指定位置
     * @param obj
     * @param index
     */
    void insert(Object obj , int index);

    /**
     * 在线性表中查找某个元素的位置
     * @param obj
     * @return
     */
    int find(Object obj);

    /**
     * 在线性表中查找某个位置的元素
     * @param index
     * @return
     */
    Object find(int index);

    /**
     * 删除线性表中某个位置的元素
     * @param index
     */
    void delete(int index);

    /**
     * 检测线性表是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 输出线性表所有元素
     */
    void listElements();

}
