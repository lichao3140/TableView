package com.lqh.lichao.tableview;

import android.view.View;

import java.util.Stack;

/**
 * Created by Administrator on 2017-10-19.
 */

public class Recycler {

    private Stack<View>[] views;
    //打造一个回收池
    public Recycler(int type) {
        views=new Stack[type];
        for (int i=0;i<type;i++) {
            views[i]=new Stack<View>();
        }
    }

    public void addRecycledView(View view,int type){
        views[type].push(view);
    }

    public View getRecyclerdView(int type) {
        try {
            return views[type].pop();
        } catch (Exception e) {
            return null;
        }
    }
}
