package dmacc.drama.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Node {
    private AttrType type;

    public Node( AttrType type) {
        this.type = type;
    }

}
