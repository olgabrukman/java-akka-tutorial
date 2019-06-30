
Akka
====

This is the Akka 2.3.15 download.

Included are all libraries, documentation, and sources for Akka.

This download can also be used for running the Akka Microkernel.


Contents
--------

- README    - this document
- bin       - start scripts for the Akka Microkernel and Akka Cluster admin tool
- config    - config files for microkernel applications
- deploy    - deploy dir for microkernel applications
- doc       - Akka documentation and Scaladoc API
- lib       - all Akka jars and dependencies
- src       - source jars for Akka usage tutorial. Based on [Getting Started Tutorial (Java)](http://doc.akka.io/docs/akka/2.0.2/intro/getting-started-first-java.html). 
The sample application is using actors to calculate the value of Pi. 
Calculating Pi is a CPU intensive operation and we will utilize Akka Actors 
to write a concurrent solution that scales out to multi-core processors. This 
sample can be extended to use Akka Remote Actors to scale out on multiple machines 
in a cluster.
                                                                                   
                                                                          
                                                                          


Microkernel
-----------

This download includes everything needed for a self-contained Akka
Microkernel.

See the documentation for more information about the
microkernel (see `doc/akka/docs/scala/microkernel.html`).

Cluster Administration Tool
---------------------------

The 'akka-cluster' tool is an administration tool for managing Akka cluster nodes.
Learn more by invoking:

    bin/akka-cluster --help

Run the Application
---------------------------

    Run Pi class main() function