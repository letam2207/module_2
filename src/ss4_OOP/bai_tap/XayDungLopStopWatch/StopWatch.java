package ss4_OOP.bai_tap.XayDungLopStopWatch;

public class StopWatch {
    long startTime, endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
