package work.garaku.code.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class Member {
  private int num;
  private String name;
}
