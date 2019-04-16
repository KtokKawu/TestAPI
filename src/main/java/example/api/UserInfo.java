package example.api;

import lombok.Getter;

public class UserInfo {

  @Getter private final long id;
  @Getter private final String content;

  public UserInfo(long id, String content) {
    this.id = id;
    this.content = content;
  }
}
