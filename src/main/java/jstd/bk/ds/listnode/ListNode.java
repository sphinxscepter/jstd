package jstd.bk.ds.listnode;

public class ListNode {
	
	private Object val;
	private ListNode next;
	
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public ListNode(Object val) {
		this.val = val;
	}

}
