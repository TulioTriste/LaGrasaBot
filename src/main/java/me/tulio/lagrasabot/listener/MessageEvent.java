package me.tulio.lagrasabot.listener;

import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.channel.MessageChannel;
import discord4j.core.object.reaction.ReactionEmoji;
import discord4j.rest.util.Color;
import io.netty.util.internal.StringUtil;
import me.tulio.lagrasabot.FCL;
import me.tulio.lagrasabot.Main;
import me.tulio.lagrasabot.util.Logger;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class MessageEvent {

    private final List<String> trolls = Arrays.asList("756700903439990856", // Joaco
            "417561530700267542", // Cotizao
            "330861775203336194" // Risas
            );

    public MessageEvent() {
        Main.getGateway().on(MessageCreateEvent.class).subscribe(event -> {
            Message message = event.getMessage();
            MessageChannel channel = message.getChannel().block();
            String[] argumentos = message.getContent().split(" ");

            if (message.getContent().equals("*help")) {
                List<String> mensaje = Arrays.asList("**Aquí tienes la lista de comandos**",
                        " ",
                        "*memide - te dirá cuanto te mide guapo UwU",
                        "*furrytest - cual es tu nivel de furro?",
                        "*trollface - cara troll.png",
                        "*fcl - que jugador del futbol chileno eres",
                        "*la mama - simplemente la mama de la mama");
                StringBuilder builder = new StringBuilder();
                for (String s : mensaje) {
                    builder.append(s).append("\n");
                }
                channel.createMessage(builder.toString()).block();
                Logger.console(event.getMember().get().getDisplayName(), "Help");
            }
            else if (message.getContent().startsWith("*memide")) {
                if (argumentos.length == 1) {
                    StringBuilder longSize = new StringBuilder(event.getMember().get().getNicknameMention() + " te mide...\n");

                    int randomNumber = ThreadLocalRandom.current().nextInt(1, 15);
                    longSize.append("8");

//                    if (event.getMember().get().getId().asString().equals("746553036318441604")) {
//
//                    }
//                    else if (event.getMember().get().getId().asString().equals("359147416810815489")) {
//                        for (int i = 0; i < 100; i++) {
//                            longSize.append("=");
//                        }
//                    }
//                    else {
                        for (int i = 0; i < randomNumber; i++) {
                            longSize.append("=");
                        }
//                    }

                    longSize.append("D");

                    channel.createMessage(longSize.toString()).block();
                    Logger.console(event.getMember().get().getDisplayName(), "Me Mide");
                }
                else if (argumentos.length == 2) {
                    User member = event.getMessage().getUserMentions().collectList().block().get(0);
                    StringBuilder longSize = new StringBuilder("a " + member.getMention() + "le mide...\n");

                    int randomNumber = ThreadLocalRandom.current().nextInt(1, 15);
                    longSize.append("8");

                    for (int i = 0; i < randomNumber; i++) {
                        longSize.append("=");
                    }

                    longSize.append("D");

                    channel.createMessage(longSize.toString()).block();
                    Logger.console(event.getMember().get().getDisplayName(), "Me Mide");
                }
            }
//            else if (message.getContent().startsWith("*facha")) {
//                if (argumentos.length == 1) {
//                    StringBuilder longSize = new StringBuilder(event.getMember().get().getNicknameMention() + " hoy lleva un...\n");
//
//                    int randomNumber = ThreadLocalRandom.current().nextInt(1, 15);
//                    longSize.append("8");
//
//                    for (int i = 0; i < randomNumber; i++) {
//                        longSize.append("=");
//                    }
//
//                    longSize.append("D");
//
//                    channel.createMessage(longSize.toString()).block();
//                    Logger.console(event.getMember().get().getDisplayName(), "Facha");
//                }
//                else if (argumentos.length == 2) {
//                    User member = event.getMessage().getUserMentions().collectList().block().get(0);
//                    StringBuilder longSize = new StringBuilder("a " + member.getMention() + "le mide...\n");
//
//                    int randomNumber = ThreadLocalRandom.current().nextInt(1, 15);
//                    longSize.append("8");
//
//                    for (int i = 0; i < randomNumber; i++) {
//                        longSize.append("=");
//                    }
//
//                    longSize.append("D");
//
//                    channel.createMessage(longSize.toString()).block();
//                    Logger.console(event.getMember().get().getDisplayName(), "Me Mide");
//                }
//            }
            else if (message.getContent().startsWith("*furrytest")) {
                if (argumentos.length == 1) {

                    channel.createMessage(event.getMember().get().getNicknameMention() + " tu porcentaje de furry es...\n" + ThreadLocalRandom.current().nextInt(1, 100) + "%").block();
                    Logger.console(event.getMember().get().getDisplayName(), "Furry Test");
                }
                else if (argumentos.length == 2) {
                    User member = event.getMessage().getUserMentions().collectList().block().get(0);

                    channel.createMessage(" a " + member.getMention() + " el porcentaje de furry es...\n" + ThreadLocalRandom.current().nextInt(1, 100) + "%").block();
                    Logger.console(event.getMember().get().getDisplayName(), "Furry Test");
                }
            }
            else if (message.getContent().equals("*trollface")) {
                channel.createEmbed(embedCreateSpec ->
                                embedCreateSpec
                                        .setColor(Color.GRAY)
                                        .setImage("https://cdn.discordapp.com/attachments/880286406780542976/880286416301588520/8BUj0xfuK6SI0AAAAASUVORK5CYII.png"))
                        .block();
                Logger.console(event.getMember().get().getDisplayName(), "Trollface");
            }
            else if (message.getContent().equals("*fcl")) {
                FCL randomPlayer = FCL.getList().get(ThreadLocalRandom.current().nextInt(0, FCL.values().length));
                channel.createMessage(event.getMember().get().getNicknameMention() + " te ha tocado...\n").block();
                channel.createEmbed(embedCreateSpec ->
                                embedCreateSpec
                                        .setDescription(randomPlayer.getName())
                                        .setColor(Color.RED)
                                        .setImage(randomPlayer.getLink()))
                        .block();
                Logger.console(event.getMember().get().getDisplayName(), "Futbol Club League");
            }
            else if (message.getContent().equals("*la mama")) {
                StringBuilder mensaje = new StringBuilder();
                for (int i = 0; i < ThreadLocalRandom.current().nextInt(5, 20); i++) {
                    mensaje.append("**la mama de la mama**").append(" ");
                }
                channel.createMessage(mensaje.toString()).block();
                Logger.console(event.getMember().get().getDisplayName(), "La Mama");
            }
//            else if (message.getContent().startsWith("*vote")) {
//                if (event.getMember().get().getId().asString().equals("391771628574474243")) {
//                    Message message1 = channel.createEmbed(embed ->
//                            embed.setDescription("probando")).block();
//
//                    message1.addReaction(ReactionEmoji.unicode("\u2B06")).block();
//                }
//            }
            else if (message.getContent().contains("pancho")) {
                channel.createMessage("DIJISTE PANCHO?!?!?!?!?!?!?").block();
            }
            else if (message.getContent().contains("tulio")) {
                channel.createMessage("DIJISTE TULIO?!?!?!?!?!?!?").block();
            }
            else if (message.getContent().startsWith("*troll")) {
                if (event.getMember().get().getId().asString().equals("391771628574474243")
                    || event.getMember().get().getId().asString().equals("330861775203336194")) {
                    User member = event.getMessage().getUserMentions().collectList().block().get(0);

                    Timer timer = new Timer();

                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StringBuilder builder = new StringBuilder();
                            for (int i = 0; i < ThreadLocalRandom.current().nextInt(5, 20); i++) {
                                builder.append(member.getMention()).append(" ");
                            }
                            channel.createMessage(builder.toString()).block();
                        }
                    }, 0, 100);

                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            timer.cancel();
                            channel.createMessage("Tarea terminada").block();
                        }
                    }, 8000);
                }
            }
            else if (message.getContent().startsWith("*di")) {
                String[] args = message.getContent().split(" ");
                StringBuilder newMessage = new StringBuilder();
                if (args.length != 0) {
                    for (int i = 1; i < args.length; i++) {
                        newMessage.append(args[i]).append(" ");
                    }
                    message.delete().block();
                    channel.createMessage(newMessage.toString()).block();
                    Logger.console(event.getMember().get().getDisplayName(), "Di");
                }
            }
            else if (message.getContent().startsWith("*clear")) {
                if (argumentos.length == 1) {
                    channel.createMessage("Porfavor inserta un numero.").block();
//                    return;
                }

                try {
                    int number = Integer.parseInt(argumentos[1]);

                    if (number > 100) {
                        channel.createMessage("Porfavor usa un numero igual o inferior a 100").block();
                        return;
                    }
                    List<Message> messageToDelete = new ArrayList<>();
                    messageToDelete.add(message);

//                    CompletableFuture.runAsync(() -> {
                        List<Message> messages = channel.getMessagesBefore(channel.getLastMessage().block().getId()).toStream()
                                .limit(number)
                                .collect(Collectors.toList());
//                    Collections.reverse(messages);

                        for (Message message1 : messages) {
                            message1.delete().cache().block();
                        }

                        messageToDelete.add(channel.createMessage("Mensajes eliminados correctamente").block());

                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                for (Message message1 : messageToDelete) {
                                    message1.delete().block();
                                }
                            }
                        }, 3000);
//                    });

                    Logger.console(event.getMember().get().getDisplayName(), "Clear Messages " + number);
                } catch (NumberFormatException e) {
//                    channel.createMessage("Porfavor inserta un numero valido.").block();
                    e.printStackTrace();
                }
            }
        });
    }
}
