package com.instana.operator.events;

public class AgentPodDeleted {

  private final String uid;

  public AgentPodDeleted(String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }
}
