import java.util.ArrayList;
import java.util.HashMap;

class Block {
  private static minObj = 0;
  private int id;
  private String name;
  private String desc;
  private ArrayList flags;
  private HashMap attributes;

  public Block(World w) {
    id = getNextId(w);
  }

  public Block(World w, String name) {

  }

  public Block(World w, String name, String description) {

  }

  public Block(World w) {
    id = getNextId(w);
  }

  public Block(World w, String name) {

  }

  public Block(World w, String name, String description) {

  }

  private static int getNextId(World w) {

  }

}
