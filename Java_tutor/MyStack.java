import java.util.*;

interface IStack<T> {
  T pop();

  boolean push(T ob);
}

public class MyStack<T> implements IStack<T> {
  Vector<T> l = null;

  public MyStack() {
    l = new Vector<T>();
  }

  @Override
  public T pop() {
    if (l.size() == 0)
      return null;
    else {
      return l.remove(0);
    }
  }

  @Override
  public boolean push(T ob) {
    l.add(0, ob);
    return true;
  }

  public static void main(String[] args) {
    IStack<Integer> stack = new MyStack<Integer>();
    for (int i = 0; i < 10; i++)
      stack.push(i);
    while (true) {
      Integer n = stack.pop();
      if (n == null)
        break;
      System.out.print(n + " ");
    }
  }

}
