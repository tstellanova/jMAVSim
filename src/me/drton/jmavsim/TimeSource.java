package me.drton.jmavsim;

/**
 * Created by todd on 1/21/19.
 */
public interface TimeSource {

    long getSimMillis();
    void advanceTime();
    long getRealMillis();

}
