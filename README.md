Instana Operator
================

Status
------

This is work in progress. Much of the instana-agent configuration is still hard-coded.

Build
-----

Requires OpenJDK.

**Option 1:** Build the Docker image manually:

```sh
mvn package
docker build -t instana/instana-agent-operator .
```

**Option 2:** Build using the [Docker maven plugin](https://dmp.fabric8.io/):

```sh
mvn package docker:build
```

Deploy
------

Assumes that the Docker image `instana/instana-agent-operator:latest` is available in the local repository on all Kubernetes nodes.

```
kubectl apply -f instana-agent-operator-rbac.yaml
kubectl apply -f instana-agent-operator-deploy.yaml
```

Undeploy
--------

```
kubectl delete namespaces instana-agent
```

Test
----

See [TESTING.md](TESTING.md)
