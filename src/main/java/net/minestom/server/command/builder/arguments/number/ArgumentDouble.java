package net.minestom.server.command.builder.arguments.number;

import net.minestom.server.network.NetworkBuffer;

public class ArgumentDouble extends ArgumentNumber<Double> {

    public ArgumentDouble(String id) {
        super(id, "brigadier:double", Double::parseDouble, ((s, radix) -> (double) Long.parseLong(s, radix)),
                (buffer, number) -> buffer.write(NetworkBuffer.DOUBLE, number), Double::compare);
    }

    @Override
    public String toString() {
        return String.format("Double<%s>", getId());
    }
}
