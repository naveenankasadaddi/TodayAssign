class WithLine {
    static void main(String[] args) {
        Integer current=1
        Integer lineNumber=1
        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>()
        ArrayList<Integer> arr=new ArrayList<>()
        new File("/home/naveenmahantesh/groovy/newone/src/Doc3.txt").eachLine {
            line -> current = line.size()
                hm.put(lineNumber,current)
                arr.add(current)
                lineNumber++
        }
        //  println(hm)
        //  println(arr)
        arr.sort ()
        //println(arr)
        arr=arr.reverse()
        //  println(arr)
        Integer l=arr.size()
        Scanner sc =new Scanner(System.in)
        println("Enter the N:")
        Integer N=sc.nextInt()
        Integer Nth=N-1
        Integer ele=arr[Nth]
        Nth=Nth+1
        println(ele)
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            Integer key = mapElement.getKey();
            Integer value = (mapElement.getValue() );
            if(value==ele){
                println("$Nth th largest line is  $key")
                int lineN=1;
                new File("/home/naveenmahantesh/groovy/newone/src/Doc3.txt").eachLine {line ->
                    if (lineN==ele){
                        print(line)
                    }
                    lineN++
                }
                println("This is the line :")
            }
        }




    }

}
