package work.garaku.code.example;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class MemberFieldSetMapper implements FieldSetMapper<Member> {
  @Override
  public Member mapFieldSet(FieldSet fieldSet) throws BindException {
    return Member.builder()
        .num(fieldSet.readInt("num"))
        .name(fieldSet.readString("name"))
        .build();
  }
}
