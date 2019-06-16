package hw_generics;

public class Generics {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("25", 1);
        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
    }

    static class Pair<E, V> {

        private E left;
        private V right;

        Pair(E left, V right) {
            this.left = left;
            this.right = right;
        }

        E getLeft() {
            return left;
        }

        V getRight() {
            return right;
        }
    }
}
