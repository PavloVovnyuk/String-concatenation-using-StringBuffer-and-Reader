public class Main {
    public static void main(String[] args) throws InterruptedException {

        /* Method 1
        String simpleConcat = "pa";
        for (int i = 0; i < 10; i++) {
            simpleConcat += "a";
            System.out.println(simpleConcat);
        }

         */

        //Method StringBuilder
        /*  wykorzystywany dla aplicacji NIE wielowontkowych
        StringBuilder stringA = new StringBuilder("pa");
        for (int i = 0; i < 10; i++) {
            stringA.append("r");
            System.out.println(stringA);
        }
        */

        //Method StringBuffer
        // Wykorzystujemy dla appek wielowontkowych

        StringBuffer stringB = new StringBuffer("p");
       new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                stringB.append("a");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                stringB.append("b");
            }
        }).start();
            Thread.sleep(1);


        System.out.println(stringB);
    }
}
