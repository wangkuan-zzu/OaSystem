package pageBean;

import java.util.Collection;

public class PageBean {

	 private Collection objs;//�����ݿ��ж��ļ���
     private int totalCount;//�ܵ�����
     private int pageNo;//��ǰ��ҳ��
     private int pageCount;//ÿҳ������
     public int getPageCount() {
             return pageCount;
     }
     public void setPageCount(int pageCount) {
             this.pageCount = pageCount;
     }
     public void setPageNo(int pageNo) {
             this.pageNo = pageNo;
     }
     public int getTotalPage(){
             if(totalCount % pageCount == 0){
                     return totalCount/pageCount;
             } else {
                     return totalCount/pageCount + 1;
             }
     }
     //��дһ���ж���һҳ�ķ���
     public boolean isNext(){
             return pageNo < getTotalPage();
     }
     //��һҳ�ķ���
     public boolean isPrevious(){
             return pageNo > 1;
     }
     public Collection getObjs() {
             return objs;
     }
     public void setObjs(Collection objs) {
             this.objs = objs;
     }
     public int getPageNo() {
             return pageNo;
     }
     public int getTotalCount() {
             return totalCount;
     }
     public void setTotalCount(int totalCount) {
             this.totalCount = totalCount;
     }
     public PageBean(Collection objs, int totalCount, int pageNo, int pageCount) {
             this.objs = objs;
             this.totalCount = totalCount;
             this.pageNo = pageNo;
             this.pageCount = pageCount;
     }
}
