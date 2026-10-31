// import java.util.*;
// public class hashing {
//     public static void main(String args[]){
//         HashMap<String, Integer> map = new HashMap<>() ;
//         //insertion
//         map.put("india" , 120);
//         map.put("U.S.A" , 120);
//         map.put("china",140);
//         map.put("india",140);
//         System.out.println(map); 

//         // search
//         if(map.containsKey("japan"))
//             {System.out.println("key is present in map") ;}
//         else{
//             System.out.println("key is not present in map");

//         }

//         // get function
//         System.out.print(map.get("china"));
//         System.out.println(map.get("japan"));
//         // interation over map
//         for(Map.Entry<String , Integer>e : map.entrySet()){
//             System.out.println(e.getKey());
//             System.out.println(e.getValue());


//         }

        
//         // another way of iterating over map
//         Set<String> keys = map.keySet();
//         for(String key :keys){
//             System.out.println(key + " "+ map.get(key));
//         }

//         //remove pair
//         map.remove("china");
//         System.out.println(map) ;



//     }

// }






// public class hashing {
//     public static void main(String args[]){
//         int arr[] = {12,15,18,20};
//         // for(int i : arr){
//         //     System.out.println(i);
//         // }

       

//     }
// }

import java.util.*;

public class hashing {

    static class HashMap<k, v> {

        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets

        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {

            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(k key) {

            int bi = key.hashCode();

            return Math.abs(bi) % N;
        }

        // Search key inside linked list
        private int searchInLL(k key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {

                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }
        @SuppressWarnings("unchecked")
        // Rehash
        private void rehash() {

            LinkedList<Node> oldBucket[] = buckets;

            N = N * 2;

            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Put old elements into new buckets
            for (int i = 0; i < oldBucket.length; i++) {

                LinkedList<Node> ll = oldBucket[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    put(node.key, node.value);
                }
            }
        }

        // PUT
        public void put(k key, v value) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {

                // key doesn't exist
                buckets[bi].add(new Node(key, value));

                n++;

            } else {

                // key already exists
                Node data = buckets[bi].get(di);

                data.value = value;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        // CONTAINS KEY
        public boolean containskey(k key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {
                return false;
            }

            return true;
        }


        public v get(k key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {
                return null ;
            }
            else {
                Node data = buckets[bi].get(di);
                return data.value;
            }

            
        }

        // REMOVE
        public v remove(k key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            Node data = buckets[bi].remove(di);

            n--;

            return data.value;
        }
        public ArrayList<k> keySet(){
            ArrayList<k>keys = new ArrayList<>();
            for(int i = 0 ; i<buckets.length ; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0 ; j<ll.size() ; j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys ; 
        }
        public boolean isEmpty(){
            return n == 0 ;
        }
    }
    public static void main(String args[]){
        HashMap<String , Integer>map = new HashMap<>() ;
        map.put("India" , 120);
        map.put("china" , 200);
        map.put("U.S" , 50);
        map.put("japan" , 180);

        ArrayList<String> keys = map.keySet();
        for(int i = 0 ; i<keys.size() ; i++){
            System.out.println(keys.get(i) + " : " + map.get(keys.get(i))); 
        }
        
    }
}