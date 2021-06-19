import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class eem514_1801652_06b  
{
    public static void main(String[] args) throws Throwable 
    {
        Scanner sc = new Scanner(System.in);
        String file11 = sc.nextLine();
        String file22 = sc.nextLine();
        File file1 = new File(file11);
        File file2 = new File(file22);
        
        
        ArrayList<String> alist1 = new ArrayList<>();
        ArrayList<String> alist2 = new ArrayList<>();
        long start1= System.currentTimeMillis();
        alist1 = getwordsArrayList(file1);
        alist2 = getwordsArrayList(file2);
        long end1= System.currentTimeMillis();
        System.out.println("Distinct words in file 1 :"+alist1.size());
        System.out.println("Distinct words in file 2 :"+alist2.size());
        alist1.retainAll(alist2);
        System.out.println("Words common in both files :"+alist1.size());
        
        long start2= System.currentTimeMillis();
        LinkedList<String> llist1 = new LinkedList<>();
        LinkedList<String> llist2 = new LinkedList<>();
        
        llist1= getwordsLinkedList(file1);
        llist2 = getwordsLinkedList(file2);  
        long end2= System.currentTimeMillis();
        
        long start3= System.currentTimeMillis();
        HashSet<String> hash1 = new HashSet<>();
        HashSet<String> hash2 = new HashSet<>();
        hash1= getwordsHashSet(file1);
        hash2 = getwordsHashSet(file2); 
        long end3= System.currentTimeMillis();
        
        long start4= System.currentTimeMillis();
        TreeSet<String> treeSet1 = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet1= getwordsTreeSet(file1);
        treeSet2 = getwordsTreeSet(file2);  
        long end4= System.currentTimeMillis();
        
        System.out.println();
        System.out.println("Computation time in Milliseconds :");
        System.out.println("arrayList : " + (end1-start1));
        System.out.println("LinkedList : " + (end2-start2));
        System.out.println("HashSet : " + (end3-start3));
        System.out.println("TreeSet : " + (end4-start4));
        

    }
    
    public static ArrayList<String> getwordsArrayList(File file) throws Throwable
    {
        ArrayList <String> unique = new ArrayList <>();
        ArrayList<String> removed = new ArrayList<>();
        removed.add("");
        Scanner sc1= new Scanner(file);
        while(sc1.hasNext()) 
        {
            String s= sc1.nextLine();
            s=s.replaceAll("\\W+"," ");
            s=s.toLowerCase();
            String words[]= s.split(" ");    
            for(String e: words) 
            {
                e.trim();
                if(!unique.contains(e))
                unique.add(e);
            }
        }
        unique.removeAll(removed);
        return unique;
        
    }
    
    public static LinkedList<String> getwordsLinkedList(File file) throws Exception
    {
        LinkedList <String> unique = new LinkedList <>();
        LinkedList<String> removed = new LinkedList<>();
        removed.add("");
        Scanner sc1= new Scanner(file);
        while(sc1.hasNext()) 
        {
            String s= sc1.nextLine();
            s=s.replaceAll("\\W+"," ");
            s=s.toLowerCase();
            String words[]= s.split(" ");    
            for(String e: words) 
            {
                e.trim();
                if(!unique.contains(e))
                unique.add(e);
            }
        }
        unique.removeAll(removed);
        return unique;
    }
    
    public static HashSet<String> getwordsHashSet(File file) throws Exception
    {
        HashSet <String> unique = new HashSet <>();
        HashSet <String> removed = new HashSet <>();
        removed.add("");
        Scanner sc1= new Scanner(file);
        while(sc1.hasNext()) 
        {
            String s= sc1.nextLine();

            s=s.replaceAll("\\W+"," ");
            s=s.toLowerCase();
            String words[]= s.split(" ");    
            
            for(String e: words) 
            {
                e.trim();
                unique.add(e);
            }
        }
        unique.removeAll(removed);
        return unique;   
    }
    
    public static TreeSet<String> getwordsTreeSet(File file) throws Throwable
    {
        TreeSet <String> unique = new TreeSet <>();
        TreeSet <String> removed = new TreeSet <>();
        removed.add("");
        Scanner sc1= new Scanner(file);
        while(sc1.hasNext()) 
        {
            String s= sc1.nextLine();

            s=s.replaceAll("\\W+"," ");
            s=s.toLowerCase();
            String words[]= s.split(" ");            
            for(String e: words) 
            {
                e.trim();
                unique.add(e);
            }
        }
        unique.removeAll(removed);
        return unique;   
    }

}
