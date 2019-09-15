package com.leosanqing.decorator;

/**
 * @Author: leosanqing
 * @Date: 2019-09-15 12:38
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int rows);
    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
