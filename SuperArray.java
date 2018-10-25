public class SuperArray {
  private String[] data = new String[10];
  private int size;

  public SuperArray() {
    String[] data = new String[10];
    clear();
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty(){
    if (size == 0) {
      return true;
    }
    return false;
  }

//download driver files
//can't add null
//resize = *2 + 1


  public boolean add(String str) {
    if (size == data.length) {
      resize();
    }
    data[size] = str;
    size = size + 1;
    return true;
  }

  public String toString() {
    String a =  "[";
    String b = "";
    for (int x = 0; x < data.length; x++) {
      b = b + data[x] + ",";
    }
    return a + b.substring(0,b.length()-1) + "]";
  }

  public String toStringDebug() {
    return "" + data;
  }

  //wtf is THIS DEbUG?

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    }
    return data[index];
  }

  public String set(int index, String replace) {
    if (index < 0 || index >= size()) {
      return null;
    }
    data[index] = replace;
    return data[index];
  }

  private void resize() {
    String[] newA = new String[size*2+1];
    for (int x = 0; x < data.length; x++) {
      newA[x] = data[x];
    }
    data = newA;
  }


}
