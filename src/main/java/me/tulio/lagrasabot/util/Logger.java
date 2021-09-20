package me.tulio.lagrasabot.util;

public class Logger {

    public static void console(String player, String object) {
        System.out.println(ConsoleColors.GREEN + "El jugador " + ConsoleColors.PURPLE + player +
                ConsoleColors.GREEN + " ha usado " + ConsoleColors.BLUE + object);
    }
}
