package shopping;

public class Store {
  public static void main(String[] args) {
    ClothingPair<Shoe> pShoe = new ClothingPair<>(
        new Shoe(9, "Brown"), new Shoe(10, "Brown"));
    Shoe left = pShoe.getLeft();
    System.out.println("Left is " + left);

    System.out.println("pair matched? " + pShoe.matched());

    ClothingPair<Shoe> pShoe2 = new ClothingPair<>(
        new Shoe(9, "Brown"), new Shoe(9, "Black"));
    System.out.println("pair2 matched? " + pShoe2.matched());
  }
}
