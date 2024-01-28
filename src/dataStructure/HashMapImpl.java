package dataStructure;

import java.util.LinkedList;

public class HashMapImpl {
   static class HashMap<K, V> {

      private class Node{
         K key;
         V value;

         public Node(K key, V value){
            this.key = key;
            this.value = value;
         }
      }

      // Number of Elements in HashMap
      private int n;
      // NUmber of Buckets in HashMap
      private int N;
      private LinkedList<Node> buckets[];

      /*
       * Private Constructor will initialize HashMap with size of 4
       */
      public HashMap() {
         this.N = 4;
         this.buckets = new LinkedList[4];
         // initializing every bucket with new LinkedList
         for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
         }
      }

      /*
       * Search in HashMap if the key is present
       */
      private int searchInLinkedList(int bucketIndex, K key) {
         LinkedList<Node> bucket = buckets[bucketIndex];

         for (int i = 0; i < bucket.size(); i++) {
            if(bucket.get(i).key == key) {
               return i;
            }
         }
         return -1;
      }

      /*
       * Initializes a HashMap with double the value and adds the old key-value pair to
       * new one if the load factor is greater than 2.
       */
      private void reHash() {
         LinkedList<Node> oldBuckets[] = buckets;
         buckets = new LinkedList[N * 2];
         for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
         }

         for (int i = 0; i < oldBuckets.length; i++) {
            LinkedList<Node> oldBucket = oldBuckets[i];
            for (int j = 0; j < oldBucket.size(); j++) {
               Node oldNode = oldBucket.get(j);
               put(oldNode.key, oldNode.value);
            }
         }
      }

      /*
       * Search if the key is already present in the  bucket
       */
      private int searchBucketIndex(K key) {
         int bucketIndexHash = key.hashCode();
         return Math.abs(bucketIndexHash) % N;
      }

      /*
       * Adds key-value pair to HashMap
       */
      public void put(K key, V value) {
         int bucketIndex = searchBucketIndex(key);
         int dataIndex = searchInLinkedList(bucketIndex, key);

         // if the key is not present in the HashMap adding new key-value pair to LL.
         if(dataIndex == -1) {
            buckets[bucketIndex].add(new Node(key, value));
            n++;
         } else {
            // if the key is present in the HashMap replacing the value for the key
            Node node = buckets[bucketIndex].get(dataIndex);
            node.value = value;
         }

         // Checking the load factor, if the load factor is greater than 2 then rehashing
         double lambda = (double) n/N;
         if(lambda > 2.0) {
            reHash();
         }
      }

      /*
       * Search if the key is present in the HashMap
       */
      public boolean containsKey(K key) {
         int bucketIndex = searchBucketIndex(key);
         int dataIndex = searchInLinkedList(bucketIndex, key);

         if(dataIndex == -1) return false;
         else return true;
      }

      /*
       * Removes the key-value pair from HashMap if the key is present in the HashMap
       */
      public V remove(K key) {
         int bucketIndex = searchBucketIndex(key);
         int dataIndex = searchInLinkedList(bucketIndex, key);

         if(dataIndex == -1) return null;
         else {
            Node node = buckets[bucketIndex].remove(dataIndex);
            n--;
            return node.value;
         }
      }

      /*
       * Return value if the key is present in the HashMap
       */
      public V get(K key) {
         int bucketIndex = searchBucketIndex(key);
         int dataIndex = searchInLinkedList(bucketIndex, key);

         if(dataIndex == -1) return null;
         else {
            Node node = buckets[bucketIndex].get(dataIndex);
            return node.value;
         }
      }

      /*
       * Checks if the HashMap is Empty
       */
      public boolean isEmpty() {
         return n == 0;
      }
   }
}
