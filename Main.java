class Main {
  public static void main(String[] args) {
   Sugar tree = new Sugar ("Tree");
   tree.shapeCutOut(tree.getShape(), 10);
   tree.baked(350,12);
   tree.decorate();
   Sugar aCookie = new Sugar();
   aCookie.decorate();
  }
}