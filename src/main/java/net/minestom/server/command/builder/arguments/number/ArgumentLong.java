package net.minestom.server.command.builder.arguments.number;

import net.minestom.server.network.NetworkBuffer;

public class ArgumentLong extends ArgumentNumber<Long> {

    public ArgumentLong(String id) {
        super(id, "brigadier:long", Long::parseLong, Long::parseLong,
                (buffer, number) -> buffer.write(NetworkBuffer.LONG, number), Long::compare);
    }

    @Override
    public String toString() {
        return String.format("Long<%s>", getId());
    }
}
