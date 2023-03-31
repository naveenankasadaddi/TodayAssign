import javax.print.attribute.IntegerSyntax

class Another {
    static void main(String[] args) {
        Integer current = 1
        Integer lineNumber=1
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        new File("/home/naveenmahantesh/groovy/untitled/src/Hello.txt").eachLine {

            line -> current=line.size()
                hm.put(lineNumber,current)
                a.add(current)
                lineNumber++
        }

        a.sort()
        InputStreamReader is=new InputStreamReader(System.in)
        BufferedReader bf=new BufferedReader(is)

        println("Enter the value of N :")
        Integer N=Integer.parseInt(bf.readLine())
        Integer l=a.size()-(N+1)
//        println(a)
//        println(hm)
        print(hm.get(l))

        
        
}
}
