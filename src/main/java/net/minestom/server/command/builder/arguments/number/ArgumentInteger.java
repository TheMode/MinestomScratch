package net.minestom.server.command.builder.arguments.number;

import net.minestom.server.network.NetworkBuffer;

public class ArgumentInteger extends ArgumentNumber<Integer> {

    public ArgumentInteger(String id) {
        super(id, "brigadier:integer", Integer::parseInt, Integer::parseInt,
                (buffer, number) -> buffer.write(NetworkBuffer.INT, number), Integer::compare);
    }

    @Override
    public String toString() {
        return String.format("Integer<%s>", getId());
    }
}
