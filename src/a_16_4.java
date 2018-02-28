public class a_16_4
{
    /*Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
    list of the last occurrence of that value, or -1 if the value is not found in the list. For example, if a variable list
    stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
    If the call had instead been list.lastIndexOf(3), the method would return –1.*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,1);
        addNodeToList(1,2);
        addNodeToList(2,2);
        addNodeToList(3,3);
        addNodeToList(4,5);
        addNodeToList(5,3);

        System.out.println(lastIndexOf(3));
    }

    //finds the last index of the value appears.
    public Integer lastIndexOf(Integer value)
    {
        //initiate variables
        Integer index = -1;
        Integer counter = 1;

        //the for-loop checks if the value exist, if it does then counter will be add to the index
        for (ListNode current = front; current != null; current = current.next)
        {
            counter++;
            if (value == current.data)
            {
                //rest index, then add counter
                index = -1;
                index += counter;
            }
        }
        return index;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }

}
