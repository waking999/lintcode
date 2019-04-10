package easy.e0039recoverrotatedsortedarray;

import common.Util;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RecoverRotatedSortedArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();


        Integer[] array;
        List<Integer> list;
        int[] expect;
        int seq=1;

        array=new Integer[]{4,5,1,2,3};
        list= Util.convertArrayToList(array);
        expect=new int[]{1,2,3,4,5};
        s.recoverRotatedSortedArray(list);
        VerifyUtil.verifyUnsort(expect,list,seq++);


        array=new Integer[]{1,2,3,4,5,6};
        list= Util.convertArrayToList(array);
        expect=new int[]{1,2,3,4,5,6};
        s.recoverRotatedSortedArray(list);
        VerifyUtil.verifyUnsort(expect,list,seq++);

        array=new Integer[]{1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        list= Util.convertArrayToList(array);
        expect=new int[]{-1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        s.recoverRotatedSortedArray(list);
        VerifyUtil.verifyUnsort(expect,list,seq++);

    }
}
