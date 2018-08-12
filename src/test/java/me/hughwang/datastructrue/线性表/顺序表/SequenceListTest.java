package me.hughwang.datastructrue.线性表.顺序表;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class SequenceListTest {

    @Test
    public void insert() throws Exception {
        SequenceList sequenceList = new SequenceList();
        sequenceList.init(6);
        sequenceList.insert("王" , 0);
        sequenceList.insert("欢" , 1);
        sequenceList.insert("你" , 2);
        sequenceList.insert("好" , 3);
        sequenceList.insert("！" , 4);

        sequenceList.insert(":" , 2);

        sequenceList.listElements();
    }

    @Test
    public void find() throws Exception {
        SequenceList sequenceList = new SequenceList();
        sequenceList.init(6);
        sequenceList.insert("王" , 0);
        sequenceList.insert("欢" , 1);
        sequenceList.insert("你" , 2);
        sequenceList.insert("好" , 3);
        sequenceList.insert("!" , 4);
        sequenceList.listElements();

        int index = sequenceList.find("你");
        log.info("位置是 ：{}" , index);
    }

    @Test
    public void delete() throws Exception {
        SequenceList sequenceList = new SequenceList();
        sequenceList.init(6);
        sequenceList.insert("王" , 0);
        sequenceList.insert("欢" , 1);
        sequenceList.insert("你" , 2);
        sequenceList.insert("好" , 3);
        sequenceList.insert("!" , 4);
        sequenceList.insert(":" , 2);
        sequenceList.listElements();

        sequenceList.delete(2);
        sequenceList.listElements();

    }


}