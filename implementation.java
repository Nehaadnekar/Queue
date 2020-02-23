public class QueueArray {
    int arr[];
    int top;
    int beginning;
    public QueueArray(int size)
    {
        arr= new int[size];
        top=-1;
        beginning=-1;
    }


    public boolean isQueueFull()
    {
        if(top==arr.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isQueueEmpty()
    {
        if(beginning==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void enQueue(int data)
    {
        if(isQueueFull())
        {
            System.out.println("Queue overflow");
        }
        else if(isQueueEmpty())
        {
            beginning++;
            top++;
            arr[top]=data;
        }
        else
        {
            top++;
            arr[top]=data;
        }

    }
    public void deQueue(int data)
    {
        if(isQueueEmpty())
        {
            System.out.println("queue underflow");
        }
        else if(top==beginning)
        {
            top=-1;
            beginning=-1;
            System.out.println("only one element got deleted");

        }
        else
        {
            beginning++;
            System.out.println("removed");
        }
    }

    public void peekInQueue()
    {
        if(isQueueEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println(arr[beginning]);
        }
    }
    public void printQueue()
    {
        if(isQueueEmpty())
        {
            System.out.println("element not found");
        }
        else
        {
            for(int i=beginning;i<=top;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public void deleteQueue()
    {
        arr=null;
        System.out.println("Queue is deleted");
    }

}

public class QueueMain {
    public static void main(String[] args) {
        QueueArray obj= new QueueArray(50);
        obj.enQueue(10);
        obj.enQueue(20);
        obj.enQueue(30);

        obj.printQueue();
        obj.deQueue(20);
        obj.peekInQueue();
        obj.deleteQueue();

    }
}
