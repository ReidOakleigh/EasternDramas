package dmacc.drama.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rumbi
 * Date: 4/30/21
 * Time: 7:11 AM
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Root extends Node {
    private List<List<Node>> children;

    public Root() {
        super(AttrType.ROOT);
        children = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            children.add(new ArrayList<>());
        }
    }
}
