# code-with-quarkus reproducer

This project uses Quarkus, the Supersonic Subatomic Java Framework.

It showcases how Quarkus' Apache CXF integration intercepts microprofile metrics endpoint and prevents access to metrics.

Warning in log is:
```
WARN  [org.apa.cxf.tra.ser.ServletController] (vert.x-worker-thread-0) Can't find the request for http://localhost:8080/q/metrics's Observer 
```
