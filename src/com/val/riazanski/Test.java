package com.val.riazanski;

public class Test {
    public static void main(String[] args) {
        Book book = new Book(3);
        GenericList<String> genericList = new GenericList<String>(book.getList());
        System.out.println(ConsoleColors.GREEN + genericList.getList().toString() + ConsoleColors.RESET);
        String str = book.createMetaWord(3);
        genericList.add(str);
        System.out.println(ConsoleColors.GREEN + genericList.getList().toString() + ConsoleColors.RESET);
        genericList.addFirst(str);
        System.out.println(ConsoleColors.GREEN + genericList.getList().toString() + ConsoleColors.RESET);
        genericList.remove(1);
        System.out.println(ConsoleColors.GREEN + genericList.getList().toString() + ConsoleColors.RESET);
        genericList.addAll(book.getList());
        System.out.println(ConsoleColors.GREEN + genericList.getList().toString() + ConsoleColors.RESET);
        Runnable task = () -> {
            int size = genericList.getSize();
            for (int i = 0; i < size; i++ ) {
                genericList.remove(i);
                String s = book.createMetaWord(5);
                genericList.addOfIndex(i, s);
                System.out.println(ConsoleColors.PURPLE + genericList.getList().toString() + ConsoleColors.RESET);
            }
        };
        genericList.applyLambda(task);

    }
}
