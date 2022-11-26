import java.util.ArrayList;

public class CustomLinkList{

    static class Node {

        String data;
        Node next;

        public Node(String input){
            this.data = input;
            this.next = null;
        }

    }


    static class CLL{

        Node head;

        public boolean isEmpty(){
            return this.head == null;
        }

        public void add(String data){

            Node newNode = new Node(data);

            if(isEmpty()){
                this.head = newNode;
                return;
            }

            newNode.next = this.head;
            this.head = newNode;


        }

        public void addLast(String data){

            Node newNode = new Node(data);

            if(isEmpty()){
                this.head = newNode;
                return;
            }

            Node inputs = this.head;
            Boolean loop = true;

            while(loop){

                if(inputs.next == null){
                    inputs.next = newNode;
                    loop = false;
                    return;
                }

                inputs = inputs.next;

            }


        }

        public ArrayList all(){

            ArrayList<String> allData = new ArrayList<>();

            Node inputs = this.head;

            while(inputs != null){

                allData.add(inputs.data);
                inputs  = inputs.next;

            }


            return allData;

        }

    }

    public static void main(String $args []){

        CLL CLinkList = new CLL();

        CLinkList.add("a");
        CLinkList.add("is");
        CLinkList.add("This");
        CLinkList.addLast("boy");

        System.out.println(CLinkList.all());

    }



}