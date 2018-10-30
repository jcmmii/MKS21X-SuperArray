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
    if (size >= data.length) {
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
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index invalid");
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

  public boolean contains(String target) {
    for (int x = 0; x < data.length; x++) {
      if (data[x] != null && data[x].equals(target)) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target) {
    int place = 0;
    if (contains(target)) {
      for (int x = 0; x < data.length; x++) {
        if (data[x].equals(target)) {
          return place;
        }
        place++;
      }
    } else {
      return -1;
    }
    return place;
  }

  public int lastIndexOf(String target) {
    int place = 0;
    int lastind = 0;
    if (contains(target)) {
      for (int x = 0; x < data.length; x++) {
        if (data[x].equals(target)) {
          lastind = place;
        }
        place++;
      }
    } else {
      return -1;
    }
    return lastind;
  }

  public void add(int index, String val) {
    String[] newA = new String[data.length+1];
    int check = 0;
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException("Index invalid");
    } else {
      for (int x = 0; x < data.length+1; x++) {
        if (x != index && check == 0){
          newA[x] = data[x];
        } else if (check != 2) {
          check = 1;
        }
        if (check == 2) {
          newA[x] = data[x-1];
        }
        if (check == 1) {
          newA[x] = val;
          size = size + 1;
          check = 2;
        }
      }
    }
    data = newA;
  }

  public String remove(int index) {
    String[] newA = new String[data.length-1];
    String ret = "";
    int check = 0;
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index invalid");
    } else {
       ret = data[index];
       for (int x = 0; x < data.length-1; x++) {
         if (x != index && check == 0) {
          newA[x] = data[x];
        } else if (check != 2){
          check = 1;
        }
        if (check == 1) {
          size = size - 1;
          check = 2;
        }
        if (check == 2) {
          newA[x] = data[x+1];
        }
      }
    }
    data = newA;
    return ret;
    }

    public boolean remove(String target) {
      String[] newA = new String[data.length-1];
      int check = 0;
      int placehold = 0;
      if (contains(target) == true) {
        for (int x = 0; x < data.length-1; x++) {
          if (data[x] != null && data[x].equals(target)) {
            check = 1;
            placehold = 1;
          }
          if (placehold == 1) {
            placehold = 2;
            size = size - 1;
          }
          if (check == 0){
            newA[x] = data[x];
          }
          if (check == 1) {
            newA[x] = data[x+1];
          }
        }
      data = newA;
      return true;
      }
      return false;
    }
  }
