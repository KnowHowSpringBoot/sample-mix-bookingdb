package org.ujar.micro.k8s.bookingdb.jobs;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PROTECTED)
public abstract class AbstractJobParameters implements JobParameters, Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  protected JobType type;

  private Instant publishedAt;

  public AbstractJobParameters() {
    setPublishedAt(Instant.now());
  }
}
