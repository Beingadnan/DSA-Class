import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer>stc=new Stack<>();
        // Push Pop Peak Size

    // Push
        stc.push(5);
        stc.push(6);
        stc.push(9);
        stc.push(1);
        System.out.println(stc); //[5,6,9,1]

    // Peak
        System.out.println(stc.peek()); //[1]

    // Pop- Removes and returns the top element of the stack
        int ele=stc.pop();
        System.out.println(ele); // Remove 1 
        System.out.println(stc); // [5,6,9]

    // Size
        System.out.println(stc.size());

    // Search -->It determines whether an object exists in the stack. If the element is found, It returns the position of the element from the top of the stack. Else, it returns -1.

        System.out.println(stc.search(9));  // Peeche se le rha ha or 1 based index  hai 

    // Empty--> It returns true if nothing is on the top of the stack. Else, returns false.
        System.out.println(stc.empty());  //False

    
                            
        // while(!stc.empty()){
        //     System.out.println(stc.pop());
        // }

    // Clear-->It clears All the elements
        // stc.clear();

        int len=stc.size();
        for(int i=0;i<len;i++){
            stc.pop();
        }

        System.out.println(stc.empty()); //--> True
        
        
    
    }
}
