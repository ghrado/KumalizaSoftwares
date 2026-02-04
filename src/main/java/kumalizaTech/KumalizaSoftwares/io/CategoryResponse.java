package kumalizaTech.KumalizaSoftwares.io;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
@Data

public class CategoryResponse {
    private String category;
    private String name;
    private String description;
    private String bgColor;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String imgUrl;
}
