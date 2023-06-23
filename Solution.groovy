class Solution {
        static void main(String[] args){
            int current,max=0,large=0;
            int Nthline=0,currentline=1;
            new File("/home/naveenmahantesh/groovy/untitled/src/Hello.txt").eachLine {
                line -> current=line.size()
                    if(current>max ||current==max){
                        large=current
                        max=current
                        if(Nthline<currentline){
                            Nthline=currentline
                        }
                    }
                    else{
                        large=max
                    }
                    currentline++
            }
            println("largest line contains :$large characters " )
            println("Nth largeest line : $Nthline")
        }
    }