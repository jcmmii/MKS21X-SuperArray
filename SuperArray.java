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

// might be ==
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
    for (int x = 0; x < data.length; x++) {
        b = b + data[x] + ",";
    }
    return a + b.substring(0,b.length()-1) + "]";
  }


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

  public boolean contains(String target) {
    for (int x = 0; x < data.length; x++) {
      if (data[x].equals(target)) {
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

//broke
  public void add(int index, String val) {
    String[] newA = new String[data.length+1];
    int check = 0;
    if (index < 0 || index >= size()) {
      System.out.println("Error: Index out of range");
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
      return null;
    } else {
       ret = data[index];
       for (int x = 0; x < data.length-1; x++) {
         if (x != index && check == 0) {
          newA[x] = data[x];
        } else {
          check = 1;
        }
        if (check == 1) {
          newA[x] = data[x+1];
        }
      }
    }
    data = newA;
    return ret;
    }


//broken
//removes first occ of del from list
//ret true if present
//if not in list ret false
//after rem shift everything left
    public boolean remove(String del) {
      String[] newA = new String[data.length-1];
      int check = 0;
      if (contains(del) == true) {
        for (int x = 0; x < data.length-1; x++) {
          if (data[x].equals(del)) {
            check = 1;
          } else if (check == 0){
            newA[x] = data[x];
          } else if (check == 1) {
            newA[x] = data[x+1];
          }
        }
      data = newA;
      return true;
      }
      return false;
    }

  }
