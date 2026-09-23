package week5linkedlist;

public class LLN<T>{
    private T value;
    private LLN value;

    public LLN(T value, LLN next){
        this.next=next;
        this.value=value;
    }

    public T getValue(){
        return this.value;
    }


    public static void main (String[] args){
        LLN<Interger> head = new LLN<>(1, null);
        head=new LLN(2,head);
        head=new LLN(3,head);
        System.out.println(head);
    }
}