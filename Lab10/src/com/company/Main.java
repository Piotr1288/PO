package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
                Fill fill = new Fill();
       Queue<Command> c = fill.fillQueue();
        ThirdClass thirdClass = new ThirdClass();
        thirdClass.printQueue(c);


        List<Kangur> kangury = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            kangury.add(new Kangur(i));
        }

        for(int i = 0; i < kangury.size(); i++) {
            kangury.get(i).skok();
        }

        Iterator<Kangur> i = kangury.listIterator();
        while(i.hasNext()){
            i.next().skok();
        }

        Map<String, Kangur> kangurMap = new HashMap<>();
        int j = 0;
        for (Kangur k : kangury) {
            kangurMap.put("Jan" + j, k);
            j++;
        }
        kangurMap.put("Ala0", new Kangur(1111));

        Iterator<String> iMap = kangurMap.keySet().iterator();
        while(iMap.hasNext()) {
            String name = iMap.next();
            System.out.println("imie " + name);
            kangurMap.get(name).skok();
        }

        TreeMap<String, Kangur> treeKangur = new TreeMap<>(kangurMap);
        LinkedHashMap<String, Kangur> kangurLinkedHashMap = new LinkedHashMap<>();

       for(Map.Entry<String, Kangur> entry : treeKangur.entrySet()) {
            String name = entry.getKey();
            Kangur kangur = entry.getValue();
            kangurLinkedHashMap.put(name, kangur);
        }



        Stos<String> stos = new Stos<>();
        String m = "+B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        String[] sTab = m.split("");

        for (int x = 0; x < sTab.length; x++) {
            if(sTab[x].equals("+")) {
                stos.push(sTab[x+1]);
            }
            if(sTab[x].equals("-")) {
                System.out.print(stos.pop());
            }
        }
        System.out.println();


        String[] products = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        Stos<String> s = new Stos<>();
        Random r = new Random();
        int n = r.nextInt(15)+1;
        System.out.println(n);
        for(int y = 0; y < n; y++){
            if(y == products.length) {
                y = 0;
            }
            s.push(products[y]);
        }

        Queue<String> k = new LinkedList<>();
        for(int z = 0; z < 10; z++) {
            if(z == 7) {
                k.add("ja");
            }
            k.add(i+"o");
        }

        while(!k.isEmpty()) {
            if(k.peek().equals("ja")) {
                while(!s.isEmpty()){
                    System.out.print(s.pop());
                }
                k.poll();
            }else {
                k.poll();
            }
        }


    }

}
