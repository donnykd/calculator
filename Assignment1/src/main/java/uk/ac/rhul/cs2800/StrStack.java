package uk.ac.rhul.cs2800;

public class StrStack {
  private CalcStack ss = new CalcStack();

  public void push(String i) {
    ss.push(new CalcEntry(i));
  }
  
  public int size() {
    return ss.size();
  }
  
  public boolean isEmpty() {
    if (size() > 0)
      return false;
    return true;
  }

}
