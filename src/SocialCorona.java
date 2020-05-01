import java.util.Scanner;
public class SocialCorona {
    // a field to refer rear end of queue
    private Nodee rear;
    // a field to refer front end of queue
    private static Nodee front;
    private int size;// total number of elements in the queue
    // constructor
    public SocialCorona() {
        front = null;
        rear = null;
        size = 0;
    }
    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    // a method to add a new element in queue
    public void enqueue(Customer element) {
        Nodee node = new Nodee(element);
        if (front == null) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }

    }

    public void traverse() {
        if (front == null) {
            System.out.println("empty queue");
        } else {
            Nodee temp = front;
            while (temp != null) {
                System.out.print(temp.getData() + "\n");
                temp = temp.getNext();
            }

        }
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("how many times you want to perform this program");
        int t= sc.nextInt();
        while(t>0) {
            SocialCorona obj = new SocialCorona();
            System.out.println("enter total no of customers");
            int s = sc.nextInt();
            for (int i = 0; i < s; i++) {
                System.out.println("---------enter details of " +  " customer " + i+1 +"------------");
                System.out.println(" ");
                Customer co = new Customer();
                System.out.println("enter first name (only alphabets allowed)");
                while (!sc.hasNext("[A-Za-z]+")) {
                    System.out.println("Nope, that's not correct please enter valid name!");
                    sc.next();
                }
                String word = sc.next();
                co.setFirstname(word);
                System.out.println("enter second name (only alphabets allowed)");
                while (!sc.hasNext("[A-Za-z]+")) {
                    System.out.println("Nope, that's not correct please enter valid name!");
                    sc.next();
                }
                String word2 = sc.next();
                co.setSecondname(word2);
                System.out.println("enter gender of customer (male or female)");
                int c = 1;
                while (c > 0) {
                    String g = sc.nextLine();
                    if (g.equalsIgnoreCase("male") || g.equalsIgnoreCase("female")) {
                        co.setGender(g);
                        c--;
                    } else {
                        System.out.println("please enter valid gender (male or female)");
                    }
                }
                System.out.println("enter contact no. (10 digit no starting with 6,7,8,9 are allowed)");
                while (!sc.hasNext("[6789]{1}[0-9]{9}")) {
                    System.out.println("Nope, that's not correct please enter valid contact no!");
                    sc.next();
                }

                String word3 = sc.next();
                co.setMobileNumber(word3);
                sc.nextLine();
                System.out.println("enter location");
                co.setLocation(sc.nextLine());
                System.out.println("tell whether customer is infected or not (yes or no)");
                int p = 1;
                while (p > 0) {
                    String g = sc.nextLine();
                    if (g.equalsIgnoreCase("yes") || g.equalsIgnoreCase("no")) {
                        co.setIsInfected(g);
                        p--;
                    } else {
                        System.out.println("please enter valid answer (only yes or no)");
                    }
                }
                System.out.println("tell whether customer is aware of infection or not (yes or no)");
                int l = 1;
                while (l > 0) {
                    String g = sc.nextLine();
                    if (g.equalsIgnoreCase("yes") || g.equalsIgnoreCase("no")) {
                        co.setIsAwareofInfection(g);
                        l--;
                    } else {
                        System.out.println("please enter valid answer (only yes or no)");
                    }
                }
                System.out.println("tell whether customer is aware of social distancing or not (yes or no)");
                int z = 1;
                while (z > 0) {
                    String g = sc.nextLine();
                    if (g.equalsIgnoreCase("yes") || g.equalsIgnoreCase("no")) {
                        co.setIsAwareOfSocialDistancing(g);
                        z--;
                    } else {
                        System.out.println("please enter valid answer (only yes or no)");
                    }
                }
                if (co.getIsInfected().equalsIgnoreCase("yes") && co.getIsAwareofInfection().equalsIgnoreCase("yes")) {
                    System.out.println("Hospitalized");
                } else if (co.getIsInfected().equalsIgnoreCase("yes")) {
                    System.out.println("Hospitalized");
                } else if (co.getIsAwareofInfection().equalsIgnoreCase("yes")) {
                    System.out.println("Quarantine");
                } else {
                    if (co.getIsAwareOfSocialDistancing().equalsIgnoreCase("yes")) {
                        if (front == null) {
                            obj.enqueue(co);
                        } else {
                            obj.enqueue(null);
                            obj.enqueue(null);
                            obj.enqueue(null);
                            obj.enqueue(co);
                        }
                    } else {
                        obj.enqueue(co);
                    }
                }
            }
            obj.traverse();
            t--;
        }
    }
}
