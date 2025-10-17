package net.openhft.chronicle.queue.impl.single;

import net.openhft.chronicle.core.util.IgnoresEverything;

import java.util.function.LongConsumer;

public class NoOpWriteLock implements WriteLock, IgnoresEverything {

    @Override
    public void lock() {
    }

    @Override
    public void unlock() {
    }

    @Override
    public void close() {
    }

    @Override
    public boolean forceUnlockIfProcessIsDead() {
        return true;
    }

    @Override
    public boolean isLockedByCurrentProcess(LongConsumer notCurrentProcessConsumer) {
        return true;
    }
}
