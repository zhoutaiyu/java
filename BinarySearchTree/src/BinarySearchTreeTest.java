import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void test() {
		BinarySearchTree s=new BinarySearchTree();
		BinarySearchTree s1=new BinarySearchTree();
		BinarySearchTree s2=new BinarySearchTree();
		s.find(123);
		s.insert(123);
		s.insert(124);
		s.insert(125);
		s.find(123);
		s.find(134);
		s.find(121);
		s1.delete(1);
		s1.insert(1);
		s1.insert(2);
		s1.insert(3);
		//ɾ��������ĳ��Ԫ��
		//s2.delete(1);
		//ɾ��ֻ��ͷ��������ͷ���
		s2.insert(1);
		s2.delete(1);
		//ɾ��û�����Һ��ӵĽ��
		s2.insert(2);
		s2.insert(1);
		s2.insert(3);
		s2.delete(1);
		s2.insert(1);
		s2.delete(3);
		BinarySearchTree s4=new BinarySearchTree();
		BinarySearchTree s5=new BinarySearchTree();
		BinarySearchTree s6=new BinarySearchTree();
		BinarySearchTree s7=new BinarySearchTree();
		BinarySearchTree s8=new BinarySearchTree();
		BinarySearchTree s9=new BinarySearchTree();
		s4.insert(5);
		s4.insert(6);
		s4.insert(7);
		s4.delete(5);
		
		s5.insert(5);
		s5.insert(6);
		s5.insert(7);
		s5.delete(7);
		
		s6.insert(5);
		s6.insert(4);
		s6.delete(5);
		
		s7.insert(5);
		s7.insert(3);
		s7.insert(4);
		s7.delete(3);
		
		s8.insert(5);
		s8.insert(3);
		s8.insert(2);
		s8.delete(3);
		
		//ɾ��ֻ�����ӵĽ��
		s2.insert(3);
		s2.insert(5);
		s2.insert(6);
		s2.insert(2);
		//ɾ�����������ڵĽ��
		s2.delete(7);
		s2.delete(5);
		//ɾ��ֻ�����ӵĽ��
		BinarySearchTree s3=new BinarySearchTree();
		s3.insert(3);
		s3.insert(5);
		s3.insert(4);
		s3.insert(2);
		s3.delete(5);
		//ɾ��������ĳ��Ԫ��
		BinarySearchTree a=new BinarySearchTree();
		a.delete(1);
		//����㣬�ұ߲��գ���߿�
		BinarySearchTree a1=new BinarySearchTree();
		a1.insert(6);
		a1.insert(7);
		a1.delete(7);
		//����㣬�ұ߲��գ���߿�
		BinarySearchTree a2=new BinarySearchTree();
		a2.insert(5);
		a2.insert(3);
		a2.delete(5);
		//ɾ�����е�Ψһ���
		BinarySearchTree a3=new BinarySearchTree();
		a3.insert(5);
		a3.delete(5);
		//ɾ�����и���㣬���Һ��Ӳ���
		BinarySearchTree a4=new BinarySearchTree();
		StringBuilder sb=new StringBuilder();
		Node n = new Node(5);
		a4.insert(6);
		a4.insert(n.data);
		a4.insert(7);
		a4.insert(5);
		a4.delete(6);
		a4.display(n, sb);
		a4.inorderTraverse(n);
	}

}
