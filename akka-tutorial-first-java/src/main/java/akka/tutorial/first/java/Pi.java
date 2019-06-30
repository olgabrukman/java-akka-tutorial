package akka.tutorial.first.java;


import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.UntypedActorFactory;

public class Pi {

    public static void main(String[] args) {
        Pi pi = new Pi();
        pi.calculate(4, 10000, 10000);
    }

    // actors and messages ...

    public static void calculate(final int nrOfWorkers, final int nrOfElements, final int nrOfMessages) {
        // Create an Akka system
        ActorSystem system = ActorSystem.create("PiSystem");

        // create the result listener, which will print the result and shutdown the system
        Props props = Props.create(Listener.class);
        final ActorRef listener = system.actorOf(props, "listener");

        // create the master
        final Props masterProps = Props.create(new UntypedActorFactory() {
            public UntypedActor create() {
                return new Master(nrOfWorkers, nrOfMessages, nrOfElements, listener);
            }});

        ActorRef master = system.actorOf(masterProps, "master");

        // start the calculation
        master.tell(new Calculate(),master);

    }
}
