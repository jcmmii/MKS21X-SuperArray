public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    String[] j = new String[10];
    data = j;
    clear();
  }

  public SuperArray(int startingCapacity) {
    if (startingCapacity < 0) {
      throw new IllegalArgumentException ("Initial Capacity cannot be negative");
    } else {
        String[] j = new String[startingCapacity];
        data = j;
        clear();
      }
  }

  public void clear() {
    data = new String[0];
    size = 0;
  }

  //returns the data length in checking if resize() works
  public int checkit() {
    return data.length;
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

  public boolean add(String str) {
    if (data.length <= size) {
      resize();
    }
    data[size] = str;
    size = size + 1;
    return true;
  }

  public String toString() {
    String a =  "[";
    String b = "";
    if (data.length > 0) {
      for (int x = 0; x < data.length; x++) {
        if (data[x] != null) {
          b = b + data[x] + ",";
        }
      }
      if (b != "") {
        return a + b.substring(0,b.length()-1) + "]";
      }
    }
    return "[]";
  }

  public String toStringDebug() {
    String a = "[";
    String b = "";
    if (data.length > 0) {
      for (int x = 0; x < data.length; x++) {
          b = b + data[x] + ",";
        }
        return a + b.substring(0,b.length()-1) + "]";
      }
    return "[]";
  }


  public String get(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index invalid");
    }
    return data[index];
  }

  public String set(int index, String replace) {
    String oldVal = data[index];
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index invalid");
    }
    data[index] = replace;
    return oldVal;
  }

  private void resize() {
    String[] newA = new String[size*2+1];
    for (int x = 0; x < data.length; x++) {
      newA[x] = data[x];
    }
    data = newA;
  }

  public boolean contains(String target) {
    for (int x = 0; x < data.length; x++) {
      if (data[x] != null && data[x].equals(target)) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target) {
    for(int x = 0; x < size; x++) {
      if(data[x].equals(target)) return x;
    }
    return -1;
  }


  public int lastIndexOf(String target) {
    for(int x = size - 1; x > 0; x--) {
      if(data[x].equals(target)) return x;
    }
    return -1;
  }

  public void add(int index, String val) {
    if (data.length == size()) resize();
    if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
      else{
        for (int i = size(); i > 0; i--){
          if (i > index) data[i] = data[i - 1];
        }
        data[index] = val;
        size++;
      }
    }

  public String remove(int index) {
    if (data.length <= size()) resize();
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    String del = data[index];
    for (int x = index; x < size(); x++) {
      data[x] = data[x+1];
    }
    size = size - 1;
    return del;
  }

    public boolean remove(String target) {
      boolean ret = false;
      int check = 0;
      String[] a = new String[data.length-1];
      for (int x = 0; x < size(); x++) {
        if (ret == true && check == 1){
         a[x] = data[x+1];
       }
        if (data[x].equals(target) && check == 0) {
          ret = true;
          a[x] = data[x+1];
          size = size -1;
          check = 1;
        } else if (check == 0){
          a[x] = data[x];
        }
      }
      data = a;
      return ret;
    }

  }
