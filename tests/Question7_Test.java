package tests;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class Question7_Test {
    public static void main(String[] args) {
        try {
            Class<?> question7Class = Class.forName("Question7_RotateLinkedList");
            Class<?> listNodeClass = Class.forName("Question7_RotateLinkedList$ListNode");
            
            Constructor<?> ctor = listNodeClass.getDeclaredConstructor(String.class);
            ctor.setAccessible(true);
            
            Object head = ctor.newInstance("ID_A01");
            Object node2 = ctor.newInstance("ID_A02");
            Object node3 = ctor.newInstance("ID_A03");
            Object node4 = ctor.newInstance("ID_A04");
            Object node5 = ctor.newInstance("ID_A05");
            Object node6 = ctor.newInstance("ID_A06");
            
            var nextField = listNodeClass.getDeclaredField("next");
            nextField.setAccessible(true);

            nextField.set(head, node2);
            nextField.set(node2, node3);
            nextField.set(node3, node4);
            nextField.set(node4, node5);
            nextField.set(node5, node6);
            
            Method rotateRightMethod = question7Class.getMethod("rotateRight", listNodeClass, int.class);
            Object rotated = rotateRightMethod.invoke(null, head, 2);
            
            Method printListMethod = question7Class.getMethod("printList", listNodeClass);
            printListMethod.invoke(null, rotated);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
