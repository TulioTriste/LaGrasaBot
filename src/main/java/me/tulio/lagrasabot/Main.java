package me.tulio.lagrasabot;

import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.discordjson.json.gateway.StatusUpdate;
import me.tulio.lagrasabot.listener.MessageEvent;

import java.util.Timer;

public class Main {

    public static DiscordClient get() {
        return DiscordClient.create("ODgwMjg2MjM1NTAxOTI4NDc4.YScEcQ.diNE0pH73e78r5fJRV6piaSbWv0");
    }

    public static GatewayDiscordClient getGateway() {
        return get().login().block();
    }

    public static void main(String[] args) {
//        getGateway().updatePresence(StatusUpdate.builder()
//                        .status("ocupado")
//                        .from(StatusUpdate.builder().status("test").afk(false).build())
//                        .afk(false)
//                        .build())
//                .block();

        new MessageEvent();

        getGateway().onDisconnect().block();
    }

}
