

class Factory {
  private static World curr;

  public static Block genEntity(String name) {
    Block b = new Block(name);
  }

  public static void setWorld(World w) {
    curr = w;
  }

}
