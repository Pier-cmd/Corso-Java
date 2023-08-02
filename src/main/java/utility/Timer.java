package utility;

public class Timer {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTimeInMillis() {
        return endTime - startTime;
    }

    public double getElapsedTimeInSeconds() {
        return (double) getElapsedTimeInMillis() / 1000.0;
    }
}


