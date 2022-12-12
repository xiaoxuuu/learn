package live.xiaoxu.data.structure.binary.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiao Xu
 * @date 2021/9/28 下午 02:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinaryTreeNode {

    /**
     * 数据
     */
    private Object data;

    /**
     * 左孩子
     */
    private BinaryTreeNode leftChild;

    /**
     * 右孩子
     */
    private BinaryTreeNode rightChild;
}