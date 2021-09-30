public class BinaryTreeCameras {

    private static int cameraCount = 0;

    private static final int NEEDS_CAMERA = 0;
    private static final int HAS_CAMERA = 1;
    private static final int COVERED = 2;
    private static final int NOT_NEEDED = 3;

    public static void main(String[] args) {
        TreeNode t = new TreeNode(0);
        t.left = new TreeNode(0,new TreeNode(0),new TreeNode(0));

        System.out.println(minCameraCover(t));
    }
    public static int minCameraCover(TreeNode root) {
        cameraCount = getCameraStatusForEachNode(root)== NEEDS_CAMERA? cameraCount+1 : cameraCount;
        return cameraCount;
    }

    static int getCameraStatusForEachNode(TreeNode root){
        if(root == null){
            return NOT_NEEDED;
        }
        // leaf
        if(root.left == null && root.right == null){
            return NEEDS_CAMERA;
        }

        int leftStatus =getCameraStatusForEachNode(root.left);
        int rightStatus = getCameraStatusForEachNode(root.right);

        if(leftStatus == NEEDS_CAMERA || rightStatus == NEEDS_CAMERA){
            cameraCount++;
            return HAS_CAMERA;
        }

        if(leftStatus == HAS_CAMERA || rightStatus == HAS_CAMERA){
            return COVERED;
        }

        return NEEDS_CAMERA;
    }
}

