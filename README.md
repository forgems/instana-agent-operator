# Instana

## Introduction

Instana is an [APM solution](https://www.instana.com/product-overview/) built for microservices that enables IT Ops to build applications faster and deliver higher quality services by automating monitoring, tracing and root cause analysis. The solution is optimized for [Kubernetes](https://www.instana.com/automatic-kubernetes-monitoring/) and [OpenShift](https://www.instana.com/blog/automatic-root-cause-analysis-for-openshift-applications/).

## Instana Agent Operator

### Installing

There are two ways to install the operator:

* [docs/install-via-olm.md](docs/install-via-olm.md) describes how to install the operator using the Operator Lifecycle Manager (OLM).
* [docs/install-manually.md](docs/install-manually.md) describes how to install the operator by creating the required resources manually.

### Building 

[![CircleCI](https://circleci.com/gh/instana/instana-agent-operator.svg?style=svg)](https://circleci.com/gh/instana/instana-agent-operator)

* [docs/build.md](docs/build.md) describes how to build the Docker image from source code.
* [docs/testing-with-kind.md](docs/testing-with-kind.md) shows how to test the operator in a local Kind cluster.
* [docs/run-operator-registry-locally.md](docs/run-operator-registry-locally.md) describes how to set up a local Operator Lifecycle Manager and Registry to test the OLM deployment locally.
