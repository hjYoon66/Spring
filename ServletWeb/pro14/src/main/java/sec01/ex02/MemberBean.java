package sec01.ex02;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Setter
@Getter
@NoArgsConstructor
public class MemberBean {
    private String id;
    private String pwd;
    private String name;
    private String email;
    private Date joinDate;
    private Address addr;
}
