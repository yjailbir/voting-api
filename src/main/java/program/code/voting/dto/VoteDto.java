package program.code.voting.dto;

import lombok.Data;

import java.util.List;

@Data
public class VoteDto {
    String speaker;
    Byte rating;
    List<String> addInfo;
}
