package com.example.componentPattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName : ComposeIterator
 * @Description :
 * @Version V1.0
 */
public class ComposeIterator implements Iterator {

    private Stack<java.util.Iterator> stack = new Stack<java.util.Iterator>();

    public ComposeIterator(java.util.Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        java.util.Iterator iterator = stack.peek();// 函数返回栈顶的元素，但不弹出该栈顶元素。
        if (!iterator.hasNext()) {
            stack.pop();// 函数返回栈顶的元素，并且将该栈顶元素出栈。
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            java.util.Iterator iterator = stack.peek();
            MenuComponent mMenuComponent = (MenuComponent) iterator.next();
            stack.push(mMenuComponent.getIterator());
            return mMenuComponent;
        }
        return null;
    }
}
