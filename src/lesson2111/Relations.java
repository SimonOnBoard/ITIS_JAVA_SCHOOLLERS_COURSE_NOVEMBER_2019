package lesson2111;

public class Relations {
    private Producer producer;
    private Actor actor;
    private long counter;

    public Relations(Producer producer, Actor actor, long counter) {
        this.producer = producer;
        this.actor = actor;
        this.counter = counter;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Relations{" +
                "producer=" + producer +
                ", actor=" + actor +
                ", counter=" + counter +
                '}';
    }
}
